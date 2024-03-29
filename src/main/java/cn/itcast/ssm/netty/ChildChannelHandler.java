package cn.itcast.ssm.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestEncoder;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.concurrent.ImmediateEventExecutor;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.List;


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

       socketChannel.pipeline().addLast(new FixedLengthFrameDecoder(54));
        socketChannel.pipeline().addLast(new MyDecoder());
        socketChannel.pipeline().addLast(new DiscardServerHandler());

    }


}
