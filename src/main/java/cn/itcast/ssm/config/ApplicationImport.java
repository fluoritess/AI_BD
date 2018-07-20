package cn.itcast.ssm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author tyh
 * @Package cn.itcast.ssm.config
 * @Description:
 * @date 18-7-19 下午5:16
 */
@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class ApplicationImport {

}
