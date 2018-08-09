package cn.itcast.ssm.service;

import cn.itcast.ssm.po.EquipmentTypeInfo;

/**
 * @author tyh
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 18-8-9 上午10:36
 */
public interface EquipmentService {

    /**
     * 增加设备类型信息
     * @param equipmentTypeInfo
     * @return
     */
    boolean addEquipmentType(EquipmentTypeInfo equipmentTypeInfo);

    /**
     * 修改设备类型信息
     * @param equipmentTypeInfo
     * @return
     */
    boolean modifyEquipmentType(EquipmentTypeInfo equipmentTypeInfo);

    /**
     * 删除设备类型信息
     * @param equipmentTypeId
     * @return
     */
    boolean deleteEquipmentType(Integer equipmentTypeId);

}
