package cn.itcast.ssm.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author tyh
 * @Package cn.itcast.ssm.filter
 * @Description:
 * @date 2018/5/18 11:01
 */
@Order(2)
@WebFilter(filterName = "/filter1_Authority",urlPatterns = "/html/*")
public class filter1_Authority implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("-----------进入权限拦截器-----------");
        filterChain.doFilter(servletRequest,servletResponse);
        
        
    }

    @Override
    public void destroy() {

    }
}
