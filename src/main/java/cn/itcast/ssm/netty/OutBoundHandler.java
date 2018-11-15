package cn.itcast.ssm.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.*;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 21:07 2018/11/14
 * Modified By:
 */
public class OutBoundHandler  extends ChannelOutboundHandlerAdapter {



    @Override
    public void write(ChannelHandlerContext ctx, Object msg,
                      ChannelPromise promise) throws Exception {
        ByteBuf buf1 = (ByteBuf) msg;
        byte[] req = new byte[buf1.readableBytes()];
        buf1.readBytes(req);

        String body = new String (req,"utf-8");
        System.out.println("Server"+body);
        if (msg instanceof byte[]) {
            byte[] bytesWrite = (byte[])msg;
            ByteBuf buf = ctx.alloc().buffer(bytesWrite.length);
//            logger.info("向设备下发的信息为："+TCPServerNetty.bytesToHexString(bytesWrite));

            buf.writeBytes(bytesWrite);
            ctx.writeAndFlush(buf).addListener(new ChannelFutureListener(){
                @Override
                public void operationComplete(ChannelFuture future)
                        throws Exception {
//                    logger.info("下发成功！");
                }
            });
        }
    }

}
