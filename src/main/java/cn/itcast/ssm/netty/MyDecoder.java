package cn.itcast.ssm.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
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
    public static float byte2float(byte[] b, int index) {
        int l;
        l = b[index + 0];
        l &= 0xff;
        l |= ((long) b[index + 1] << 8);
        l &= 0xffff;
        l |= ((long) b[index + 2] << 16);
        l &= 0xffffff;
        l |= ((long) b[index + 3] << 24);
        return Float.intBitsToFloat(l);
    }
    public static byte[] float2byte(float f) {

           // 把float转换为byte[]
           int fbit = Float.floatToIntBits(f);

             byte[] b = new byte[4];
            for (int i = 0; i < 4; i++) {
                     b[i] = (byte) (fbit >> (24 - i * 8));
                    }

               // 翻转数组
                int len = b.length;
                // 建立一个与源数组元素类型相同的数组
                 byte[] dest = new byte[len];
                 // 为了防止修改源数组，将源数组拷贝一份副本
                 System.arraycopy(b, 0, dest, 0, len);
               byte temp;
               // 将顺位第i个与倒数第i个交换
               for (int i = 0; i < len / 2; ++i) {
                       temp = dest[i];
                        dest[i] = dest[len - i - 1];
                        dest[len - i - 1] = temp;
                    }

                 return dest;

           }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
//        byteBuf.capacity();
        List<Object> list1 = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        byte[] req = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(req);
      list1.add(String.valueOf(req[0]));
      list1.add(""+(char)((int)req[2])+(char)((int)req[3])+(char)((int)req[4])+(char)((int)req[5]));
   list1.add(""+(char)((int)req[6])+(char)((int)req[7]));
        s.append((char)((int)req[8]));
        s.append((char)((int)req[9]));
        s.append((char)((int)req[10]));
        s.append((char)((int)req[11]));
        s.append((char)((int)req[12]));
        s.append((char)((int)req[13]));
        s.append((char)((int)req[14]));
        s.append((char)((int)req[15]));
        s.append((char)((int)req[16]));
        s.append((char)((int)req[17]));
        list1.add(s.toString());
        list1.add(String.valueOf(MyDecoder.byte2float(req,18)));
        list1.add(String.valueOf(MyDecoder.byte2float(req,22)));
        list1.add((int)req[26]);
        list1.add((int)req[30]);
        list1.add(String.valueOf(MyDecoder.byte2float(req,34)));
        list1.add((int)req[38]);
      list1.add((int)req[42]);
        list1.add((int)req[46]);
        list1.add((int)req[50]);

//        for(int i=0;i<byteBuf.capacity();i++){
//            byteBuf.readBytes(i);
//            if(i==18){
//                Float a =  20.5f;
//        System.out.println(Arrays.toString(req));
//                System.out.println(MyDecoder.byte2float(req,18));
//            }
//
//        }

//        System.out.println("====>"+byteBuf.toString(this.charset));
System.out.println(list1);
list.add(list1);
    }
}
