package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.AgricultureService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AgricultureServiceImpl implements AgricultureService {

    @Autowired
    UserUtilMapper utilMapper;
    @Autowired
    SoilTypeInfoMapper soilTypeInfoMapper;
    @Autowired
    CropInfoMapper cropInfoMapper;
    @Autowired
    NodedeviceSensorconfigInfoMapper nodedeviceSensorconfigInfoMapper;
    @Autowired
    CropVarietiesInfoMapper cropVarietiesInfoMapper;
    @Autowired
    SensorTypeInfoMapper sensorTypeInfoMapper;
    @Autowired
    EquipmentTypeInfoMapper equipmentTypeInfoMapper;

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
    public boolean addSoilTypeInfos(SoilTypeInfo soilTypeInfo) {
        if(soilTypeInfoMapper.insert(soilTypeInfo)!=0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateSoilTypeInfo(SoilTypeInfo soilTypeInfo) {
        if(soilTypeInfoMapper.updateByPrimaryKeySelective(soilTypeInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteSoilTypeInfo(Integer typeId) {
        if(soilTypeInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addCropTypeInfos(CropInfo cropInfo) {
        if(cropInfoMapper.insert(cropInfo)!=0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateCropTypeInfo(CropInfo cropInfo) {
        if(cropInfoMapper.updateByPrimaryKeySelective(cropInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteCropTypeInfo(Integer typeId) {
        if(cropInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<SoilTypeInfo> selectSoilType() {
        return soilTypeInfoMapper.selectSoilType();
    }

    @Override
    public List<CropVarietiesInfo> selectCropType() {
        return cropVarietiesInfoMapper.selectCropVarieties();
    }

    @Override
    public List<SensorTypeInfo> selectSensorType() {
        return sensorTypeInfoMapper.selectSensorType();
    }

    @Override
    public List<EquipmentTypeInfo> selectEquipmentTypeInfo() {
        return equipmentTypeInfoMapper.selectEquipmentTypeInfo();
    }

    @Override
    public boolean addNodeDeviceInfos(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo) {
        if(nodedeviceSensorconfigInfoMapper.insert(nodedeviceSensorconfigInfo)!=0) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean updateNodeDeviceInfo(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo) {
        if(nodedeviceSensorconfigInfoMapper.updateByPrimaryKeySelective(nodedeviceSensorconfigInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteNodeDeviceInfo(Integer typeId) {
        if(nodedeviceSensorconfigInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }
}
