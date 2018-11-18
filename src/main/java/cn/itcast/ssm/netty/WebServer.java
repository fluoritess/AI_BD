package cn.itcast.ssm.netty;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 17:02 2018/11/12
 * Modified By:
 */
@Component
public class WebServer {
    private static Map<String, Channel> map = new ConcurrentHashMap<String, Channel>();
    private static Map<String, byte[]> messageMap = new ConcurrentHashMap<String, byte[]>();
    EventLoopGroup boosGroup = new NioEventLoopGroup(1);
    EventLoopGroup workGroup = new NioEventLoopGroup();
        public void run(int port){

            System.out.println("准备运行端口：" + port);
            try {
                ServerBootstrap bootstrap = new ServerBootstrap();
                bootstrap.group(boosGroup, workGroup)
                .channel(NioServerSocketChannel.class)
//                        .option(ChannelOption.SO_BACKLOG, 100)
                        .option(ChannelOption.SO_KEEPALIVE, true)
//                        .option(ChannelOption.TCP_NODELAY, true)
                        .childHandler(new WebSocketServerInitializer());

                System.out.println("服务器开启待客户端链接.....");
                Channel ch =  bootstrap.bind( 8086).sync().channel();
               ch.closeFuture().sync();

            } catch (Exception e) {
                e.printStackTrace();

            }finally{
                boosGroup.shutdownGracefully();
                workGroup.shutdownGracefully();
            }

        }
//    //执行之后关闭
//    @PreDestroy
//    public void close(){
//        boosGroup.shutdownGracefully();
//        workGroup.shutdownGracefully();
//
//
//    }
    public static Map<String, Channel> getMap() {
        return map;
    }

    public static void setMap(Map<String, Channel> map) {
        WebServer.map = map;
    }
    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    /**
     * @return the messageMap
     */
    public static Map<String, byte[]> getMessageMap() {
        return messageMap;
    }

    /**
     * @param messageMap the messageMap to set
     */
    public static void setMessageMap(Map<String, byte[]> messageMap) {
        WebServer.messageMap = messageMap;
    }



}
