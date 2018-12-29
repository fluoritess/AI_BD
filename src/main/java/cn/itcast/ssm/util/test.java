package cn.itcast.ssm.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 13:11 2018/11/12
 * Modified By:
 */
public class test {
//public  static  void main(String[] args){
//    String s ="ADW  123124123423  34  42  324523  43";
//
//    List<String> list=new test().fenge(s);
//for (String list1:list){
//    System.out.println(list1);
//
//}
//}

public static List<String> fenge(String a){
    List<String> list=new ArrayList();
    list.add(a.substring(0,2).replace(" ",""));
    list.add(a.substring(2,6).replace(" ",""));
//    list.add(a.substring(6,8));
//    list.add(a.substring(8,18));
//    list.add(a.substring(18,22));
//    list.add(a.substring(22,26));
//    list.add(a.substring(26,30));
//    list.add(a.substring(30,34));
//    list.add(a.substring(34,38));
//    list.add(a.substring(38,42));
//    list.add(a.substring(42,46));
//    list.add(a.substring(46,50));
//    list.add(a.substring(50,54));

    return  list;
}


}
