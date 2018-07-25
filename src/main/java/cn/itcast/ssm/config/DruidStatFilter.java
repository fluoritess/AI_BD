package cn.itcast.ssm.config;


import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author tyh
 * @Package cn.itcast.ssm.config
 * @Description:
 * @date 18-7-19 下午5:04
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,*.json")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {
}
