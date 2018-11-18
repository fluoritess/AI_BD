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
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import io.netty.handler.timeout.ReadTimeoutHandler;
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
//        ch.pipeline().addLast(new ReadTimeoutHandler(586));
//        ch.pipeline().addLast("bytesEncoder", new ByteArrayEncoder());
        // 设置30秒没有读到数据，则触发一个READER_IDLE事件。
// pipeline.addLast(new IdleStateHandler(30, 0, 0));
// HttpServerCodec：将请求和应答消息解码为HTTP消息
//        ch.pipeline().addLast("http-codec",new HttpServerCodec());
// HttpObjectAggregator：将HTTP消息的多个部分合成一条完整的HTTP消息
//        ch.pipeline().addLast("aggregator",new HttpObjectAggregator(65536));
//// ChunkedWriteHandler：向客户端发送HTML5文件
//        ch.pipeline().addLast("http-chunked",new ChunkedWriteHandler());
//        ch.pipeline().addLast(new HttpServerCodec());
//        ch.pipeline().addLast(new HttpObjectAggregator(8096));
//        ch.pipeline().addLast(new WebSocketServerProtocolHandler("/app/websocket"));
        ch.pipeline().addLast("http-codec",
                new HttpServerCodec());

        ch.pipeline().addLast("aggregator",
                new HttpObjectAggregator(65536));
        ch.pipeline().addLast(new WebSocketServerProtocolHandler("/app/websocket"));
        ch.pipeline().addLast("http-chunked",
                new ChunkedWriteHandler());

//        ch.pipeline().addLast(new OutBoundHandler());
//        ch.pipeline().addLast(new IdleStateHandler(0,0,200));
        ch.pipeline().addLast(new InBoundHandler());

       }
}
