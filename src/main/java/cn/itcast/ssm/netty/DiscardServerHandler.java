package cn.itcast.ssm.netty;

import cn.itcast.ssm.service.BaseService;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.impl.BaseServiceImpl;
import cn.itcast.ssm.service.impl.EquipmentServiceImpl;
import cn.itcast.ssm.util.test;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.group.ChannelGroup;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:02 2018/10/24
 * Modified By:
 */

@Service
@Component
public class DiscardServerHandler extends ChannelHandlerAdapter {

    @Autowired
BaseService baseService;

public static  DiscardServerHandler discardServerHandler;

public DiscardServerHandler(){

}
    @PostConstruct
    public void init() {
discardServerHandler =this;
discardServerHandler.baseService = this.baseService;

    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        try {
            ByteBuf in = (ByteBuf) msg;
            System.out.println("传输内容是");
            String a=in.toString(CharsetUtil.UTF_8);
            System.out.println(a);
            //这里调用service服务
            discardServerHandler.baseService.test(a);
            List<String> list=test.fenge(a);
            for (Map.Entry<String, Channel> entry : WebServer.getMap().entrySet()){
            if(entry.getKey().equals(list.get(0))){

                entry.getValue().writeAndFlush(list.get(2));

            }
            }

        }  finally {
            ReferenceCountUtil.release(msg);
        }
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 出现异常就关闭
        cause.printStackTrace();
        ctx.close();
    }
}
