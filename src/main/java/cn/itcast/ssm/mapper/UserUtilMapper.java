package cn.itcast.ssm.mapper;


import cn.itcast.ssm.po.PageDistribute;
import cn.itcast.ssm.po.RoleDistribute;
import cn.itcast.ssm.po.UserInf;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.mapper
 * @Description:
 * @date 2018/5/20 16:03
 */
@Repository
public interface UserUtilMapper {

    int selectCount(@Param(value = "name") String name,
                    @Param(value = "limitName") String limitName,
                    @Param(value = "limitValue") String limitValue);

    List<HashMap<String,Object>> selectNotes(@Param(value = "name") String name);

    List<Map<String,Object>> selectPaging(@Param(value = "name") String name,
                                          @Param(value = "offset") int offset,
                                          @Param(value = "pageSize") int pageSize,
                                          @Param(value = "limitName") String limitName,
                                          @Param(value = "limitValue") String limitValue);

    List<LinkedHashMap<String,Object>> selectInspectData(@Param(value = "tableName") String tableName,
                                                         @Param(value = "listName") String listName,
                                                         @Param(value = "listValue") String listValue);


    List<LinkedHashMap<String,Object>> selectInspectData2(@Param(value = "tableName") String tableName,
                                                         @Param(value = "listName") String listName,
                                                         @Param(value = "listValue") Integer listValue);
    List<String> selectUserPermission(@Param("userId") int userId);

    List<Integer> selectAllPageId(@Param("userId") int userId);

    int insertFunction(@Param("list") List<PageDistribute> list);
    int deleteFunction(@Param("list") List<PageDistribute> list);
    List<Map<String,Object>> selectUserRole(@Param("userId") Integer userId);
    int insertRole(@Param("list") List<RoleDistribute> list);
    int deleteRole(@Param("list") List<RoleDistribute> list);

}
