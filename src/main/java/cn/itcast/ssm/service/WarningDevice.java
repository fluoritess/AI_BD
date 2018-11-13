package cn.itcast.ssm.service;

import cn.itcast.ssm.util.WarningException;

/**
 * @author wsw
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 2018/11/12 16:47
 */
public interface WarningDevice {
    //0.传感器编号 1.值
    WarningException ValueJudgment(int sensor_id, float value);
}
