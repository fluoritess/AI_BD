package cn.itcast.ssm.netty;

import cn.itcast.ssm.service.BaseService;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.impl.BaseServiceImpl;
import cn.itcast.ssm.service.impl.EquipmentServiceImpl;
import cn.itcast.ssm.util.test;
import com.corundumstudio.socketio.SocketIOClient;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
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


@Component
public class DiscardServerHandler extends SimpleChannelInboundHandler<Object> {

    @Autowired
BaseService baseService;

public static  DiscardServerHandler discardServerHandler;

public DiscardServerHandler(){

}

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
        try {


            String a = (String)msg;
            System.out.println("传输内容是");
            System.out.println(a);
            List<String> list=test.fenge(a);
            System.out.println(list);
            //这里调用service服务
            discardServerHandler.baseService.test(list.get(1));

           for (Map.Entry<String, SocketIOClient> entry : EventListennter.clients1.entrySet()){
               if(entry.getKey().equals(list.get(0))){
                System.out.println("sendEvent");
                  entry.getValue().sendEvent("onGetValue",list.get(1));
                }
           }

        }  finally {
            ReferenceCountUtil.release(msg);
        }
    }


    @PostConstruct
    public void init() {
discardServerHandler =this;
discardServerHandler.baseService = this.baseService;

    }





    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 出现异常就关闭
        cause.printStackTrace();
        ctx.close();
    }
}
