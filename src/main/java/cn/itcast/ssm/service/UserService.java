package cn.itcast.ssm.service;


import cn.itcast.ssm.po.PageDistribute;
import cn.itcast.ssm.po.PageInf;
import cn.itcast.ssm.po.UserInf;
import cn.itcast.ssm.util.Paging;

import java.util.List;
import java.util.Map;


/**
 * @author tyh
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 2018/5/9 15:13
 */

public interface UserService {
    //注册
    boolean register(UserInf user);

    UserInf findId(String tel);
    /**
     * 更新密码
     * @param password 密码
     * @return
     */
     void updatepw(String password ,String tel);
    /**
     * 登录功能接口
     */
     UserInf login(String tel,String pw) throws Exception;


    void uadatedate(String name,String nic,String email,String tel);
    
    void adddata(String email,String name,String idnumber,String telph);

    String addFunction(Map<String,Object> data);
    
    String addRole(Map <String,Object> data);

    Paging selectPaging(String name, int offset, int pageSize,String statename);
    
    String deleterole(Integer id);
    String deletegongneng(Integer id);
    String deleteuser(Integer id);

    List<Map<String,Object>> selectAllRole();
    
    void addroleDist(int userid,int roleid);

   Map<String,Object> selectroleAnddepart(UserInf userInf);

    boolean selectInspectData(String tableName,String listName,String listValue);

    int updateUserState(UserInf userInf);
    
    List<PageInf> selectAllfunction();
    
    List<PageDistribute> selectHadfunction(Integer roleid);

    int updatePageInf(PageInf pageInf);
    
    int updataDistributionFunction(PageDistribute pageDistribute);
    
    int delectDistributionFunction(int jueseID ,int functionID);

}
