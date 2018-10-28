package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CollectInfoValue;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author wsw
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 2018/10/27 11:02
 */
public interface predictData {
    /*
     * 统一一天的数据并预测一天后的数据
     * */
    List<CollectInfoValue> predictOneDay(Integer SensorId);
    /*
    * 灰色模型预测一天后的数据
    * */
    double[] predictOneDayGM(Integer SensorId);
}
