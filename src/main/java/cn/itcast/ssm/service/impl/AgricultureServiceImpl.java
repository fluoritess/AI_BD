package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.AgricultureService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
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
    EquipmentInfoMapper equipmentInfoMapper;
    @Autowired
    GrowthParameterMapper growthParameterMapper;
    @Autowired
    GrowthEnviromentSetingMapper growthEnviromentSetingMapper;
    @Autowired
    GreenhouseInfoMapper greenhouseInfoMapper;
    @Autowired
    CropPlantInfoMapper cropPlantInfoMapper;
    @Autowired
    DisposalMethodInfoMapper disposalMethodInfoMapper;
    @Autowired
    AgricultureMapper agricultureMapper;


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
        return agricultureMapper.selectSoilType();
    }

    @Override
    public boolean addGrowthParam(GrowthEnviromentSeting growthEnviromentSeting) {
        if(growthEnviromentSetingMapper.insert(growthEnviromentSeting)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<DeployNodeInfo> selectDeployNodeInfo() {
        return agricultureMapper.selectDeployNodeInfo();
    }

    @Override
    public List<GrowthParameter> selectGrowthParam() {
        return agricultureMapper.selectGrowthParam();
    }

    @Override
    public List<CropVarietiesInfo> selectCropType() {
        return agricultureMapper.selectCropVarieties();
    }

    @Override
    public List<SensorTypeInfo> selectSensorType() {
        return agricultureMapper.selectSensorType();
    }

    @Override
    public List<EquipmentInfo> selectEquipmentInfo() {

        return agricultureMapper.selectEquipmentInfo();
    }

    @Override
    public List<CropInfo> selectCropInfo() {
        return agricultureMapper.selectCropInfo();
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

    @Override
    public boolean addCropPlantInfo(CropPlantInfo cropPlantInfo) {
        if(cropPlantInfoMapper.insert(cropPlantInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCropPlantInfo(CropPlantInfo cropPlantInfo) {
        if(cropPlantInfoMapper.updateByPrimaryKeySelective(cropPlantInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCropPlantInfo(Integer id) {
        if(cropPlantInfoMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addEndTime(Integer id) {
        CropPlantInfo cropPlantInfo = cropPlantInfoMapper.selectByPrimaryKey(id);
        cropPlantInfo.setCropPlantEndtime(new Timestamp(new Date().getTime()));
        if(cropPlantInfoMapper.updateByPrimaryKey(cropPlantInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addDisposalInfo(DisposalMethodInfo disposalMethodInfo) {
        if(disposalMethodInfoMapper.insert(disposalMethodInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDisposalInfo(DisposalMethodInfo disposalMethodInfo) {
        if(disposalMethodInfoMapper.updateByPrimaryKeySelective(disposalMethodInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDisposalInfo(Integer id) {
        if(disposalMethodInfoMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean addCropVarietiesInfo(CropVarietiesInfo cropVarietiesInfo) {
        if(cropVarietiesInfoMapper.insert(cropVarietiesInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCropVarietiesInfo(CropVarietiesInfo cropVarietiesInfo) {
        if(cropVarietiesInfoMapper.updateByPrimaryKeySelective(cropVarietiesInfo)!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCropVarietiesInfo(Integer id) {
        if(cropVarietiesInfoMapper.deleteByPrimaryKey(id)!=0){
            return true;
        }
        return false;
    }
}
