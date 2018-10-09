package cn.itcast.ssm.controller;


import cn.itcast.ssm.po.GreenhouseInfo;
import cn.itcast.ssm.po.SensorTypeInfo;
import cn.itcast.ssm.service.GreenHouseService;
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
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 15:07 2018/10/8
 * Modified By:
 */
@SuppressWarnings("ALL")
@Controller
@RequestMapping(value  = "/greenHouseInfo")
public class GreenHouseController {
    @Autowired
    GreenHouseService greenHouseService;
    /**
     *查询大棚信息
     *
     */
    @ResponseBody
    @ArchivesLog(operationType = "大棚类型信息分页", operationName = "大棚类型信息分页")
    @RequestMapping(value = "/selectGreenHouseInfo.action")
    public Map<String,Object> selectGreenHouseInfo(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = greenHouseService.selectPaging("greenhouse_info", (active - 1) * pagelist, pagelist,null,null);
        return R.ok("大棚类型信息分页成功").put("data", paging);
    }
    @ResponseBody
    @ArchivesLog(operationType = "增加大棚类型", operationName = "增加大棚类型")
    @RequestMapping(value = "/addGreenHouseInfo.action")
    public Map<String,Object> addGreenHouseInfo(@RequestBody Map<String,Object> addMap){
        Map<String,Object> data = (Map<String, Object>) addMap.get("data");
        GreenhouseInfo greenhouseInfo = new GreenhouseInfo();
        greenhouseInfo.setGreenhouseName(String.valueOf(data.get("greenhouse_name")));
        greenhouseInfo.setRemark(String.valueOf(data.get("remark")));
        greenhouseInfo.setGreenhouseAddress(String.valueOf(data.get("greenhouse_address")));
        greenhouseInfo.setGreenhouseUseage(String.valueOf(data.get("greenhouse_useage")));
        greenhouseInfo.setGreenhouseId(Integer.parseInt(String.valueOf(data.get("greenhouse_id"))));
        if(greenHouseService.addGreenHouseInfos(greenhouseInfo)){
            return R.ok();
        }else {
            return R.error();
        }
    }

    @ResponseBody
    @ArchivesLog(operationType = "修改大棚类型", operationName = "修改大棚类型")
    @RequestMapping(value = "/updateGreenHouseInfo.action")
    public Map<String,Object> updateGreenHouseInfo(@RequestBody Map<String,Object> updateMap){
        Map<String,Object> data = (Map<String, Object>) updateMap.get("data");
        GreenhouseInfo greenhouseInfo = new GreenhouseInfo();
        greenhouseInfo.setGreenhouseId(Integer.valueOf(String.valueOf(data.get("greenhouse_id"))));
        greenhouseInfo.setGreenhouseUseage(String.valueOf(data.get("greenhouse_useage")));
        greenhouseInfo.setGreenhouseName(String.valueOf(data.get("greenhouse_name")));
        greenhouseInfo.setGreenhouseAddress(String.valueOf(data.get("greenhouse_address")));
        greenhouseInfo.setRemark(String.valueOf(data.get("remark")));
        if(greenHouseService.updateSensorTypeInfo(greenhouseInfo)) {
            return R.ok();
        }else{
            return R.error();
        }
    }


    @ResponseBody
    @ArchivesLog(operationType = "删除大棚类型", operationName = "删除大棚类型")
    @RequestMapping(value = "/deleteGreenHouseInfo.action")
    public Map<String,Object> deleteGreenHouseInfo(@RequestBody Map<String,Object> deleteMap){
        Integer greenhouseInfo_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if(greenHouseService.deleteSensorTypeInfo(greenhouseInfo_id)) {
            return R.ok();
        }else{
            return R.error();
        }
    }

}
