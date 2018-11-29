package cn.itcast.ssm.controller;


import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.SensorService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author:xw and liuyang
 *
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
    public Map<String, Object> selectSensorTypeInfo(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = sensorService.selectPaging("sensor_type_info", (active - 1) * pagelist, pagelist, null, null);
        return R.ok("传感器类型信息分页成功").put("data", paging);
    }


    /**
     * 查找单个数据是否存在
     *
     * @param map 数据
     * @return 是否存在
     */
    @ArchivesLog(operationName = "用户检验信息完整", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/inspectData.action")
    public Map<String, Object> inspectData(@RequestBody Map<String, Object> map) {
        Map<String,Object> datas = (Map<String, Object>) map.get("data");
        Map<String,Object> states = (Map<String, Object>) map.get("states");
        boolean mark = true;
        switch (String.valueOf(states.get("id"))){
            //传感器设备信息
            case "sensorTypeInfo":
                if("name".equals(String.valueOf(datas.get("name"))))
                {
                    mark=sensorService.inspectData("sensor_type_info","sensor_name",String.valueOf(datas.get("data")));
                }
                break;

            //绿色大棚信息
            case "greenHouseInfo":
                if("name".equals(String.valueOf(datas.get("name"))))
                {
                    mark=sensorService.inspectData("greenhouse_info","greenhouse_name",String.valueOf(datas.get("data")));
                }
                break;
            //作物品种信息管理
            case "cropVarietiesInfo":
                if("name".equals(String.valueOf(datas.get("name"))))
                {
                    mark=sensorService.inspectData("crop_varieties_info","crop_varieties_name",String.valueOf(datas.get("data")));
                }
                break;
            //作物信息管理
            case "cropInfo":
                if("name".equals(String.valueOf(datas.get("name"))))
                {
                    mark=sensorService.inspectData("crop_info","crop_name",String.valueOf(datas.get("data")));
                }
                break;
            //土壤信息管理
            case "soilTypeInfo":
                if("name".equals(String.valueOf(datas.get("name"))))
                {
                    mark=sensorService.inspectData("soil_type_info","soil_type_name",String.valueOf(datas.get("data")));
                }
                break;
        }
        //true代表没有注册过
        if(mark) {
            return R.ok();
        }else {
            return  R.error("已存在");
        }

    }


    @ResponseBody
    @ArchivesLog(operationType = "增加传感器类型", operationName = "增加传感器类型")
    @RequestMapping(value = "/addSensorTypeInfo.action")
    public Map<String, Object> addSensorTypeInfo(@RequestBody Map<String, Object> addMap) {
        Map<String, Object> data = (Map<String, Object>) addMap.get("data");
        SensorTypeInfo sensorTypeInfo = new SensorTypeInfo();
        sensorTypeInfo.setSensorName(String.valueOf(data.get("sensor_name")));
        sensorTypeInfo.setRemark(String.valueOf(data.get("remark")));
        sensorTypeInfo.setSensorFuncationRemark(String.valueOf(data.get("sensor_funcation_remark")));
        if (sensorService.addSensorTypeInfos(sensorTypeInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改传感器类型", operationName = "修改传感器类型")
    @RequestMapping(value = "/updateSensorTypeInfo.action")
    public Map<String, Object> updateSenorTypeIno(@RequestBody Map<String, Object> updateMap) {
        Map<String, Object> data = (Map<String, Object>) updateMap.get("data");
        SensorTypeInfo sensorTypeInfo = new SensorTypeInfo();
        sensorTypeInfo.setSensorTypeId(Integer.valueOf(String.valueOf(data.get("sensor_type_id"))));
        sensorTypeInfo.setSensorFuncationRemark(String.valueOf(data.get("sensor_funcation_remark")));
        sensorTypeInfo.setSensorName(String.valueOf(data.get("sensor_name")));
        sensorTypeInfo.setRemark(String.valueOf(data.get("remark")));
        if (sensorService.updateSensorTypeInfo(sensorTypeInfo)) {
            return R.ok();
        } else {
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除传感器类型1", operationName = "删除传感器类型")
    @RequestMapping(value = "/deleteSensorTypeInfo.action")
    public Map<String, Object> deleteSenorTypeIno(@RequestBody Map<String, Object> deleteMap) {
        Integer deploy__node_id= Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (sensorService.deleteSensorTypeInfo(deploy__node_id)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "查询农场", operationName = "查询农场")
    @RequestMapping(value = "/selectAddress.action")
    public Map<String, Object> selectAddress(@RequestBody Map<String, Object> deleteMap) {
        Integer sceneTypeId = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        List<Map<String,Object>> list = new ArrayList<>();
        List<SceneAddressInfo> sceneAddressInfos=sensorService.selectSceneAddressName(sceneTypeId);
       for (SceneAddressInfo sceneAddressInfo:sceneAddressInfos){
           Map<String,Object> map = new HashMap<>();
           map.put("id",sceneAddressInfo.getAddressId());
           map.put("address",sceneAddressInfo.getAddress());
           map.put("name",sceneAddressInfo.getUnitName());
           list.add(map);
       }
        return  R.ok().put("data",list);
    }
    @ResponseBody
    @ArchivesLog(operationType = "查询大棚", operationName = "查询大棚")
    @RequestMapping(value = "/selectGreenHouse.action")
    public Map<String, Object> selectGreenHouse(@RequestBody Map<String, Object> deleteMap) {
        List<Map<String,Object>> list = new ArrayList<>();
        Integer address_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        List<DeployNodeInfo> deployNodeInfos=sensorService.selectGreenHouse(address_id);
        for (DeployNodeInfo deployNodeInfo:deployNodeInfos){
            Map<String,Object> map = new HashMap<>();
            map.put("id",deployNodeInfo.getDeployNodeId());
            map.put("address",deployNodeInfo.getInsideLocation());
            map.put("name",deployNodeInfo.getNodeName());
            list.add(map);
        }
        return  R.ok().put("data",list);
    }

    /**
     * 查询部署节点子信息
     * @param deleteMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询大棚下节点信息", operationName = "查询大棚设备")
    @RequestMapping(value = "/selectDeployNode.action")
    public Map<String, Object> selectDeployNode(@RequestBody Map<String, Object> deleteMap) {
        Integer parent_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        List<DeployNodeInfo> deployNodeInfos=sensorService.selectDeployNode(parent_id);
        return  R.ok().put("data",deployNodeInfos);
    }
    @ResponseBody
    @ArchivesLog(operationType = "查询大棚设备信息", operationName = "查询大棚设备信息")
    @RequestMapping(value = "/selectGreenHouseEquipment.action")
    public Map<String, Object> selectGreenHouseEquipment(@RequestBody Map<String, Object> deleteMap) {
        Integer node_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        List<Map<String,Object>> list = new ArrayList<>();
        List<EquipmentInfo> equipmentInfos=sensorService.selectGreenHouseEquipment(node_id);
        for (EquipmentInfo equipmentInf:equipmentInfos){
            Map<String,Object> map = new HashMap<>();
            map.put("id",equipmentInf.getEquipmentId());
            map.put("name",equipmentInf.getEquipmentName());
            map.put("address",sensorService.selectInsideLocation(node_id));
            list.add(map);
        }
        return  R.ok().put("data",list);
    }

   @ResponseBody
    @ArchivesLog(operationType = "查询传感器", operationName = "查询传感器")
    @RequestMapping(value = "/selectSensor.action")
    public Map<String, Object> selectSensorName(@RequestBody Map<String, Object> deleteMap) {
        Integer equipment_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
       List<Map<String,Object>> list = new ArrayList<>();
       List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos=sensorService.seleceNodedeviceSensorconfigInfo(equipment_id);
       for(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo:nodedeviceSensorconfigInfos){
           Map<String,Object> map = new HashMap<>();
           map.put("id",nodedeviceSensorconfigInfo.getSensorId());
           map.put("name",sensorService.seleceSensorName(nodedeviceSensorconfigInfo.getSensorTypeId()));
            map.put("address",nodedeviceSensorconfigInfo.getSensorPosition());
            list.add(map);
       }
        return  R.ok().put("data",list);
    }


}
