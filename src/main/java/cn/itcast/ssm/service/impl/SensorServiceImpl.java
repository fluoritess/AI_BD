package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.SensorService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    UserUtilMapper utilMapper;
    @Autowired
    SensorTypeInfoMapper sensorTypeInfoMapper;
    @Autowired
    SceneAddressInfoMapper sceneAddressInfoMapper;
    @Autowired
    DeployNodeInfoMapper deployNodeInfoMapper;
    @Autowired
    EquipmentDeployInfoMapper equipmentDeployInfoMapper;
    @Autowired
    EquipmentInfoMapper equipmentInfoMapper;
    @Autowired
    NodedeviceSensorconfigInfoMapper nodedeviceSensorconfigInfoMapper;
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
    public boolean updateSensorTypeInfo(SensorTypeInfo sensorTypeInfo) {
        if(sensorTypeInfoMapper.updateByPrimaryKeySelective(sensorTypeInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addSensorTypeInfos(SensorTypeInfo sensorTypeInfo) {
        if(sensorTypeInfoMapper.insert(sensorTypeInfo)!=0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteSensorTypeInfo(Integer typeId) {
        if(sensorTypeInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean inspectData(String tableName, String listName, String listValue) {
        List<LinkedHashMap<String, Object>> list = utilMapper.selectInspectData(tableName, listName, listValue);
        return list.size()==0;//返回true则代表未被注册过
    }



    @Override
    public List<SceneAddressInfo> selectSceneAddressName(Integer typeId) {

        SceneAddressInfoExample sceneAddressInfoExample = new SceneAddressInfoExample();
       SceneAddressInfoExample.Criteria criteria= sceneAddressInfoExample.createCriteria();
        criteria.andTypeIdEqualTo(typeId);
         return  sceneAddressInfoMapper.selectByExample(sceneAddressInfoExample);

    }

    @Override
    public List<DeployNodeInfo> selectGreenHouse(Integer addressId) {
        DeployNodeInfoExample deployNodeInfoExample = new DeployNodeInfoExample();
        DeployNodeInfoExample.Criteria criteria = deployNodeInfoExample.createCriteria();
        criteria.andAddressIdEqualTo(addressId);
        criteria.andParentIdEqualTo(null);
        return  deployNodeInfoMapper.selectByExample(deployNodeInfoExample);
    }

    @Override
    public List<DeployNodeInfo> selectDeployNode(Integer parentId) {
        DeployNodeInfoExample deployNodeInfoExample = new DeployNodeInfoExample();
        DeployNodeInfoExample.Criteria criteria = deployNodeInfoExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        return  deployNodeInfoMapper.selectByExample(deployNodeInfoExample);
    }

    @Override
    public List<EquipmentInfo> selectGreenHouseEquipment(Integer nodeId) {
        List<EquipmentInfo> list = new ArrayList<>();
        DeployNodeInfoExample deployNodeInfoExample = new DeployNodeInfoExample();
        DeployNodeInfoExample.Criteria criteria1 = deployNodeInfoExample.createCriteria();
        List<DeployNodeInfo> deployNodeInfos=deployNodeInfoMapper.selectByExample(deployNodeInfoExample);
        for (DeployNodeInfo deployNodeInfo:deployNodeInfos){
            EquipmentDeployInfoExample equipmentDeployInfoExample = new EquipmentDeployInfoExample();
            EquipmentDeployInfoExample.Criteria criteria2 = equipmentDeployInfoExample.createCriteria();
            criteria2.andDeployNodeIdEqualTo(deployNodeInfo.getDeployNodeId());
            List<EquipmentDeployInfo> equipmentDeployInfos= equipmentDeployInfoMapper.selectByExample(equipmentDeployInfoExample);
            for (EquipmentDeployInfo equipmentDeployInfo:equipmentDeployInfos){
                EquipmentInfo equipmentInfo=equipmentInfoMapper.selectByPrimaryKey( equipmentDeployInfo.getEquipmentId());
                list.add(equipmentInfo);
            }
        }

return  list;
    }
    @Override
    public List<SensorTypeInfo> seleceSensorInfo(Integer equipmentId) {
        List<SensorTypeInfo> sensorTypeInfos =new ArrayList<>();
NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample = new NodedeviceSensorconfigInfoExample();
NodedeviceSensorconfigInfoExample.Criteria criteria = nodedeviceSensorconfigInfoExample.createCriteria();
criteria.andDeviceIdEqualTo(equipmentId);

        List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos= nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        for (NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo:nodedeviceSensorconfigInfos){
sensorTypeInfos.add(sensorTypeInfoMapper.selectByPrimaryKey(nodedeviceSensorconfigInfo.getSensorTypeId()));

        }
return  sensorTypeInfos;
    }

}
