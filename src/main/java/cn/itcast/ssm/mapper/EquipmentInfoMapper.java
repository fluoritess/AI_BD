package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.EquipmentInfo;
import cn.itcast.ssm.po.EquipmentInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentInfoMapper {
    long countByExample(EquipmentInfoExample example);

    int deleteByExample(EquipmentInfoExample example);

    int deleteByPrimaryKey(Integer equipmentId);

    int insert(EquipmentInfo record);

    int insertSelective(EquipmentInfo record);

    List<EquipmentInfo> selectByExample(EquipmentInfoExample example);

    EquipmentInfo selectByPrimaryKey(Integer equipmentId);

    int updateByExampleSelective(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    int updateByExample(@Param("record") EquipmentInfo record, @Param("example") EquipmentInfoExample example);

    int updateByPrimaryKeySelective(EquipmentInfo record);

    int updateByPrimaryKey(EquipmentInfo record);

}