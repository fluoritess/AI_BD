package cn.itcast.ssm.service;

import cn.itcast.ssm.po.GreenhouseInfo;
import cn.itcast.ssm.util.Paging;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 15:25 2018/10/8
 * Modified By:
 */
public interface GreenHouseService {
    /**
     * 查询分页
     * @param name 数据库表名
     * @param offset 当前页
     * @param pageSize 每页大小
     * @return
     */
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);

    /**
     * 增加大棚类型
     */
    boolean addGreenHouseInfos(GreenhouseInfo greenhouseInfo);

    /**
     * 修改传感器类型
     */
    boolean updateSensorTypeInfo(GreenhouseInfo greenhouseInfo);

    /**
     * 删除传感器类型
     */
    boolean deleteSensorTypeInfo(Integer typeId);

}
