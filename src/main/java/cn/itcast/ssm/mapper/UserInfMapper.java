package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.UserInf;
import cn.itcast.ssm.po.UserInfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfMapper {
    long countByExample(UserInfExample example);

    int deleteByExample(UserInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInf record);

    int insertSelective(UserInf record);

    List<UserInf> selectByExample(UserInfExample example);

    UserInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInf record, @Param("example") UserInfExample example);

    int updateByExample(@Param("record") UserInf record, @Param("example") UserInfExample example);

    int updateByPrimaryKeySelective(UserInf record);

    int updateByPrimaryKey(UserInf record);
}