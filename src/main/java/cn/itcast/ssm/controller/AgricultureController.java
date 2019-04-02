package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.AgricultureService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/agriculture")
public class AgricultureController {
    @Autowired
    AgricultureService agricultureService;

    @ResponseBody
    @ArchivesLog(operationType = "土壤信息分页", operationName = "土壤信息分页")
    @RequestMapping(value = "/selectSoilTypeInfo.action")
    public Map<String, Object> selectSoilTypeInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("soil_type_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("土壤信息分页成功").put("data", paging);
    }


    @ResponseBody
    @ArchivesLog(operationType = "增加土壤信息", operationName = "增加土壤信息")
    @RequestMapping(value = "/addSoilTypeInfo.action")
    public Map<String, Object> addSoilTypeInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        SoilTypeInfo soilTypeInfo = new SoilTypeInfo();
        soilTypeInfo.setSoilTypeName(String.valueOf(data.get("soil_type_name")));
        soilTypeInfo.setRemark(String.valueOf(data.get("remark")));
        if ( agricultureService.addSoilTypeInfos(soilTypeInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改土壤信息", operationName = "修改土壤信息")
    @RequestMapping(value = "/updateSoilTypeInfo.action")
    public Map<String, Object> updateSenorTypeIno(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
       SoilTypeInfo soilTypeInfo = new SoilTypeInfo();
        soilTypeInfo.setSoilTypeId(Integer.valueOf(String.valueOf(data.get("soil_type_id"))));
        soilTypeInfo.setSoilTypeName(String.valueOf(data.get("soil_type_name")));
        soilTypeInfo.setRemark(String.valueOf(data.get("remark")));
        if (agricultureService.updateSoilTypeInfo(soilTypeInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除土壤信息", operationName = "删除土壤信息")
    @RequestMapping(value = "/deleteSoilTypeInfo.action")
    public Map<String, Object> deleteSenorTypeIno(@RequestBody Map<String, Object> deleteMap) {
        Integer soilTypeInfo_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteSoilTypeInfo(soilTypeInfo_id)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "作物信息分页", operationName = "作物信息分页")
    @RequestMapping(value = "/selectCropTypeInfo.action")
    public Map<String, Object> selectCropTypeInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("crop_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("作物信息分页成功").put("data", paging);
    }


    @ResponseBody
    @ArchivesLog(operationType = "增加作物信息", operationName = "增加作物信息")
    @RequestMapping(value = "/addCropTypeInfo.action")
    public Map<String, Object> addCropTypeInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        CropInfo cropInfo = new CropInfo();
        cropInfo.setCropName(String.valueOf(data.get("crop_name")));
        cropInfo.setRemark(String.valueOf(data.get("remark")));
        cropInfo.setCropVarietiesId(Integer.parseInt(String.valueOf(data.get("crop_varieties_id"))));
        cropInfo.setSoilTypeId(Integer.parseInt(String.valueOf(data.get("soil_type_id"))));
        cropInfo.setCropRowSpacing(Integer.parseInt(String.valueOf(data.get("crop_row_spacing"))));
        cropInfo.setCropDensity(Integer.parseInt(String.valueOf(data.get("crop_density"))));
        if ( agricultureService.addCropTypeInfos(cropInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改作物信息", operationName = "修改作物信息")
    @RequestMapping(value = "/updateCropTypeInfo.action")
    public Map<String, Object> updateCropTypeIno(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        CropInfo cropInfo = new CropInfo();
        cropInfo.setCropName(String.valueOf(data.get("crop_name")));
        cropInfo.setRemark(String.valueOf(data.get("remark")));
        cropInfo.setCropId(Integer.parseInt(String.valueOf(data.get("crop_id"))));
        cropInfo.setCropVarietiesId(Integer.parseInt(String.valueOf(data.get("crop_varieties_id"))));
        cropInfo.setSoilTypeId(Integer.parseInt(String.valueOf(data.get("soil_type_id"))));
        cropInfo.setCropRowSpacing(Integer.parseInt(String.valueOf(data.get("crop_row_spacing"))));
        cropInfo.setCropDensity(Integer.parseInt(String.valueOf(data.get("crop_density"))));
        if (agricultureService.updateCropTypeInfo(cropInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "增加生长环境参数信息", operationName = "增加生长环境参数")
    @RequestMapping(value = "/addGrowthParam.action")
    public Map<String, Object> addGrowthParam(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        GrowthEnviromentSeting growthEnviromentSeting = new GrowthEnviromentSeting();
        growthEnviromentSeting.setGropId(Integer.parseInt(String.valueOf(data.get("grop_id"))));
        growthEnviromentSeting.setGrowthParameterId(Integer.parseInt(String.valueOf(data.get("growth_parameter_id"))));
        growthEnviromentSeting.setGrowthParameterMax(Float.parseFloat(String.valueOf(data.get("growth_parameter_max"))));
        growthEnviromentSeting.setGrowthParameterMin(Float.parseFloat(String.valueOf(data.get("growth_parameter_min"))));
        growthEnviromentSeting.setGrowthParameterMin(Float.parseFloat(String.valueOf(data.get("growth_parameter_value"))));
        if ( agricultureService.addGrowthParam(growthEnviromentSeting)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "删除作物信息", operationName = "删除作物信息")
    @RequestMapping(value = "/deleteCropTypeInfo.action")
    public Map<String, Object> deleteCropTypeIno(@RequestBody Map<String, Object> deleteMap) {
        Integer cropTypeInfo_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteCropTypeInfo(cropTypeInfo_id)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询大棚类型", operationName = "查询大棚类型")
    @RequestMapping(value = "/selectDeployNodeInfo.action")
    public Map<String, Object> selectDeployNodeInfo() {
        List<DeployNodeInfo> deployNodeInfos = agricultureService.selectDeployNodeInfo();
        return R.ok().put("data",deployNodeInfos);
    }



    @ResponseBody
    @ArchivesLog(operationType = "查询作物类型", operationName = "查询作物类型")
    @RequestMapping(value = "/selectCropType.action")
    public Map<String, Object> selectCropType() {
       return R.ok().put("data",agricultureService.selectCropType());
    }


    @ResponseBody
    @ArchivesLog(operationType = "查询作物信息", operationName = "查询作物信息")
    @RequestMapping(value = "/selectCropInfo.action")
    public Map<String, Object> selectCropInfo() {
        return R.ok().put("data",agricultureService.selectCropInfo());
    }


    @ResponseBody
    @ArchivesLog(operationType = "查询土壤类型", operationName = "查询土壤类型")
    @RequestMapping(value = "/selectSoilType.action")
    public Map<String, Object> selectSoilType() {
        List<SoilTypeInfo> soilTypeInfos = agricultureService.selectSoilType();
        return R.ok().put("data",soilTypeInfos);
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询生长环境参数类型", operationName = "查询生长环境参数类型")
    @RequestMapping(value = "/selectGrowthParam.action")
    public Map<String, Object> selectGrowthParam() {
        List<GrowthParameter> growthParameters = agricultureService.selectGrowthParam();
        return R.ok().put("data",growthParameters);
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询传感器类型", operationName = "查询传感器类型")
    @RequestMapping(value = "/selectSensorType.action")
    public Map<String, Object> selectSensorType() {
        List<SensorTypeInfo> sensorTypeInfos = agricultureService.selectSensorType();
        return R.ok().put("data",sensorTypeInfos);
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询设备类型", operationName = "查询设备类型")
    @RequestMapping(value = "/selectEquipmentInfo.action")
    public Map<String, Object> selectEquipmentInfo() {
        List<EquipmentInfo> equipmentInfos = agricultureService.selectEquipmentInfo();
        return R.ok().put("data",equipmentInfos);
    }



    @ResponseBody
    @ArchivesLog(operationType = "节点设备信息分页", operationName = "节点设备信息分页")
    @RequestMapping(value = "/selectNodeTypeInfo.action")
    public Map<String, Object> selectNodeTypeInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("nodedevice_sensorconfig_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("作物信息分页成功").put("data", paging);
    }


    @ResponseBody
    @ArchivesLog(operationType = "增加节点设备信息", operationName = "增加节点设备信息")
    @RequestMapping(value = "/addNodeTypeInfo.action")
    public Map<String, Object> addNodeTypeInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo = new NodedeviceSensorconfigInfo();
        nodedeviceSensorconfigInfo.setSensorTypeId(Integer.parseInt(String.valueOf(data.get("sensor_type_id"))));
        nodedeviceSensorconfigInfo.setSensorPosition(String.valueOf(data.get("sensor_position")));
        nodedeviceSensorconfigInfo.setRemark(String.valueOf(data.get("remark")));
        nodedeviceSensorconfigInfo.setDeviceId(Integer.parseInt(String.valueOf(data.get("device_id"))));
        if ( agricultureService.addNodeDeviceInfos(nodedeviceSensorconfigInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改节点设备信息", operationName = "修改节点设备信息")
    @RequestMapping(value = "/updateNodeTypeInfo.action")
    public Map<String, Object> updateNodeTypeIno(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo = new NodedeviceSensorconfigInfo();
        nodedeviceSensorconfigInfo.setDeviceId(Integer.parseInt(String.valueOf(data.get("device_id"))));
        nodedeviceSensorconfigInfo.setSensorTypeId(Integer.parseInt(String.valueOf(data.get("sensor_type_id"))));
        nodedeviceSensorconfigInfo.setSensorPosition(String.valueOf(data.get("sensor_position")));
        nodedeviceSensorconfigInfo.setRemark(String.valueOf(data.get("remark")));
        nodedeviceSensorconfigInfo.setSensorId(Integer.parseInt(String.valueOf(data.get("sensor_id"))));
        if (agricultureService.updateNodeDeviceInfo(nodedeviceSensorconfigInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除节点设备信息", operationName = "删除节点设备信息")
    @RequestMapping(value = "/deleteNodeTypeInfo.action")
    public Map<String, Object> deleteNodeTypeIno(@RequestBody Map<String, Object> deleteMap) {
        Integer nodeDeviceId = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteNodeDeviceInfo(nodeDeviceId)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "种植信息分页", operationName = "种植信息分页")
    @RequestMapping(value = "/selectCropPlantInfo.action")
    public Map<String, Object> selectCropPlantInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("crop_plant_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("作物信息分页成功").put("data", paging);
    }



    @ResponseBody
    @ArchivesLog(operationType = "增加种植信息", operationName = "增加种植信 息")
    @RequestMapping(value = "/addCropPlantInfo.action")
    public Map<String, Object> addCropPlantInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        CropPlantInfo cropPlantInfo = new CropPlantInfo();
        cropPlantInfo.setGreenhouseId(Integer.parseInt(String.valueOf(data.get("greenhouse_id"))));
        cropPlantInfo.setCropId(Integer.parseInt(String.valueOf(data.get("crop_id"))));
        cropPlantInfo.setRemark(String.valueOf(data.get("remark")));
        Timestamp timestamp = new Timestamp(new Date().getTime());
        cropPlantInfo.setCropPlantStarttime(timestamp);
        cropPlantInfo.setCropPlantEndtime(new Timestamp(0));
        if ( agricultureService.addCropPlantInfo(cropPlantInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "增加种植结束信息", operationName = "增加种植结束信息")
    @RequestMapping(value = "/addEndTime.action")
    public Map<String, Object> addEndTime(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        Integer id = Integer.parseInt(String.valueOf(data.get("id")));
        if(agricultureService.addEndTime(id)){
            return R.ok();
        }
        return R.error("结束时间有误，请联系管理员");
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改种植信息", operationName = "修改种植信息")
    @RequestMapping(value = "/updateCropPlantInfo.action")
    public Map<String, Object> updateCropPlantInfo(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        CropPlantInfo cropPlantInfo = new CropPlantInfo();
        cropPlantInfo.setGreenhouseId(Integer.parseInt(String.valueOf(data.get("greenhouse_id"))));
        cropPlantInfo.setCropId(Integer.parseInt(String.valueOf(data.get("crop_id"))));
        cropPlantInfo.setRemark(String.valueOf(data.get("remark")));
        cropPlantInfo.setCropPlantId(Integer.parseInt(String.valueOf(data.get("crop_plant_id"))));
        if (agricultureService.updateCropPlantInfo(cropPlantInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除种植信息", operationName = "删除种植信息")
    @RequestMapping(value = "/deleteCropPlantInfo.action")
    public Map<String, Object> deleteCropPlantInfo(@RequestBody Map<String, Object> deleteMap) {
        Integer cropPlantInfoId = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteCropPlantInfo(cropPlantInfoId)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "处置信息分页", operationName = "处置信息分页")
    @RequestMapping(value = "/selectDisposalInfo.action")
    public Map<String, Object> selectDisposalInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("disposal_method_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("处置信息分页成功").put("data", paging);
    }

    @ResponseBody
    @ArchivesLog(operationType = "增加处置信息", operationName = "增加处置信息")
    @RequestMapping(value = "/addDisposalInfo.action")
    public Map<String, Object> addDisposalInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        DisposalMethodInfo disposalMethodInfo = new DisposalMethodInfo();
        disposalMethodInfo.setDisposalContent(String.valueOf(data.get("disposal_content")));
        disposalMethodInfo.setDisposalMeasure(String.valueOf(data.get("disposal_measure")));
        disposalMethodInfo.setDisposalMethodName(String.valueOf(data.get("disposal_method_name")));
        disposalMethodInfo.setRemark(String.valueOf(data.get("remark")));
        if ( agricultureService.addDisposalInfo(disposalMethodInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改处置信息", operationName = "修改处置信息")
    @RequestMapping(value = "/updateDisposalInfo.action")
    public Map<String, Object> updateDisposalInfo(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        DisposalMethodInfo disposalMethodInfo = new DisposalMethodInfo();
        disposalMethodInfo.setDisposalContent(String.valueOf(data.get("disposal_content")));
        disposalMethodInfo.setDisposalMeasure(String.valueOf(data.get("disposal_measure")));
        disposalMethodInfo.setDisposalMethodName(String.valueOf(data.get("disposal_method_name")));
        disposalMethodInfo.setRemark(String.valueOf(data.get("remark")));
        disposalMethodInfo.setDisposalMethodId(Integer.parseInt(String.valueOf(data.get("disposal_method_id"))));
        if (agricultureService.updateDisposalInfo(disposalMethodInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "删除处置信息", operationName = "删除处置信息")
    @RequestMapping(value = "/deleteDisposalInfo.action")
    public Map<String, Object> deleteDisposalInfo(@RequestBody Map<String, Object> deleteMap) {
        Integer disposalInfoId = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteDisposalInfo(disposalInfoId)) {
            return R.ok();
        } else {
            return R.error();
        }
    }



    @ResponseBody
    @ArchivesLog(operationType = "作物类型分页", operationName = "作物类型分页")
    @RequestMapping(value = "/selectCropVarietiesInfo.action")
    public Map<String, Object> selectCropVarietiesInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = agricultureService.selectPaging("crop_varieties_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("作物信息分页成功").put("data", paging);
    }

    @ResponseBody
    @ArchivesLog(operationType = "增加作物类型", operationName = "增加作物类型")
    @RequestMapping(value = "/addCropVarietiesInfo.action")
    public Map<String, Object> addCropVarietiesInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        CropVarietiesInfo cropVarietiesInfo = new CropVarietiesInfo();
        cropVarietiesInfo.setCropVarietiesName(String.valueOf(data.get("crop_varieties_name")));
        cropVarietiesInfo.setRemark(String.valueOf(data.get("remark")));
      if (agricultureService.addCropVarietiesInfo(cropVarietiesInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改作物类型", operationName = "修改作物类型")
    @RequestMapping(value = "/updateCropVarietiesInfo.action")
    public Map<String, Object> updateCropVarietiesInfo(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        CropVarietiesInfo cropVarietiesInfo = new CropVarietiesInfo();
        cropVarietiesInfo.setCropVarietiesId(Integer.parseInt(String.valueOf(data.get("crop_varieties_id"))));
        cropVarietiesInfo.setCropVarietiesName(String.valueOf(data.get("crop_varieties_name")));
        cropVarietiesInfo.setRemark(String.valueOf(data.get("remark")));
        if (agricultureService.updateCropVarietiesInfo(cropVarietiesInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "删除作物类型", operationName = "删除作物类型")
    @RequestMapping(value = "/deleteCropVarietiesInfo.action")
    public Map<String, Object> deleteCropVarietiesInfo(@RequestBody Map<String, Object> deleteMap) {
        Integer cropVarietiesInfoId = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (agricultureService.deleteCropVarietiesInfo(cropVarietiesInfoId)) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}

