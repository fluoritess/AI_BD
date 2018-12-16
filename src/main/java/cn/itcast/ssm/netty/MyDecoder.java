package cn.itcast.ssm.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 21:14 2018/12/10
 * Modified By:
 */

public class MyDecoder extends MessageToMessageDecoder<ByteBuf> {
    private final Charset charset;

    public MyDecoder() {
        this(Charset.defaultCharset());
    }

    public MyDecoder(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        } else {
            this.charset = charset;
        }
    }
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
//        int length = byteBuf.readableBytes();//得到可读字节数
//        byte[] array = new byte[length];    //分配一个具有length大小的数组
//        byteBuf.getBytes(byteBuf.readerIndex(), array); //将缓冲区中的数据拷贝到这个数组中
//        while (byteBuf.isReadable()) {
//            System.out.print(byteBuf.readByte());
//        }
//        System.out.println(length);
//        System.out.println(array);
//        ByteBufToBytes read = new ByteBufToBytes();
//        Object obj = ByteObjConverter.byteToObject(read.read(byteBuf));
//        System.out.println(obj);
//        list.add(obj);
//        System.out.println("====>"+byteBuf.toString());
//        list.add(byteBuf.array());



        for(int i=0;i<byteBuf.capacity();i++){
            System.out.println(byteBuf.getByte(i));
        }

        System.out.println("====>"+byteBuf.toString(this.charset));


    }
}
