package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.EquipmentTypeInfo;
import cn.itcast.ssm.service.impl.predictDataImpl;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package cn.itcast.ssm.controller
 * @Description:
 * @date 2018-10-27 12:53
 */
@SuppressWarnings("ALL")
@Controller
@RequestMapping(value = "/predict")
public class predictDataController {
    @Autowired
    predictDataImpl predictData;
    /**
     * 预测未来一天数据，间隔一小时
     * @param dataMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "预测信息", operationName = "预测未来一天信息")
    @RequestMapping(value = "/predictOneDay.action")
    public Map<String,Object> addEquipmentType(@RequestBody Map<String,Object> dataMap){
        Integer SensorId=(Integer)dataMap.get("sensor_id");
        List<CollectInfoValue> list=predictData.predictOneDay(SensorId);
        Map<String,Object> data_=new HashMap<>();
        data_.put("list",list);
        return R.ok().put("data",data_);
    }
}
