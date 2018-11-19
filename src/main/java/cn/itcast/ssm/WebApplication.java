//package cn.itcast.ssm;
//
//import cn.itcast.ssm.netty.WebServer;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import javax.annotation.Resource;
//
///**
// * @Author: LiuYang
// * @Description:
// * @Date: Created in 16:53 2018/11/12
// * Modified By:
// */
//@SpringBootApplication
//public class WebApplication implements CommandLineRunner {
//    @Resource
//    private WebServer webServer;
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(WebApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("88888888");
//        webServer.run(8089);
//    }
//}
//
