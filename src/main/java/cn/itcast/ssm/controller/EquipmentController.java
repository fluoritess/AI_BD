package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.*;

import cn.itcast.ssm.service.EquipmentService;
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

    /**
     * 添加设备类型信息
     * @param dataMap
     * @return
     */
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

    /**
     * 修改设备类型信息
     * @param dataMap
     * @return
     */
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

    /**
     * 删除设备类型信息
     * @param dataMap
     * @return
     */
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

    /**
     * 查询设备类型信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询设备类型信息")
    @RequestMapping(value = "/selectEquipmentType.action")
    public Map<String,Object> selectEquipmentType(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("equipment_type_info", (active - 1) * pagelist, pagelist);
        return R.ok("查询设备类型分页成功").put("data", paging);
    }

    /**
     * 查询控制类型信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询控制类型信息")
    @RequestMapping(value = "/selectControlType.action")
    public Map<String,Object> selectControlType(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("control_type_info", (active - 1) * pagelist, pagelist);
        return R.ok("查询控制类型类型分页成功").put("data", paging);
    }

    /**
     * 添加设备控制类型信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加设备控制类型信息")
    @RequestMapping(value = "/addControlType.action")
    public Map<String ,Object> addControlType(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        ControlTypeInfo controlTypeInfo = new ControlTypeInfo();
        controlTypeInfo.setControlTypeName(String.valueOf(data.get("control_type_name")));
        controlTypeInfo.setFunctionExplain(String.valueOf(data.get("function_explain")));
        controlTypeInfo.setOther("");
        if (equipmentService.addControlType(controlTypeInfo)) {
            return  R.ok("添加成功");
        }else {
            return  R.error("添加失败");

        }


    }

    /**
     * 删除设备控制类型信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除设备控制类型信息")
    @RequestMapping(value = "/deleteControlType.action")
    public Map<String ,Object> deleteControlType(@RequestBody Map<String,Object> dataMap) {
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        Integer id = Integer.parseInt(String.valueOf(dataMap.get("id")));
        if (equipmentService.deleteControlType(id)) {
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 查询所有的设备使用场景
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectScene.action")
    public Map<String,Object> selectScene(){
        List<EquipmentUseScene> list=new ArrayList<>();
        list=equipmentService.selectScene();
        Map<String,Object> data=new HashMap<>();
        data.put("list",list);
        return R.ok().put("data",data);
    }

    /**
     * 添加场景地址信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加场景地址信息")
    @RequestMapping(value = "/addSceneAddress.action")
    public Map<String,Object> addSceneAddress(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        SceneAddressInfo sceneAddressInfo=new SceneAddressInfo();
        sceneAddressInfo.setUnitName(String.valueOf(data.get("unit_name")));
        sceneAddressInfo.setAddress(String.valueOf(data.get("address")));
        sceneAddressInfo.setInterpret(String.valueOf(data.get("interpret")));
        sceneAddressInfo.setTypeId(Integer.parseInt(String.valueOf(data.get("type_id"))));
        if(equipmentService.addSceneAddress(sceneAddressInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 修改控制类型信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改控制类型信息")
    @RequestMapping(value = "/updateControlType.action")
    public Map<String,Object> updateControlType(@RequestBody Map<String,Object> dataMap){
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        ControlTypeInfo controlTypeInfo = new ControlTypeInfo();
        controlTypeInfo.setControlTypeId(Integer.parseInt(String.valueOf(data.get("control_type_id"))));
        controlTypeInfo.setControlTypeName(String.valueOf(data.get("control_type_name")));
        controlTypeInfo.setFunctionExplain(String.valueOf(data.get("function_explain")));
        if (equipmentService.updateControlType(controlTypeInfo)) {
            return R.ok();
        }else {
            return R.error();
        }
    }

    /**
     * 修改场景地址信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改场景地址信息")
    @RequestMapping(value = "/modifySceneAddress.action")
    public Map<String,Object> modifySceneAddress(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        SceneAddressInfo sceneAddressInfo=new SceneAddressInfo();
        sceneAddressInfo.setAddressId(Integer.parseInt(String.valueOf(data.get("address_id"))));
        sceneAddressInfo.setUnitName(String.valueOf(data.get("unit_name")));
        sceneAddressInfo.setAddress(String.valueOf(data.get("address")));
        sceneAddressInfo.setInterpret(String.valueOf(data.get("interpret")));
        sceneAddressInfo.setTypeId(Integer.parseInt(String.valueOf(data.get("type_id"))));
        if(equipmentService.modifySceneAddress(sceneAddressInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }


    /**
     * 删除场景地址信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除场景地址信息")
    @RequestMapping(value = "/deleteSceneAddress.action")
    public Map<String,Object> deleteSceneAddress(@RequestBody Map<String,Object> dataMap){
        Integer id=Integer.parseInt(String.valueOf(dataMap.get("id")));
        if(equipmentService.deleteSceneAddress(id)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 查询场景地址信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询场景地址信息")
    @RequestMapping(value = "/selectSceneAddress.action")
    public Map<String,Object> selectSceneAddress(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("scene_address_info", (active - 1) * pagelist, pagelist);
        return R.ok("查询场景地址分页成功").put("data", paging);
    }

    /**
     * 查询所有的场景地址
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectAllAddress.action")
    public Map<String,Object> selectAllAddress(){
        List<SceneAddressInfo> list=new ArrayList<>();
        list=equipmentService.selectAllAddress();
        Map<String,Object> data=new HashMap<>();
        data.put("list",list);
        return R.ok().put("data",data);
    }

    /**
     * 添加部署节点信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加部署节点信息")
    @RequestMapping(value = "/addDeployNode.action")
    public Map<String,Object> addDeployNode(@RequestBody Map<String,Object> dataMap){
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        DeployNodeInfo deployNodeInfo=new DeployNodeInfo();
        deployNodeInfo.setAddressId(Integer.parseInt(String.valueOf(data.get("address_id"))));
        deployNodeInfo.setInsideLocation(String.valueOf(data.get("inside_location")));
        deployNodeInfo.setNodeName(String.valueOf(data.get("node_name")));
        deployNodeInfo.setPurposeExplain(String.valueOf(data.get("purpose_explain")));
        deployNodeInfo.setRemarks(String.valueOf(data.get("remarks")));
        if(equipmentService.addDeployNode(deployNodeInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 修改部署节点信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改部署节点信息")
    @RequestMapping(value = "/modifyDeployNode.action")
    public Map<String,Object> modifyDeployNode(@RequestBody Map<String,Object> dataMap){
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        DeployNodeInfo deployNodeInfo=new DeployNodeInfo();
        deployNodeInfo.setDeployNodeId(Integer.parseInt(String.valueOf(data.get("deploy_node_id"))));
        deployNodeInfo.setAddressId(Integer.parseInt(String.valueOf(data.get("address_id"))));
        deployNodeInfo.setInsideLocation(String.valueOf(data.get("inside_location")));
        deployNodeInfo.setNodeName(String.valueOf(data.get("node_name")));
        deployNodeInfo.setPurposeExplain(String.valueOf(data.get("purpose_explain")));
        deployNodeInfo.setRemarks(String.valueOf(data.get("remarks")));
        if(equipmentService.modifyDeployNode(deployNodeInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 删除部署节点信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除部署节点信息")
    @RequestMapping(value = "/deleteDeployNode.action")
    public Map<String,Object> deleteDeployNode(@RequestBody Map<String,Object> dataMap){
        Integer id=Integer.parseInt(String.valueOf(dataMap.get("id")));
        if(equipmentService.deleteDeployNode(id)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 查询部署节点信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询部署节点信息")
    @RequestMapping(value = "/selectDeployNode.action")
    public Map<String,Object> selectDeployNode(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("deploy_node_info", (active - 1) * pagelist, pagelist);
        return R.ok("查询部署节点分页成功").put("data", paging);
    }
    /**
     * 查询场景类别信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询场景类别信息")
    @RequestMapping(value = "/selectUseScene.action")
    public Map<String,Object> selectUserScene(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("equipment_use_scene", (active - 1) * pagelist, pagelist);
        return R.ok("查询场景类别分页成功").put("data", paging);
    }

    /**
     * 添加场景信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加场景信息")
    @RequestMapping(value = "/addUseScene.action")
    public Map<String ,Object> addUserScene(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        EquipmentUseScene equipmentUseScene = new EquipmentUseScene();
        equipmentUseScene.setInterpret(String.valueOf(data.get("interpret")));
        equipmentUseScene.setName(String.valueOf(data.get("name")));
        equipmentUseScene.setOther("");
        if (equipmentService.addUserScene(equipmentUseScene)) {
            return  R.ok("添加成功");

        }else {
            return  R.error("添加失败");

        }
    }

    /**
     * 修改使用场景
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改使用场景信息")
    @RequestMapping(value = "/updateUseScene.action")
    public Map<String,Object> updateUserScene(@RequestBody Map<String,Object> dataMap){
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        EquipmentUseScene equipmentUseScene=new EquipmentUseScene();
        equipmentUseScene.setTypeId(Integer.parseInt(String.valueOf(data.get("type_id"))));
        equipmentUseScene.setName(String.valueOf(data.get("name")));
        equipmentUseScene.setInterpret(String.valueOf(data.get("interpret")));
        equipmentUseScene.setOther("");
        if(equipmentService.updateUserScene(equipmentUseScene)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 删除使用场景
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除使用场景信息")
    @RequestMapping(value = "/deleteUseScene.action")
    public Map<String,Object> deleteUseScene(@RequestBody Map<String,Object> dataMap){
        Integer id=Integer.parseInt(String.valueOf(dataMap.get("id")));
        if(equipmentService.deleteUseScene(id)){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 查询厂商信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询厂商信息")
    @RequestMapping(value = "/selectManufacturerInfo.action")
    public Map<String,Object> selectManufacturerInfo(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = equipmentService.selectPaging("manufacturer_info", (active - 1) * pagelist, pagelist);
        return R.ok("查询厂商信息分页成功").put("data", paging);
    }

    /**
     * 添加厂商信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "添加信息", operationName = "添加厂商信息")
    @RequestMapping(value = "/addManufacturerInfo.action")
    public Map<String ,Object> addManufacturerInfo(@RequestBody Map<String,Object> dataMap){
        Map<String,Object> data = (Map<String,Object>)dataMap.get("data");
        ManufacturerInfo manufacturerInfo = new ManufacturerInfo();
        manufacturerInfo.setManufacturerName(String.valueOf(data.get("manufacturer_name")));
        manufacturerInfo.setManufacturerDiscripte(String.valueOf(data.get("manufacturer_discripte")));
        manufacturerInfo.setOther("");
        if (equipmentService.addManufacturerInfo(manufacturerInfo)) {
            return  R.ok("添加成功");

        }else {
            return  R.error("添加失败");

        }
    }

    /**
     * 修改厂商信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "修改信息", operationName = "修改厂商信息")
    @RequestMapping(value = "/updateManufacturerInfo.action")
    public Map<String,Object> updateManufacturerInfo(@RequestBody Map<String,Object> dataMap){
        Map<String, Object> data = (Map<String, Object>) dataMap.get("data");
        ManufacturerInfo manufacturerInfo=new ManufacturerInfo();
        manufacturerInfo.setManufacturerId(Integer.parseInt(String.valueOf(data.get("manufacturer_id"))));
        manufacturerInfo.setManufacturerName(String.valueOf(data.get("manufacturer_name")));
        manufacturerInfo.setManufacturerDiscripte(String.valueOf(data.get("manufacturer_discripte")));
        manufacturerInfo.setOther("");
        if(equipmentService.updateManufacturerInfo(manufacturerInfo)){
            return R.ok();
        }else{
            return R.error();
        }
    }
    /**
     * 删除厂商信息
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除厂商信息")
    @RequestMapping(value = "/deleteManufacturerInfo.action")
    public Map<String,Object> deleteManufacturerInfo(@RequestBody Map<String,Object> dataMap){
        Integer manufacturer_id=Integer.parseInt(String.valueOf(dataMap.get("id")));
        if(equipmentService.deleteManufacturerInfo(manufacturer_id)){
            return R.ok();
        }else{
            return R.error();
        }
    }

}
