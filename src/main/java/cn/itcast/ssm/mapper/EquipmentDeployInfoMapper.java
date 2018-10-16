package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.EquipmentDeployInfo;
import cn.itcast.ssm.po.EquipmentDeployInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipmentDeployInfoMapper {
    long countByExample(EquipmentDeployInfoExample example);

    int deleteByExample(EquipmentDeployInfoExample example);

    int deleteByPrimaryKey(Integer equipmentDeployId);

    int insert(EquipmentDeployInfo record);

    int insertSelective(EquipmentDeployInfo record);

    List<EquipmentDeployInfo> selectByExample(EquipmentDeployInfoExample example);

    EquipmentDeployInfo selectByPrimaryKey(Integer equipmentDeployId);

    int updateByExampleSelective(@Param("record") EquipmentDeployInfo record, @Param("example") EquipmentDeployInfoExample example);

    int updateByExample(@Param("record") EquipmentDeployInfo record, @Param("example") EquipmentDeployInfoExample example);

    int updateByPrimaryKeySelective(EquipmentDeployInfo record);

    int updateByPrimaryKey(EquipmentDeployInfo record);
}