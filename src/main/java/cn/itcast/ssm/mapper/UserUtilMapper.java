package cn.itcast.ssm.mapper;


import cn.itcast.ssm.po.UserInf;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
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
                    @Param(value = "statename") String statename);

    List<HashMap<String,Object>> selectNotes(@Param(value = "name") String name);

    List<Map<String,Object>> selectPaging(@Param(value = "name") String name,
                                          @Param(value = "offset") int offset,
                                          @Param(value = "pageSize") int pageSize,
                                          @Param(value = "statename") String statename);

    List<Map<String,Object>> selectInspectData(@Param(value = "tableName") String tableName,
                                               @Param(value = "listName") String listName,
                                               @Param(value = "listValue") String listValue);

    List<Map<String,Object>> selectUDRView(@Param("userInf") UserInf userInf);
}
