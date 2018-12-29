package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CollectInfoValue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface  CollectUtil {
        List<CollectInfoValue> selectOneDay(Integer SensorId);

        List<CollectInfoValue> selectOneWeek(Integer SensorId);

         List<CollectInfoValue> selectQuarter(Integer SensorId);

    List<CollectInfoValue> selectOneHour(Integer SensorId);

    CollectInfoValue selectLatest(Integer SensorId);




    List<cn.itcast.ssm.po.CollectUtil> selectOneDay_2(Integer SensorId);

    List<cn.itcast.ssm.po.CollectUtil> selectOneWeek_2(Integer SensorId);

    List<cn.itcast.ssm.po.CollectUtil> selectQuarter_2(Integer SensorId);

    List<cn.itcast.ssm.po.CollectUtil> selectOneHour_2(Integer SensorId);

    cn.itcast.ssm.po.CollectUtil selectLatest_2(Integer SensorId);

    List<Map<String,Object>>sensorAllValue (Integer EquipmentId);
}
