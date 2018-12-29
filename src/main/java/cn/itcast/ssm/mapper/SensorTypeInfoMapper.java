package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.SensorTypeInfo;
import cn.itcast.ssm.po.SensorTypeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SensorTypeInfoMapper {
    long countByExample(SensorTypeInfoExample example);

    int deleteByExample(SensorTypeInfoExample example);

    int deleteByPrimaryKey(Integer sensorTypeId);

    int insert(SensorTypeInfo record);

    int insertSelective(SensorTypeInfo record);

    List<SensorTypeInfo> selectByExample(SensorTypeInfoExample example);

    SensorTypeInfo selectByPrimaryKey(Integer sensorTypeId);

    int updateByExampleSelective(@Param("record") SensorTypeInfo record, @Param("example") SensorTypeInfoExample example);

    int updateByExample(@Param("record") SensorTypeInfo record, @Param("example") SensorTypeInfoExample example);

    int updateByPrimaryKeySelective(SensorTypeInfo record);

    int updateByPrimaryKey(SensorTypeInfo record);
}