package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.RoleDistribute;
import cn.itcast.ssm.po.RoleDistributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDistributeMapper {
    long countByExample(RoleDistributeExample example);

    int deleteByExample(RoleDistributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleDistribute record);

    int insertSelective(RoleDistribute record);

    List<RoleDistribute> selectByExample(RoleDistributeExample example);

    RoleDistribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleDistribute record, @Param("example") RoleDistributeExample example);

    int updateByExample(@Param("record") RoleDistribute record, @Param("example") RoleDistributeExample example);

    int updateByPrimaryKeySelective(RoleDistribute record);

    int updateByPrimaryKey(RoleDistribute record);
}