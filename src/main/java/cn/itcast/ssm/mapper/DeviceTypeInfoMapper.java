package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.DeviceTypeInfo;
import cn.itcast.ssm.po.DeviceTypeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceTypeInfoMapper {
    long countByExample(DeviceTypeInfoExample example);

    int deleteByExample(DeviceTypeInfoExample example);

    int deleteByPrimaryKey(Integer deviceTypeId);

    int insert(DeviceTypeInfo record);

    int insertSelective(DeviceTypeInfo record);

    List<DeviceTypeInfo> selectByExample(DeviceTypeInfoExample example);

    DeviceTypeInfo selectByPrimaryKey(Integer deviceTypeId);

    int updateByExampleSelective(@Param("record") DeviceTypeInfo record, @Param("example") DeviceTypeInfoExample example);

    int updateByExample(@Param("record") DeviceTypeInfo record, @Param("example") DeviceTypeInfoExample example);

    int updateByPrimaryKeySelective(DeviceTypeInfo record);

    int updateByPrimaryKey(DeviceTypeInfo record);
}