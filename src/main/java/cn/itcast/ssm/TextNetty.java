package cn.itcast.ssm;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:10 2018/10/24
 * Modified By:
 */
public class TextNetty {

    public static void main(String[] args){
        try {
            while (true){

                Socket socket=new Socket("localhost",8088);
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter=new PrintWriter(outputStream);
                Random random = new Random();
              String s = (random.nextInt(20-10+1)+10)+"";
//                String a = (random.nextInt(2-0+1)+0)+"";
                String a = "1 ";
                String senor_value=a+s;
                System.out.println(senor_value);
                printWriter.write(senor_value);
                printWriter.flush();
                socket.shutdownOutput();
                socket.close();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
