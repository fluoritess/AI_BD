package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.EquipmentUseScene;
import cn.itcast.ssm.po.EquipmentUseSceneExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentUseSceneMapper {
    long countByExample(EquipmentUseSceneExample example);

    int deleteByExample(EquipmentUseSceneExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(EquipmentUseScene record);

    int insertSelective(EquipmentUseScene record);

    List<EquipmentUseScene> selectByExample(EquipmentUseSceneExample example);

    EquipmentUseScene selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") EquipmentUseScene record, @Param("example") EquipmentUseSceneExample example);

    int updateByExample(@Param("record") EquipmentUseScene record, @Param("example") EquipmentUseSceneExample example);

    int updateByPrimaryKeySelective(EquipmentUseScene record);

    int updateByPrimaryKey(EquipmentUseScene record);
}