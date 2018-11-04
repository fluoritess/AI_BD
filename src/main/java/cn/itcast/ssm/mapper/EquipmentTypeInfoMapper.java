package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.EquipmentTypeInfo;
import cn.itcast.ssm.po.EquipmentTypeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentTypeInfoMapper {
    long countByExample(EquipmentTypeInfoExample example);

    int deleteByExample(EquipmentTypeInfoExample example);

    int deleteByPrimaryKey(Integer equipmentTypeId);

    int insert(EquipmentTypeInfo record);

    int insertSelective(EquipmentTypeInfo record);

    List<EquipmentTypeInfo> selectByExample(EquipmentTypeInfoExample example);

    EquipmentTypeInfo selectByPrimaryKey(Integer equipmentTypeId);

    int updateByExampleSelective(@Param("record") EquipmentTypeInfo record, @Param("example") EquipmentTypeInfoExample example);

    int updateByExample(@Param("record") EquipmentTypeInfo record, @Param("example") EquipmentTypeInfoExample example);

    int updateByPrimaryKeySelective(EquipmentTypeInfo record);

    int updateByPrimaryKey(EquipmentTypeInfo record);


}