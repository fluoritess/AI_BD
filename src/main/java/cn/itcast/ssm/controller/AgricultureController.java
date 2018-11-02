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
    @ArchivesLog(operationType = "查询作物类型", operationName = "查询作物类型")
    @RequestMapping(value = "/selectCropType.action")
    public Map<String, Object> selectCropType() {
       return R.ok().put("data",agricultureService.selectCropType());
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询土壤类型", operationName = "查询土壤类型")
    @RequestMapping(value = "/selectSoilType.action")
    public Map<String, Object> selectSoilType() {
        List<SoilTypeInfo> soilTypeInfos = agricultureService.selectSoilType();
        return R.ok().put("data",soilTypeInfos);
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
        nodedeviceSensorconfigInfo.setSensorTypeId(Integer.parseInt(String.valueOf(data.get("sensor_id"))));
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
        nodedeviceSensorconfigInfo.setSensorTypeId(Integer.parseInt(String.valueOf(data.get("sensor_id"))));
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

}

