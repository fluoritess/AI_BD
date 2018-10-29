package cn.itcast.ssm.service;

import cn.itcast.ssm.po.*;
import cn.itcast.ssm.util.Paging;

import java.util.List;

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

    /**
     * 查询分页
     * @param name 数据库表名
     * @param offset 当前页
     * @param pageSize 每页大小
     * @return
     */
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);

    boolean addControlType(ControlTypeInfo controlTypeInfo);

    boolean deleteControlType(Integer controlTypeId);

    boolean updateControlType(ControlTypeInfo controlTypeInfo);

    /**
     * 添加场景地址信息
     * @param sceneAddressInfo
     * @return
     */
    boolean addSceneAddress(SceneAddressInfo sceneAddressInfo);

    /**
     * 修改场景地址信息
     * @param sceneAddressInfo
     * @return
     */
    boolean modifySceneAddress(SceneAddressInfo sceneAddressInfo);

    /**
     * 删除场景地址信息
     * @param sceneAddressId
     * @return
     */
    boolean deleteSceneAddress(Integer sceneAddressId);

    /**
     * 添加部署节点信息
     * @param deployNodeInfo
     * @return
     */
    boolean addDeployNode(DeployNodeInfo deployNodeInfo);

    /**
     * 修改部署节点信息
     * @param deployNodeInfo
     * @return
     */
    boolean modifyDeployNode(DeployNodeInfo deployNodeInfo);

    /**
     * 删除部署节点信息
     * @param deployNodeId
     * @return
     */
    boolean deleteDeployNode(Integer deployNodeId);

    /**
     * 根据id查询部署节点信息
     * @param deployNodeId
     * @return
     */
    DeployNodeInfo selectDeployNode(Integer deployNodeId);

    /**
     * 添加使用场景
     * @param equipmentUseScene
     * @return
     */
    boolean addUserScene(EquipmentUseScene equipmentUseScene);

    /**
     * 修改使用场景
     * @param equipmentUseScene
     * @return
     */
    boolean updateUserScene(EquipmentUseScene equipmentUseScene);

    /**
     * 删除使用场景
     * @param typeId
     * @return
     */
    boolean deleteUseScene(Integer typeId);

    /**
     * 添加厂商信息
     * @param manufacturerInfo
     * @return
     */
    boolean addManufacturerInfo(ManufacturerInfo manufacturerInfo);

    /**
     * 修改厂商信息
     * @param manufacturerInfo
     * @return
     */
    boolean updateManufacturerInfo(ManufacturerInfo manufacturerInfo);

    /**
     * 删除厂商信息
     * @param typeId
     * @return
     */
    boolean deleteManufacturerInfo(Integer typeId);

    /**
     * 查询所有的表信息
     * @param c 类
     * @return
     */
    List<?> selectAllInfo(Class c);

    /**
     * 添加设备信息
     * @param equipmentInfo
     * @return
     */
    boolean addEquipmentInfo(EquipmentInfo equipmentInfo);

    /**
     * 检验信息
     * @param tableName 数据库表名
     * @param listName 字段名
     * @param listValue 字段值
     * @return 是否存在
     */
    boolean selectInspectData(String tableName,String listName,String listValue);

    /**
     * 部署设备
     * @param equipmentDeployInfo
     * @return
     */
    boolean addDeployEquipment(EquipmentDeployInfo equipmentDeployInfo);
    /**
     * 修改设备信息
     * @param equipmentInfo
     * @return
     */
    boolean updateEquipmentInfo(EquipmentInfo equipmentInfo);

    /**
     * 删除设备信息
     * @param typeId
     * @return
     */
    boolean deleteEquipmentInfo(Integer typeId);

    /**
     * 查询设备部署详情
     * @param deployId
     * @return
     */
    Paging selectDeployDetails(String deployId);

    /**
     * 更新部署信息
     * @param equipmentDeployInfo
     * @return
     */
    boolean updateDeployDetails(EquipmentDeployInfo equipmentDeployInfo);

    /**
     * 删除部署信息
     * @param typeId
     * @return
     */
    boolean deleteDeployDetails(Integer typeId);

}
