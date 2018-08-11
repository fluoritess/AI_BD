package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
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
    @Autowired
    ManufacturerInfoMapper manufacturerInfoMapper;
    @Autowired
    EquipmentInfoMapper equipmentInfoMapper;
    @Autowired
    EquipmentDeployInfoMapper equipmentDeployInfoMapper;
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
    public Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue) {
        Paging page=new Paging();
        //查询出注释
        page.addDataTitle(utilMapper.selectNotes(name));
        //查询出总条数
        page.setListTotal(utilMapper.selectCount(name,limitName,limitValue));
        //查询数据
        List<Map<String,Object>> list= utilMapper.selectPaging(name,offset,pageSize,limitName,limitValue);
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

    @Override
    public boolean addUserScene(EquipmentUseScene equipmentUseScene) {
        if(equipmentUseSceneMapper.insertSelective(equipmentUseScene)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateUserScene(EquipmentUseScene equipmentUseScene) {
        if(equipmentUseSceneMapper.updateByPrimaryKeySelective(equipmentUseScene)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteUseScene(Integer typeId) {
        if(equipmentUseSceneMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean addManufacturerInfo(ManufacturerInfo manufacturerInfo) {
        if(manufacturerInfoMapper.insertSelective(manufacturerInfo)!=0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean updateManufacturerInfo(ManufacturerInfo manufacturerInfo) {
        if(manufacturerInfoMapper.updateByPrimaryKeySelective(manufacturerInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteManufacturerInfo(Integer typeId) {
        if(manufacturerInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<?> selectAllInfo(Class c) {
        if(c.equals(EquipmentTypeInfo.class)){
            return equipmentTypeInfoMapper.selectByExample(null);
        }else if(c.equals(EquipmentUseScene.class)){
            return equipmentUseSceneMapper.selectByExample(null);
        }else if(c.equals(SceneAddressInfo.class)){
            return sceneAddressInfoMapper.selectByExample(null);
        }else if(c.equals(ControlTypeInfo.class)){
            return controlTypeInfoMapper.selectByExample(null);
        }else if(c.equals(ManufacturerInfo.class)){
            return manufacturerInfoMapper.selectByExample(null);
        }else if(c.equals(DeployNodeInfo.class)){
            return deployNodeInfoMapper.selectByExample(null);
        }
        return null;
    }

    @Override
    public boolean addEquipmentInfo(EquipmentInfo equipmentInfo) {
        if(equipmentInfoMapper.insertSelective(equipmentInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean selectInspectData(String tableName, String listName, String listValue) {
        List<LinkedHashMap<String,Object>> list=utilMapper.selectInspectData(tableName,listName,listValue);
        return list.size()!=0;
    }

    @Override
    public boolean addDeployEquipment(EquipmentDeployInfo equipmentDeployInfo) {
        if(equipmentDeployInfoMapper.insertSelective(equipmentDeployInfo)!=0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean updateEquipmentInfo(EquipmentInfo equipmentInfo) {
        if(equipmentInfoMapper.updateByPrimaryKeySelective(equipmentInfo)!=0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean deleteEquipmentInfo(Integer typeId) {
        if(equipmentInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Paging selectDeployDetails(String deployId) {
        Paging paging=new Paging();
        paging.addDataTitle(utilMapper.selectNotes("deploy_detail_view"));
        paging.setLists(utilMapper.selectInspectData("deploy_detail_view","equipment_id",deployId));
        return paging;
    }

    @Override
    public boolean updateDeployDetails(EquipmentDeployInfo equipmentDeployInfo) {
        if(equipmentDeployInfoMapper.updateByPrimaryKeySelective(equipmentDeployInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteDeployDetails(Integer typeId) {
        if(equipmentDeployInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else{
            return false;
        }
    }
}