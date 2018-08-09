package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.EquipmentTypeInfo;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.controller
 * @Description:
 * @date 18-8-9 上午10:35
 */
@Controller
@RequestMapping(value = "/equipment")
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加设备类型信息")
    @RequestMapping(value = "/addEquipmentType.action")
    public Map<String,Object> addEquipmentType(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        EquipmentTypeInfo equipmentTypeInfo=new EquipmentTypeInfo();
        equipmentTypeInfo.setEquipmentTypeName(String.valueOf(data.get("equipment_type_name")));
        equipmentTypeInfo.setFunctionExplain(String.valueOf(data.get("function_explain")));
        if(equipmentService.addEquipmentType(equipmentTypeInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改设备类型信息")
    @RequestMapping(value = "/modifyEquipmentType.action")
    public Map<String,Object> modifyEquipmentType(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        EquipmentTypeInfo equipmentTypeInfo=new EquipmentTypeInfo();
        equipmentTypeInfo.setEquipmentTypeId(Integer.parseInt(String.valueOf(data.get("equipment_type_id"))));
        equipmentTypeInfo.setEquipmentTypeName(String.valueOf(data.get("equipment_type_name")));
        equipmentTypeInfo.setFunctionExplain(String.valueOf(data.get("function_explain")));
        if(equipmentService.modifyEquipmentType(equipmentTypeInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除设备类型信息")
    @RequestMapping(value = "/deleteEquipmentType.action")
    public Map<String,Object> deleteEquipmentType(@RequestBody Map<String,Object> dataMap){
        Integer id=Integer.parseInt(String.valueOf(dataMap.get("id")));
        if(equipmentService.deleteEquipmentType(id)){
            return R.ok();
        }else{
            return R.error();
        }
    }




}
