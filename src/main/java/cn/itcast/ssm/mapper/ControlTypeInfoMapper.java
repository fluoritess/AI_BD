package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ControlTypeInfo;
import cn.itcast.ssm.po.ControlTypeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ControlTypeInfoMapper {
    long countByExample(ControlTypeInfoExample example);

    int deleteByExample(ControlTypeInfoExample example);

    int deleteByPrimaryKey(Integer controlTypeId);

    int insert(ControlTypeInfo record);

    int insertSelective(ControlTypeInfo record);

    List<ControlTypeInfo> selectByExample(ControlTypeInfoExample example);

    ControlTypeInfo selectByPrimaryKey(Integer controlTypeId);

    int updateByExampleSelective(@Param("record") ControlTypeInfo record, @Param("example") ControlTypeInfoExample example);

    int updateByExample(@Param("record") ControlTypeInfo record, @Param("example") ControlTypeInfoExample example);

    int updateByPrimaryKeySelective(ControlTypeInfo record);

    int updateByPrimaryKey(ControlTypeInfo record);
}