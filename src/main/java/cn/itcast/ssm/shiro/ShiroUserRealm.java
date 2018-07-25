package cn.itcast.ssm.shiro;

import cn.itcast.ssm.po.UserInf;
import cn.itcast.ssm.service.impl.UserServiceImpl;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author tyh
 * @Package cn.itcast.ssm.util
 * @Description: 用户自定义Realm
 * @date 18-7-20 下午3:30
 */
@Component
public class ShiroUserRealm extends AuthorizingRealm {

    @Autowired
    UserServiceImpl userService;
    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权...");

        UserInf user = (UserInf) principals.getPrimaryPrincipal();

        //用户权限列表
        Set<String> permsSet = userService.getUserPermissions(user);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("用户认证...");
        //用户信息获取
        String userNameInput=(String)token.getPrincipal();
        String passwordInput=new String((char[])token.getCredentials());
        //查询用户信息
        UserInf userInf=userService.findId(userNameInput);
        //用户不存在
        if(userInf==null){
            throw new UnknownAccountException("用户名或者密码错误！");
        }
        //密码错误
        if(!passwordInput.equals(userInf.getPassword())){
            throw new IncorrectCredentialsException("用户名或者密码错误！");
        }
        //账号被注销
        if(userInf.getState().equals("0")){
            throw new LockedAccountException("账户已被注销！");
        }
        System.out.println("用户登陆成功!");
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userInf, userInf.getPassword(), getName());
        return info;
    }
}
