package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.impl.StatisticalAnalysisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author wsw
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 2018/12/18 19:02
 */
public interface NodedeviceService {
        /*
         * 统计十五分钟内的数据
         * */
        List<List<CollectInfoValue>> StatisticalQuarter(Integer device_id);
        /*
         * 查询最新数据
         * */

        List<Map<String,Object>> selectLatest(Integer device_id);
        /*
         * 统计一小时内的数据
         */

        List<List<CollectInfoValue>> StatisticalOneHour(Integer device_id);

        /*
         * 统计一天内的数据
         * */


        List<List<CollectInfoValue>> StatisticalOneDay(Integer device_id);

        /*
         * 统计一周内的数据
         * */


        List<List<CollectInfoValue>> StatisticalOneWeek(Integer device_id);
}
