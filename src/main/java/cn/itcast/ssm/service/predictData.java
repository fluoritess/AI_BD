package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CollectInfoValue;
import org.springframework.stereotype.Service;

import java.util.List;

public interface predictData {
    /*
     * 统一一天的数据并预测一天后的数据
     * */
    List<CollectInfoValue> predictOneDay(Integer SensorId);
}
