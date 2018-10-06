package cn.itcast.ssm.controller;


import cn.itcast.ssm.po.SensorTypeInfo;
import cn.itcast.ssm.service.SensorService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * author:xw
 * @Package cn.itcast.ssm.controller
 */
@Controller
@RequestMapping("/Sensor")
public class SensorController {

    @Autowired
    SensorService sensorService;

    @ResponseBody
    @ArchivesLog(operationType = "传感器类型信息分页", operationName = "传感器类型信息分页")
    @RequestMapping(value = "/selectSensorTypeInfo.action")
    public Map<String,Object> selectSensorTypeInfo(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = sensorService.selectPaging("sensor_type_info", (active - 1) * pagelist, pagelist,null,null);
        return R.ok("传感器类型信息分页成功").put("data", paging);
    }

    @ResponseBody
    @ArchivesLog(operationType = "增加传感器类型", operationName = "增加传感器类型")
    @RequestMapping(value = "/addSensorTypeInfo.action")
    public Map<String,Object> addSensorTypeInfo(@RequestBody Map<String,Object> addMap){
        Map<String,Object> data = (Map<String, Object>) addMap.get("data");
        SensorTypeInfo sensorTypeInfo = new SensorTypeInfo();
        sensorTypeInfo.setSensorName(String.valueOf(data.get("sensor_name")));
        sensorTypeInfo.setRemark(String.valueOf(data.get("remark")));
        sensorTypeInfo.setSensorFuncationRemark(String.valueOf(data.get("sensor_funcation_remark")));
        if(sensorService.addSensorTypeInfos(sensorTypeInfo)){
            return R.ok();
        }else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改传感器类型", operationName = "修改传感器类型")
    @RequestMapping(value = "/updateSensorTypeInfo.action")
    public Map<String,Object> updateSenorTypeIno(@RequestBody Map<String,Object> updateMap){
        Map<String,Object> data = (Map<String, Object>) updateMap.get("data");
        SensorTypeInfo sensorTypeInfo = new SensorTypeInfo();
        sensorTypeInfo.setSensorTypeId(Integer.valueOf(String.valueOf(data.get("sensor_type_id"))));
        sensorTypeInfo.setSensorFuncationRemark(String.valueOf(data.get("sensor_funcation_remark")));
        sensorTypeInfo.setSensorName(String.valueOf(data.get("sensor_name")));
        sensorTypeInfo.setRemark(String.valueOf(data.get("remark")));
        if(sensorService.updateSensorTypeInfo(sensorTypeInfo)) {
            return R.ok();
        }else{
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除传感器类型1", operationName = "删除传感器类型")
    @RequestMapping(value = "/deleteSensorTypeInfo.action")
    public Map<String,Object> deleteSenorTypeIno(@RequestBody Map<String,Object> deleteMap){
        Map<String,Object> data = (Map<String, Object>) deleteMap.get("data");
        Integer sensorTypeInfo_id = Integer.valueOf(String.valueOf(data.get("id")));
        if(sensorService.deleteSensorTypeInfo(sensorTypeInfo_id)) {
            return R.ok();
        }else{
            return R.error();
        }
    }

}
