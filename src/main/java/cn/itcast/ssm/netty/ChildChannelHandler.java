package cn.itcast.ssm.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.springframework.stereotype.Component;


/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:00 2018/10/24
 * Modified By:
 */
@Component
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    @Override
    public void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new DiscardServerHandler());
    }


}
