package cn.itcast.ssm;

import cn.itcast.ssm.netty.DiscardServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:06 2018/10/24
 * Modified By:
 */
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Resource
    private DiscardServer discardServer;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        discardServer.run(8088);
    }
}
