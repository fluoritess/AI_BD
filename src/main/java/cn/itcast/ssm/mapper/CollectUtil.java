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

    List<Map<String,Object>>sensorAllValue (Integer EquipmentId);

}
