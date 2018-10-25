package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CollectInfoValue;

import java.sql.Date;
import java.util.List;

/**
        * @author wsw
        * @Package cn.itcast.ssm.service
        * @Description:
        * @date 2018/10/20 22:22
        */
public interface StatisticalAnalysisService {
    /*
    * 查询最新数据
    * */
    CollectInfoValue selectLatest(Integer SensorId);
        /*
        * 统计十五分钟内的数据
        * */
        List<CollectInfoValue> StatisticalQuarter(Integer SensorId);
        /*
        * 统计一小时内的数据
        */
        List<CollectInfoValue>  StatisticalOneHour(Integer SensorId);

        /*
        * 统计一天内的数据
        * */
        List<CollectInfoValue> StatisticalOneDay(Integer SensorId);

        /*
        * 统计一周内的数据
        * */
        List<CollectInfoValue>  StatisticalOneWeek(Integer SensorId);

}
