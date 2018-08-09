package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.EquipmentTypeInfoMapper;
import cn.itcast.ssm.po.EquipmentTypeInfo;
import cn.itcast.ssm.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tyh
 * @Package cn.itcast.ssm.service.impl
 * @Description:
 * @date 18-8-9 上午10:37
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    EquipmentTypeInfoMapper equipmentTypeInfoMapper;

    @Override
    public boolean addEquipmentType(EquipmentTypeInfo equipmentTypeInfo) {
        if(equipmentTypeInfoMapper.insertSelective(equipmentTypeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean modifyEquipmentType(EquipmentTypeInfo equipmentTypeInfo) {
        if(equipmentTypeInfoMapper.updateByPrimaryKeySelective(equipmentTypeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteEquipmentType(Integer equipmentTypeId) {
        if(equipmentTypeInfoMapper.deleteByPrimaryKey(equipmentTypeId)!=0){
            return true;
        }else{
            return false;
        }
    }
}
