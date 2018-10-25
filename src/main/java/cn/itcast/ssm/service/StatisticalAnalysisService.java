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
        * 统计十五分钟内的数据
        * */
        List<CollectInfoValue> StatisticalQuarter(java.util.Date date,Integer SensorId);
        /*
        * 统计一小时内的数据
        */
        List<CollectInfoValue>  StatisticalOneHour(java.util.Date date,Integer SensorId);

        /*
        * 统计一天内的数据
        * */
        List<CollectInfoValue> StatisticalOneDay(java.util.Date  date,Integer SensorId);

        /*
        * 统计一周内的数据
        * */
        List<CollectInfoValue>  StatisticalOneWeek(java.util.Date  date,Integer SensorId);

}
