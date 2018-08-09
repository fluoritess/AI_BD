package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author tyh&ly
 * @Package cn.itcast.ssm.service.impl
 * @Description:
 * @date 18-8-9 上午10:37
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    ControlTypeInfoMapper controlTypeInfoMapper;

    @Autowired
    EquipmentTypeInfoMapper equipmentTypeInfoMapper;

    @Autowired
    UserUtilMapper utilMapper;

    @Autowired
    EquipmentUseSceneMapper equipmentUseSceneMapper;

    @Autowired
    SceneAddressInfoMapper sceneAddressInfoMapper;

    @Autowired
    DeployNodeInfoMapper deployNodeInfoMapper;

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

    @Override
    public Paging selectPaging(String name, int offset, int pageSize) {
        Paging page=new Paging();
        //查询出注释
        page.addDataTitle(utilMapper.selectNotes(name));
        //查询出总条数
        page.setListTotal(utilMapper.selectCount(name,null));
        //查询数据
        List<Map<String,Object>> list= utilMapper.selectPaging(name,offset,pageSize,null);
        //装入数据
        page.setLists(list);
        //返回数据
        return page;
    }
    @Override
    public  boolean addControlType(ControlTypeInfo controlTypeInfo) {
        if (controlTypeInfoMapper.insert(controlTypeInfo) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<EquipmentUseScene> selectScene() {
        return equipmentUseSceneMapper.selectByExample(null);
    }

    @Override
    public boolean addSceneAddress(SceneAddressInfo sceneAddressInfo) {
        if(sceneAddressInfoMapper.insertSelective(sceneAddressInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public  boolean deleteControlType(Integer controlTypeId){
        if(controlTypeInfoMapper.deleteByPrimaryKey(controlTypeId)!=0) {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean updateControlType(ControlTypeInfo controlTypeInfo){
        if (controlTypeInfoMapper.updateByPrimaryKeySelective(controlTypeInfo) != 0) {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean modifySceneAddress(SceneAddressInfo sceneAddressInfo) {
        if(sceneAddressInfoMapper.updateByPrimaryKeySelective(sceneAddressInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteSceneAddress(Integer sceneAddressId) {
        if(sceneAddressInfoMapper.deleteByPrimaryKey(sceneAddressId)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<SceneAddressInfo> selectAllAddress() {
        return sceneAddressInfoMapper.selectByExample(null);
    }

    @Override
    public boolean addDeployNode(DeployNodeInfo deployNodeInfo) {
        if(deployNodeInfoMapper.insertSelective(deployNodeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean modifyDeployNode(DeployNodeInfo deployNodeInfo) {
        if(deployNodeInfoMapper.updateByPrimaryKeySelective(deployNodeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteDeployNode(Integer deployNodeId) {
        if(deployNodeInfoMapper.deleteByPrimaryKey(deployNodeId)!=0){
            return true;
        }else{
            return false;
        }
    }
}
