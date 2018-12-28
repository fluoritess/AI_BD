package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.CollectUtil;

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

    /*
     * 统计今天的数据2.0
     * */
    List<CollectInfoValue> StatisticalOneDay_2(Integer SensorId);
    /*
     * 统计一周内的数据2.0
     * */
    List<CollectInfoValue>  StatisticalOneWeek_2(Integer SensorId);
    /*
    * 统计十五分钟2.0
    * */
    List<CollectInfoValue>  StatisticalQuarter_2(Integer SensorId);
    /*
    * 统计一小时2.0
    * */
    List<CollectInfoValue> StatisticalOneHour_2(Integer SensorId);
    /*
     * 查询最新数据2.0
     * */
    CollectInfoValue selectLatest_2(Integer SensorId);
    /*
    * 由于需求变更下面是3.0版本
    * */
    /*
     * 统计今天的数据3.0
     * */
    List<CollectUtil> StatisticalOneDay_3(Integer device_id);
    /*
     * 统计一周内的数据3.0
     * */
    List<CollectUtil>  StatisticalOneWeek_3(Integer device_id);
    /*
     * 统计十五分钟3.0
     * */
    List<CollectUtil>  StatisticalQuarter_3(Integer device_id);
    /*
     * 统计一小时3.0
     * */
    List<CollectUtil> StatisticalOneHour_3(Integer device_id);
    /*
     * 查询最新数据3.0
     * */
    CollectUtil selectLatest_3(Integer device_id);
}
