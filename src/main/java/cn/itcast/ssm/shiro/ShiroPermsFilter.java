package cn.itcast.ssm.shiro;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.shiro
 * @Description:
 * @date 18-7-21 下午12:53
 */
public class ShiroPermsFilter extends PermissionsAuthorizationFilter {
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String requestedWith = httpServletRequest.getHeader("X-Requested-With");
        if (StringUtils.isNotEmpty(requestedWith) &&
                StringUtils.equals(requestedWith, "XMLHttpRequest")) {//如果是ajax返回指定格式数据
            Map<String,Object> map = new HashMap<>();
            map.put("code", "-999");
            map.put("message", "权限不足");
            httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setContentType("application/json");
            httpServletResponse.getWriter().write(JSONObject.toJSONString(map));
        } else {//如果是普通请求进行重定向
            System.out.println("资源拦截器");
            httpServletResponse.sendRedirect("/");
        }
        return false;
    }
}
