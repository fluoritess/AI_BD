package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CollectInfoValue;
import org.springframework.stereotype.Repository;

import java.util.List;
/**/
@Repository
public interface CollectInfoUtil {
    List<cn.itcast.ssm.po.CollectInfoValue> selectOneDay(Integer SensorId);

    List<cn.itcast.ssm.po.CollectInfoValue> selectOneWeek(Integer SensorId);

    List<cn.itcast.ssm.po.CollectInfoValue> selectQuarter(Integer SensorId);

    List<cn.itcast.ssm.po.CollectInfoValue> selectOneHour(Integer SensorId);

    CollectInfoValue selectLatest(Integer SensorId);
}
