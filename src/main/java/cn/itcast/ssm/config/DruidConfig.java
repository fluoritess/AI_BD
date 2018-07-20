package cn.itcast.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author tyh
 * @Package cn.itcast.ssm.config
 * @Description: 配置Druid数据源
 * @date 18-7-19 下午4:11
 */
@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    @Qualifier("druidDataSource")
    public DataSource druidDateSource(){
//        System.out.println("配置数据源");
        return new DruidDataSource();
    }

}
