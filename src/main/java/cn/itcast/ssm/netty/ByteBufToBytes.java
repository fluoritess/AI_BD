package cn.itcast.ssm.netty;

import io.netty.buffer.ByteBuf;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 21:52 2018/12/10
 * Modified By:
 */
public class ByteBufToBytes {
    public byte[] read(ByteBuf datas) {
        byte[] bytes = new byte[datas.readableBytes()];
        datas.readBytes(bytes);
        return bytes;
    }

}
