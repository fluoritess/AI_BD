package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    /**
     * 查询十五分钟内的收集数据
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询十五分钟内的收集数据")
    @RequestMapping(value = "/selectQuarter.action")
    public Map<String,Object> selectQuarter(@RequestBody Map<String, Object> dataMap){

        Integer SensorId=(Integer)dataMap.get("sensor_id");
        List<CollectInfoValue> collectInfoValueList=statisticalAnalysisService.StatisticalQuarter(SensorId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",collectInfoValueList);
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

        Integer SensorId=(Integer)dataMap.get("sensor_id");
        List<CollectInfoValue> collectInfoValueList=statisticalAnalysisService.StatisticalOneHour(SensorId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",collectInfoValueList);
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

        Integer SensorId=(Integer)dataMap.get("sensor_id");
        List<CollectInfoValue> collectInfoValueList=statisticalAnalysisService.StatisticalOneDay(SensorId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",collectInfoValueList);
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

        Integer SensorId=(Integer)dataMap.get("sensor_id");
        List<CollectInfoValue> collectInfoValueList=statisticalAnalysisService.StatisticalOneWeek(SensorId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",collectInfoValueList);
        return R.ok().put("data",data_);
    }

}
