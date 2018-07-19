package cn.itcast.ssm.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tyh
 * @Package cn.itcast.ssm.filter
 * @Description:
 * @date 2018/5/17 21:16
 */
@Order(1)
@WebFilter(filterName = "/filter0_Login",urlPatterns = "/html/*")
public class filter0_Login implements Filter {

    private static List<String> pattenURL=new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        pattenURL.add("index.html");//登录html
        pattenURL.add("newuser.html");//注册html
        pattenURL.add("login.action");//登录方法
        pattenURL.add("register.action");//注册方法
        pattenURL.add("sendCode.action");//发送验证码方法
        pattenURL.add("success.html");//成功提示
        pattenURL.add("css");//css
        pattenURL.add("image");//image
        pattenURL.add("js");//js
        pattenURL.add("bootstrap");//bootstrap
        pattenURL.add("angular");//angular
        pattenURL.add("json");//json
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request=(HttpServletRequest)servletRequest;
//        System.out.println("-----------进入登录拦截器-----------");
        HttpSession session=request.getSession();
        //取得访问路径
        String url = request.getRequestURI();
        //放行忽略路径
        for (String urlStr : pattenURL) {
            if(url.contains(urlStr)){
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }
        //未登录
        if(session.getAttribute("user")==null){
            String type=request.getHeader("X-Requested-With");
            String path = request.getContextPath();
            String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
            // 转发
            if (type!=null&&type.equalsIgnoreCase("XMLHttpRequest")) {
                // ajax请求
                System.out.println("ajax请求被拦截,返回页面...");
                response.setHeader("SESSIONSTATUS", "TIMEOUT");
                response.setHeader("CONTEXTPATH", basePath+"index.html");
                response.setStatus(HttpServletResponse.SC_FORBIDDEN);//403 禁止
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                System.out.println("正常请求被拦截，返回页面...");
                response.sendRedirect(basePath+"index.html");
//                filterChain.doFilter(request, response);
            }
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
