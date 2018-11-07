package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AgricultureMapper {
    List<CropVarietiesInfo> selectCropVarieties();
    List<EquipmentInfo> selectEquipmentInfo();
    //查询大棚id和name（下拉框）
    List<GreenhouseInfo> selectGreenHouseInfo();
    List<GrowthParameter> selectGrowthParam();
    List<SensorTypeInfo> selectSensorType();
    List<SoilTypeInfo> selectSoilType();
}
