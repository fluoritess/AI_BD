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
    Paging selectPaging(String name, int offset, int pageSize);

    boolean addControlType(ControlTypeInfo controlTypeInfo);

    boolean deleteControlType(Integer controlTypeId);

    boolean updateControlType(ControlTypeInfo controlTypeInfo);
    /**
     * 查询所有的设备使用场景
     * @return
     */
    List<EquipmentUseScene> selectScene();

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
     * 查询所有的场景地址信息
     * @return
     */
    List<SceneAddressInfo> selectAllAddress();

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
}
