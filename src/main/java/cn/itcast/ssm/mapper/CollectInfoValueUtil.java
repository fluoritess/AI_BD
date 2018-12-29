package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CollectInfoValue;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectInfoValueUtil {
    List<CollectInfoValue> selectOneDay(Integer SensorId);

    List<CollectInfoValue> selectOneWeek(Integer SensorId);

    List<CollectInfoValue> selectQuarter(Integer SensorId);

    List<CollectInfoValue> selectOneHour(Integer SensorId);

    CollectInfoValue selectLatest(Integer SensorId);
}
