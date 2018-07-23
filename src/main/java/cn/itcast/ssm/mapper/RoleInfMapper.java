package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.RoleInf;
import cn.itcast.ssm.po.RoleInfExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleInfMapper {
    long countByExample(RoleInfExample example);

    int deleteByExample(RoleInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleInf record);

    int insertSelective(RoleInf record);

    List<RoleInf> selectByExample(RoleInfExample example);

    RoleInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleInf record, @Param("example") RoleInfExample example);

    int updateByExample(@Param("record") RoleInf record, @Param("example") RoleInfExample example);

    int updateByPrimaryKeySelective(RoleInf record);

    int updateByPrimaryKey(RoleInf record);
}