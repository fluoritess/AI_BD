package cn.itcast.ssm.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 19:50 2018/11/14
 * Modified By:
 */
public class WebSocketServerInitializer extends ChannelInitializer<Channel> {

    private final ChannelGroup channelGroup;

    public WebSocketServerInitializer(ChannelGroup channelGroup) {
        this.channelGroup = channelGroup;
    }

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline().addLast("bytesDecoder", new ByteArrayDecoder());
        // Encoder
        //ch.pipeline().addLast("frameEncoder", new LengthFieldPrepender(4));
        ch.pipeline().addLast("bytesEncoder", new ByteArrayEncoder());
        ch.pipeline().addLast(
                new HttpServerCodec(),
                new HttpObjectAggregator(64 * 1024),
                new WebSocketServerProtocolHandler("/app/websocket"),
                new TextWebSocketFrameHandler(channelGroup));
        ch.pipeline().addLast(new OutBoundHandler());
        ch.pipeline().addLast(new IdleStateHandler(0,0,300), new InBoundHandler());
    }
}
