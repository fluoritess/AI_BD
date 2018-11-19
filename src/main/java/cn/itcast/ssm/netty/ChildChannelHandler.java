package cn.itcast.ssm.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.concurrent.ImmediateEventExecutor;
import org.springframework.stereotype.Component;


/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:00 2018/10/24
 * Modified By:
 */
@Component
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    private final ChannelGroup channelGroup = new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
    @Override
    public void initChannel(SocketChannel socketChannel) throws Exception {

        socketChannel.pipeline().addLast(new FixedLengthFrameDecoder(48));
        socketChannel.pipeline().addLast(new StringDecoder());
        socketChannel.pipeline().addLast(new DiscardServerHandler());

    }


}
