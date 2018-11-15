package cn.itcast.ssm.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;


/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 22:26 2018/11/13
 * Modified By:
 */

public class TextWebSocketFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    public  static TextWebSocketFrameHandler textWebSocketFrameHandler;
    public  ChannelGroup channelGroup;



    public TextWebSocketFrameHandler(ChannelGroup channelGroup) {
        this.channelGroup = channelGroup;
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        channelGroup.remove(ctx.channel());
        ctx.channel().close();
        System.out.println("失活");
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        channelGroup.remove(ctx.channel());
        ctx.channel().close();
        cause.printStackTrace();
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof WebSocketServerProtocolHandler.ServerHandshakeStateEvent) {
            //完成握手
            System.out.println("握手完成");
            channelGroup.add(ctx.channel());
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }


    @Override
    protected void messageReceived(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        System.out.println(msg.text());
        System.out.println("收到消息,可以推送消息了");
        //推送消息
        WebServer.getMap().remove(InBoundHandler.getIPString(ctx));
        WebServer.getMap().put(msg.text(), ctx.channel());
        channelGroup.writeAndFlush(msg.retain());
    }



}
