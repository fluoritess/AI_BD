package cn.itcast.ssm.config;


import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @author tyh
 * @Package cn.itcast.ssm.config
 * @Description:
 * @date 18-7-19 下午5:07
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams={
                @WebInitParam(name="loginUsername",value="admin"),// 用户名
                @WebInitParam(name="loginPassword",value="admin"),// 密码
                @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
        })
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1L;
}
