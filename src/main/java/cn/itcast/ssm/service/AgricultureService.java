package cn.itcast.ssm.service;

import cn.itcast.ssm.po.*;
import cn.itcast.ssm.util.Paging;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgricultureService {
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);
    boolean addSoilTypeInfos(SoilTypeInfo soilTypeInfo);
    boolean updateSoilTypeInfo(SoilTypeInfo soilTypeInfo);
    boolean deleteSoilTypeInfo(Integer typeId);

    boolean addCropTypeInfos(CropInfo cropInfo);
    boolean updateCropTypeInfo(CropInfo cropInfo);
    boolean deleteCropTypeInfo(Integer typeId);

    boolean addGrowthParam(GrowthEnviromentSeting growthEnviromentSeting);

    //获取大棚类型
    List<GreenhouseInfo> selectGreenHouseInfo();
    //获取生长环境参数
    List<GrowthParameter> selectGrowthParam();
    //获取土壤类型id和name
    List<SoilTypeInfo> selectSoilType();
    //获取作物类型id和name
    List<CropVarietiesInfo> selectCropType();
    //查询传感器类型
    List<SensorTypeInfo> selectSensorType();
    //查询所属设备
    List<EquipmentInfo> selectEquipmentInfo();

    boolean addNodeDeviceInfos(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo);
    boolean updateNodeDeviceInfo(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo);
    boolean deleteNodeDeviceInfo(Integer typeId);

    boolean addCropPlantInfo(CropPlantInfo cropPlantInfo);
    boolean updateCropPlantInfo(CropPlantInfo cropPlantInfo);


    boolean addDisposalInfo(DisposalMethodInfo disposalMethodInfo);
    boolean updateDisposalInfo(DisposalMethodInfo disposalMethodInfo);
    boolean deleteDisposalInfo(Integer id);
}
