package cn.itcast.ssm.service;

import cn.itcast.ssm.po.*;
import cn.itcast.ssm.util.Paging;

import java.util.List;

public interface SensorService {
    /**
     * 查询分页
     * @param name 数据库表名
     * @param offset 当前页
     * @param pageSize 每页大小
     * @return
     */
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);

    /**
     * 增加传感器类型
     */
    boolean addSensorTypeInfos(SensorTypeInfo sensorTypeInfo);

    /**
     * 修改传感器类型
     */
    boolean updateSensorTypeInfo(SensorTypeInfo sensorTypeInfo);

    /**
     * 删除传感器类型
     */
    boolean deleteSensorTypeInfo(Integer typeId);

    /**
     * 检查数据
     */
    boolean inspectData(String tableName,String listName,String listValue);
/**
* 查询传感器
* */
List<SensorTypeInfo>  seleceSensorInfo(Integer equipmentId);

/**
 * 查询场景地址
 */
List<SceneAddressInfo> selectSceneAddressName(Integer typeId);

/**
 * 查询大棚
 */
List<DeployNodeInfo> selectGreenHouse(Integer addressId);

    /**
     * 查询大棚下节点信息
     * @param parentId
     * @return
     */
    List<DeployNodeInfo>  selectDeployNode(Integer parentId);
    List<EquipmentInfo> selectGreenHouseEquipment(Integer nodeId);
}
