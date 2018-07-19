package cn.itcast.ssm.filter;

import cn.itcast.ssm.util.SqlValidate;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author tyh
 * @Package cn.itcast.ssm.filter
 * @Description:
 * @date 2018/6/12 0:19
 */
//@WebFilter(filterName = "/filter2_SqlInjection",urlPatterns = "/html/*")
public class filter2_SqlInjection implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
//        System.out.println("-----------进入防sql注入拦截器-----------");
        //获得所有请求参数名
        Enumeration<String> params = request.getParameterNames();
        String sql = "";
        while (params.hasMoreElements()) {
            //得到参数名
            String name = params.nextElement().toString();
            //得到参数对应值
            String[] value = request.getParameterValues(name);
            for (int i = 0; i < value.length; i++) {
                sql = sql + value[i];
            }
        }
        if (SqlValidate.isValidate(sql)) {
            String errorMessage = "请求附带非法字符，拒绝访问！";
            request.getSession().setAttribute("ErrorMessage", errorMessage);
            response.sendRedirect(request.getContextPath() + "/WEB-INF/error.html");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
