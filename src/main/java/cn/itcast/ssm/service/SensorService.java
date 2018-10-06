package cn.itcast.ssm.service;

import cn.itcast.ssm.po.SensorTypeInfo;
import cn.itcast.ssm.util.Paging;

public interface SensorService {
    /**
     * 查询分页
     * @param name 数据库表名
     * @param offset 当前页
     * @param pageSize 每页大小
     * @return
     */
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);

    /**
     * 增加传感器类型
     */
    boolean addSensorTypeInfos(SensorTypeInfo sensorTypeInfo);

    /**
     * 修改传感器类型
     */
    boolean updateSensorTypeInfo(SensorTypeInfo sensorTypeInfo);

    /**
     * 删除传感器类型
     */
    boolean deleteSensorTypeInfo(Integer typeId);
}
