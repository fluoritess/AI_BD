package cn.itcast.ssm.netty;


import com.corundumstudio.socketio.Configuration;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 17:02 2018/11/12
 * Modified By:
 */
@Component
public class WebServer implements InitializingBean {
    @Autowired
    private EventListennter listeners;

    public void startServer() {
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(8086);

        SocketIOServer server = new SocketIOServer(config);
        server.addConnectListener(new ConnectListener() {// 添加客户端连接监听器
            @Override
            public void onConnect(SocketIOClient client) {
                System.err.println(client.getRemoteAddress() + " web客户端接入");
            }
        });

        server.addListeners(listeners);
        server.start();

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("start socket");
        this.startServer();
    }
}
