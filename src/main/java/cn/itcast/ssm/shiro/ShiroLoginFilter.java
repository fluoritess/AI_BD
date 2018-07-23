package cn.itcast.ssm.shiro;

import cn.itcast.ssm.po.UserInf;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.servlet.AdviceFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.shiro
 * @Description:
 * @date 18-7-21 下午12:31
 */
public class ShiroLoginFilter extends AdviceFilter {
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        UserInf sysUser = (UserInf) httpServletRequest.getSession().getAttribute("user");
        if (null == sysUser && !StringUtils.contains(httpServletRequest.getRequestURI(), "/login.action")) {
            String requestedWith = httpServletRequest.getHeader("X-Requested-With");
            if (StringUtils.isNotEmpty(requestedWith) && StringUtils.equals(requestedWith, "XMLHttpRequest")) {//如果是ajax返回指定数据
                Map<String,Object> map = new HashMap<>();
                map.put("code", "-999");
                map.put("message", "未登录");
                httpServletResponse.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                httpServletResponse.setCharacterEncoding("UTF-8");
                httpServletResponse.setContentType("application/json");
                httpServletResponse.getWriter().write(JSONObject.toJSONString(map));
                return false;
            } else {//不是ajax进行重定向处理
                System.out.println("登录拦截器");
                httpServletResponse.sendRedirect("/AI_BD/");
                return false;
            }
        }
        return true;
    }
}
