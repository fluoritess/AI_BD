package cn.itcast.ssm.netty;

import cn.itcast.ssm.util.SocketIOMessage;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 21:27 2018/11/19
 * Modified By:
 */
@Component
public class EventListennter {
    //维护每个客户端的SocketIOClient
    private Map<String, List<SocketIOClient>> clients = new ConcurrentHashMap<>();

    @OnConnect
    public void onConnect(SocketIOClient client) {
        System.err.println("建立连接");
    }

    @OnEvent("token")
    public void onToken(SocketIOClient client, SocketIOMessage message) {
        List<SocketIOClient> socketList = clients.get(message.getToken());
        if (null == socketList || socketList.isEmpty()) {
            List<SocketIOClient> list = new ArrayList<>();
            list.add(client);
            clients.put(message.getToken(), list);
        }
        System.err.println("get token Message is " + message.getToken());
    }

    @OnEvent("onGetValue")
    public void onGetValue(SocketIOClient client, SocketIOMessage message) {
        List<SocketIOClient> socketList = clients.get(message.getToken());
        if (null == socketList || socketList.isEmpty()) {
            List<SocketIOClient> list = new ArrayList<>();
            list.add(client);
            clients.put(message.getToken(), list);

        } else {
            List<SocketIOClient> list = new ArrayList<>();
            list.add(client);
            clients.remove(message.getToken());
            clients.put(message.getMessage(), list);
        }

    }

    @OnEvent("outGetValue")
    public void outGetValue(SocketIOClient client, SocketIOMessage message) {

        clients.remove(message.getMessage());

    }



    /**
     * 新事务
     * @param client 客户端
     * @param message 消息
     */
    @OnEvent("newAlert")
    public void onAlert(SocketIOClient client, SocketIOMessage message) {
        //send to all users
        Collection<List<SocketIOClient>> clientsList = clients.values();
        for (List<SocketIOClient> list : clientsList) {
            for (SocketIOClient socketIOClient : list) {
                socketIOClient.sendEvent("newAlert", message);
            }
        }
    }

    /**
     * 通知所有在线客户端
     */
    public void sendAllUser() {
        Set<Map.Entry<String,List<SocketIOClient>>> entrySet = clients.entrySet();
        for (Map.Entry<String, List<SocketIOClient>> entry : entrySet) {
            String key = entry.getKey();
            List<SocketIOClient> value = entry.getValue();
            for (SocketIOClient socketIOClient : value) {
                SocketIOMessage message = new SocketIOMessage();
                message.setMessage("send All user Msg" + key);
                socketIOClient.sendEvent("newAlert", message);
            }
        }
    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {

        System.err.println("关闭连接");
    }

}
