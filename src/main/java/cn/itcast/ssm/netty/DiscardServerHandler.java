package cn.itcast.ssm.netty;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.BaseService;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.impl.BaseServiceImpl;
import cn.itcast.ssm.service.impl.EquipmentServiceImpl;
import cn.itcast.ssm.util.Constant;
import cn.itcast.ssm.util.test;
import com.corundumstudio.socketio.SocketIOClient;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
//import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:02 2018/10/24
 * Modified By:
 */


@Component
public class DiscardServerHandler extends  ChannelInboundHandlerAdapter implements Constant {

    @Autowired
    BaseService baseService;

    public static  DiscardServerHandler discardServerHandler;

    public DiscardServerHandler(){

    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)  {
        try {

Map<String,Object>  sennorValueMap=new HashMap<>();

            List msg1=(List)msg;
            System.out.println("传输内容是");
            System.out.println(msg);
            //这里调用service服务
            discardServerHandler.baseService.test(msg1);

            for (Map.Entry<String, SocketIOClient> entry : EventListennter.clients1.entrySet()){
                if(entry.getKey().equals(msg1.get(3))){
                    for(Map.Entry<String, Object> entry1 : map.entrySet()){
                        if ("土壤根系温度".equals(entry1.getKey())){
                        sennorValueMap.put(entry1.getValue().toString(),msg1.get(4));
                        }
                        else  if ("土壤表层温度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(5));
                        } else if ("土壤根系湿度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(6));
                        }
                        else if ("土壤表层湿度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(7));
                        }
                        else if ("温室温度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(8));
                        }
                        else if ("温室湿度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(9));
                        }
                        else if ("温室气压".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(10));
                        }
                        else if ("温室二氧化碳浓度".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(11));
                        }
                        else if ("温室通风风速".equals(entry1.getKey())){
                            sennorValueMap.put(entry1.getValue().toString(),msg1.get(12));
                        }

                    }
                    System.out.println("sendEvent");
                    entry.getValue().sendEvent("onGetValue",sennorValueMap);
                }
            }

        }  finally {
            ReferenceCountUtil.release(msg);
        }
//        ((ByteBuf) msg).release();
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
