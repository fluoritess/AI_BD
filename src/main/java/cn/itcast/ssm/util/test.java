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
    list.add(a.substring(2,4).replace(" ",""));
//    list.add(a.substring(0,5));
//    list.add(a.substring(5,15));
//    list.add(a.substring(15,19));
//    list.add(a.substring(17,21));
//    list.add(a.substring(21,25));
//    list.add(a.substring(25,29));
//    list.add(a.substring(29,33));
//    list.add(a.substring(33,37));
  return  list;
}


}
