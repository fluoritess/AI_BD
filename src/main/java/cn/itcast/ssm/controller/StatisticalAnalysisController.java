package cn.itcast.ssm.controller;

import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.CollectUtil;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import cn.itcast.ssm.service.impl.NodedeviceServiceImpl;
import cn.itcast.ssm.service.impl.StatisticalAnalysisServiceImpl;
import cn.itcast.ssm.service.impl.WarningDeviceImpl;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.*;

/**
 * @author wsw
 * @Package cn.itcast.ssm.controller
 * @Description:
 * @date 2018-10-23 18:28
 */
@Controller
@RequestMapping(value="/collect")
public class StatisticalAnalysisController {
    @Autowired
    StatisticalAnalysisService statisticalAnalysisService;
    @Autowired
    UserUtilMapper userUtilMapper;
    @Autowired
    WarningDeviceImpl warningDevice;
    @Autowired
    NodedeviceServiceImpl nodedeviceService;

    /**
     * 查询环境上下限
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询环境上下限")
    @RequestMapping(value = "/selectParameter.action")
    public Map<String,Object> selectParameter(@RequestBody Map<String, Object> dataMap,HttpSession session){
        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<Map<String,Object>>   list=nodedeviceService.selectLatest(DeviceId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",list);
        return R.ok().put("data",data_);
    }

  /*  *//**
     * 从缓存查询环境上下限
     * @param dataMap
     * @return
     *//*
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询环境上下限")
    @RequestMapping(value = "/selectParameter2.action")
    public Map<String,Object> selectParameter2(@RequestBody Map<String, Object> dataMap,HttpSession session){
        List<LinkedHashMap<String,Object>> parameter=(List)session.getAttribute("parameter");
        return R.ok().put("data",parameter);
    }*/
    /**
     * 查询最新的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询最新的收集数据")
    @RequestMapping(value = "/selectLatest.action")
    public Map<String,Object> selectLatest(@RequestBody Map<String, Object> dataMap){
        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<Map<String,Object>>   list=nodedeviceService.selectLatest(DeviceId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",list);
        return R.ok().put("data",data_);

    }
    /**
     * 查询十五分钟内的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询十五分钟内的收集数据")
    @RequestMapping(value = "/selectQuarter.action")
    public Map<String,Object> selectQuarter(@RequestBody Map<String, Object> dataMap){

        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<CollectUtil> list=statisticalAnalysisService.StatisticalQuarter_3(DeviceId);
        List<List<CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",grouplist);
        return R.ok().put("data",data_);

    }
    /**
     * 查询一小时内的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询一小时内的收集数据")
    @RequestMapping(value = "/selectOneHour.action")
    public Map<String,Object> selectOneHour(@RequestBody Map<String, Object> dataMap){



        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<CollectUtil> list= statisticalAnalysisService.StatisticalOneHour_3(DeviceId);
        List<List<CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",grouplist);
        return R.ok().put("data",data_);

    }
    /**
     * 查询一天内的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询一天内的收集数据")
    @RequestMapping(value = "/selectOneDay.action")
    public Map<String,Object> selectOneDay(@RequestBody Map<String, Object> dataMap){

        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<CollectUtil> list=statisticalAnalysisService.StatisticalOneDay_3(DeviceId);
        List<List<CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",grouplist);
        return R.ok().put("data",data_);
    }
    /**
     * 查询一周内的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询一周内的收集数据")
    @RequestMapping(value = "/selectOneWeek.action")
    public Map<String,Object> selectOneWeek(@RequestBody Map<String, Object> dataMap){

        Integer DeviceId=(Integer)dataMap.get("device_id");
        List<CollectUtil> list=statisticalAnalysisService.StatisticalOneWeek_3(DeviceId);
        List<List<CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",grouplist);
        return R.ok().put("data",data_);
    }

}
