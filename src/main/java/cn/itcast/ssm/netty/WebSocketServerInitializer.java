package cn.itcast.ssm.netty;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.concurrent.ImmediateEventExecutor;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 19:50 2018/11/14
 * Modified By:
 */
public class WebSocketServerInitializer extends ChannelInitializer<SocketChannel> {

    private final ChannelGroup channelGroup = new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast("bytesDecoder", new ByteArrayDecoder());
        // Encoder
        //ch.pipeline().addLast("frameEncoder", new LengthFieldPrepender(4));
        ch.pipeline().addLast("bytesEncoder", new ByteArrayEncoder());
        ch.pipeline().addLast(new HttpServerCodec());
        ch.pipeline().addLast(new HttpObjectAggregator(8096));
        ch.pipeline().addLast(new WebSocketServerProtocolHandler("/app/websocket"));
        ch.pipeline().addLast(new IdleStateHandler(10,5,20));
        ch.pipeline().addLast(  new InBoundHandler(channelGroup));
        ch.pipeline().addLast(new OutBoundHandler());
       }
}
