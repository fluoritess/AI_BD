package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.UserState;
import cn.itcast.ssm.po.UserStateExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserStateMapper {
    long countByExample(UserStateExample example);

    int deleteByExample(UserStateExample example);

    int deleteByPrimaryKey(String stateid);

    int insert(UserState record);

    int insertSelective(UserState record);

    List<UserState> selectByExample(UserStateExample example);

    UserState selectByPrimaryKey(String stateid);

    int updateByExampleSelective(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByExample(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}