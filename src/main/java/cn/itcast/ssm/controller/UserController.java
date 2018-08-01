package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.UserInf;
import cn.itcast.ssm.service.UserService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.EncryptUtil;
import cn.itcast.ssm.util.R;
import cn.itcast.ssm.util.RegexUtil;
import cn.itcast.ssm.util.ShiroUtils;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.controller
 * @Description: userController
 * @date 2018/5/9 15:12
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Producer producer;

    /**
     * 生成图形验证码
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @ArchivesLog(operationName = "生成验证码",operationType = "用户基本操作")
    @GetMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session（注意：如果没有securityManager配置，则暂时无法工作，测试时先注释掉）
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        out.flush();
    }

    /**
     * 发送验证码2
     * @param session session2
     * 发送验证码2
     * @param map2 手机号
     * @return 是否发送成功
     */
    @ArchivesLog(operationName = "发送验证码",operationType = "用户基本操作")
    @ResponseBody
    @RequestMapping(value = "/sendCode.action",method = RequestMethod.POST)
    public Map<String ,Object> sendCode(HttpSession session, @RequestBody Map<String,Object> map2){

        if(map2.get("tel")!=null&&!map2.get("tel").equals("")&&RegexUtil.checkPhone(String.valueOf(map2.get("tel")))){
            String tel=String.valueOf(map2.get("tel"));
            System.out.println("手机号为:"+map2.get("tel"));
            if(userService.findId(tel)==null){
                String[] str={"1","2","3","4","5","6","7","8","9","0"};
                String s="";
                for (int j = 0; j <6 ; j++) {
                    s+=str[(int)(Math.random()*(str.length))];
                }
                System.out.println(s);
                session.setAttribute("code",s);
                return R.ok("发送验证码成功");
            }else{
                return  R.error("本号码以及存在");
            }
        }else{

            return  R.error("电话号码错误");
        }
    }

    /**
     * 用户注册
     * @param data
     * @param session
     * @return
     */
    @ArchivesLog(operationName = "用户注册",operationType = "写入信息")
    @RequestMapping(value = "/register.action",method = RequestMethod.POST)
    public Map<String,Object> register(@RequestBody Map<String,Object> data, HttpSession session){
        if(session.getAttribute("code")!=null){
            if(data.get("code").equals(session.getAttribute("code"))){
                if(data.get("userid")!=null&&data.get("password")!=null&&data.get("pass")!=null&&data.get("tel")!=null){
                    if(data.get("password").equals(data.get("pass"))){
                        UserInf user=new UserInf();
                        user.setUserid(String.valueOf(data.get("userid")));
                        user.setPassword(String.valueOf(data.get("password")));
                        user.setTel(String.valueOf(data.get("tel")));
                        if(RegexUtil.checkPassword(user.getPassword())){
                            user.setPassword(EncryptUtil.MD5ReEncrpt(user.getPassword()));
                            user.setRegtime(new Date());
                            if(userService.register(user)){
                                return R.ok("注册成功！");
                            }
                        }else{
                            return R.error("密码不符合规范!");
                        }
                    }else {
                        return R.error("两次密码不相同!");
                    }
                }else{
                    return R.error("信息不完整!");
                }
            }else{
                return R.error("验证码错误!");
            }
        }else{
            return R.error("请验证手机!");
        }
        return R.error();
    }

    /**
     * 修改信息
     * @param map 数据
     * @param session session
     * @return 值
     * @throws Exception 类型转换错误
     */
    @ArchivesLog(operationName = "用户修改信息",operationType = "更新信息")
    @RequestMapping(value = "/UserDate.action", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> UserDate(@RequestBody Map<String, Object> map, HttpSession session) throws Exception {
        String whatupdate = (String) map.get("title");
        UserInf user=(UserInf) session.getAttribute("user");
        String telph = user.getTel();
        if (whatupdate!=null&&whatupdate.equals("updateDate")) {
            Map<String, Object> map2 = (Map<String, Object>) map.get("data");
            String email = (String) map2.get("email");
            if(RegexUtil.checkEmail(email)){
                String nic = (String) map2.get("nic");
                if(nic.length()<=6){
                    String name = (String) map2.get("name");
                    if(RegexUtil.checkUserName(name)){
                        userService.uadatedate(  name, nic,email ,telph);
                        user.setEmail(email);
                        user.setName(name);
                        user.setUserid(nic);
                        return R.ok("更新成功");
                    }
                }
            }
        } else if (whatupdate!=null&&whatupdate.equals("updatePwd")) {
            Map<String, Object> map2 = (Map<String, Object>) map.get("data");
            String oldPwd = (String) map2.get("oldPass");


            if (!((UserInf)session.getAttribute("user")).getPassword().equals(EncryptUtil.MD5ReEncrpt(oldPwd))) {
                System.out.println("密码错误");
                return R.error("原始密码错误");
            } else {
                System.out.println("密码正确");
                Map<String, Object> map4 = (Map<String, Object>) map.get("data");
                String newpass = (String) map4.get("newpass");
                if(RegexUtil.checkPassword(newpass)){

                    userService.updatepw(EncryptUtil.MD5ReEncrpt(newpass),telph);
                    ((UserInf)session.getAttribute("user")).setPassword(EncryptUtil.MD5ReEncrpt(newpass));
                    return R.ok("修改成功");
                }else{

                    return R.error("修改失败");
                }
            }
        }
        else if(whatupdate != null&&whatupdate.equals("updateRole")){
        	 int role =(Integer)map.get("role");
            int id =(Integer) map.get("id");
        	 userService.addroleDist(id,role);
        	 Map<String, Object> map2 = new HashMap<>();
        	 map2.put("indexData", "true");
        	 return R.ok("提交角色成功");



		}

        return R.error("错误值");
    }

    /**
     * 添加用户信息
     * @param session
     * @param request
     * @param response
     * @throws Exception
     */
    @ArchivesLog(operationName = "用户补全信息",operationType = "更新信息")
    @RequestMapping(value = "/addData.action", method = RequestMethod.POST)
    public  String addData( HttpSession session,HttpServletRequest request,HttpServletResponse response) throws Exception {
    	response.setHeader("content-type", "text/html;charset=UTF-8"); 
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
        String email =request.getParameter("email");
        if(RegexUtil.checkEmail(email)){
            String name =request.getParameter("name");
            if(RegexUtil.checkUserName(name)){
                String idnumber =request.getParameter("idnumber");
                if(RegexUtil.checkIdNumber(idnumber)){
                    String roleTemp = request.getParameter("role");
                    int role = Integer.valueOf(roleTemp.substring(roleTemp.lastIndexOf(":")+1)).intValue();
                    System.out.println(role);
                    UserInf userInf=(UserInf)session.getAttribute("user");
                    String telph = userInf.getTel();
                    userInf.setIdnumber(idnumber);
                    userInf.setEmail(email);
                    userInf.setName(name);
                    int id = userInf.getId();
                    userService.adddata( email,name,idnumber,telph);
                    userService.addroleDist(id, role);
                }
            }
        }
//       	request.getRequestDispatcher("/userindex").forward(request, response);
   //     response.sendRedirect(request.getContextPath() + "userindex");
        return  "redirect:#/userindex";
    }
    
    /**
     * 获取用户自己信息
     * @param session
     * @return
     * @throws Exception
     */
    @ArchivesLog(operationName = "用户获取自己信息",operationType = "查询信息")
    @RequestMapping(value = "/getUserDate.action", method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> getUserDate( HttpSession session) throws Exception{
        UserInf user=(UserInf)session.getAttribute("user");
        Map<String, Object> userData = new HashMap<>();
        userData.put("id", user.getId());
        userData.put("nic", user.getUserid());
        userData.put("name", user.getName());
        userData.put("tel", user.getTel());
        userData.put("email", user.getEmail());
        userData.put("idnumber", user.getIdnumber());
        userData.put("regtime",user.getRegtime().getTime());
//        if(user.getState().equals("2")){
//            userData.put("role","未审核");
//        }
//        if(user.getState().equals("3")){
//
//            userData.put("role",user.getState());
//        }
//        if(user.getState().equals("4")){
//            userData.put("role","已冻结");
//
//        }
        if(user.getEmail()==null||user.getIdnumber()==null){

            userData.put("indexData",false);

        }else {

            userData.put("indexData",true);
        }
        return  R.ok(userData);
    }

    @ResponseBody
    @ArchivesLog(operationName = "用户登录",operationType = "查询信息")
    @RequestMapping("/login.action" )
    public R login(@RequestBody Map<String,String > map,HttpSession session){
        System.out.println("进入登录...");
        String username=map.get("id");
        String password=map.get("pass");
        String code=map.get("code");

        String kaptcha=ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
        if(!kaptcha.equalsIgnoreCase(code)){
            return R.error("验证码不正确");
        }
        try {
            Subject subject=ShiroUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(username,EncryptUtil.MD5ReEncrpt(password));
            subject.login(token);
        } catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return R.error(e.getMessage());
        }catch (LockedAccountException e) {
            return R.error(e.getMessage());
        }catch (AuthenticationException e) {
            return R.error("账户验证失败");
        }
        session.setAttribute("user",ShiroUtils.getUserEntity());
        session.setAttribute("id",ShiroUtils.getUserEntity().getId());
        Map<String,Object> msg=new HashMap<>();
        msg.put("code","0");
        msg.put("id",ShiroUtils.getUserEntity().getId());
        return R.ok(msg);
    }
}
