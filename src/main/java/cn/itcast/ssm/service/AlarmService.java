package cn.itcast.ssm.service;

import cn.itcast.ssm.util.Paging;
/**
 * @author wsw
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 18-11-19 下午20:10
 */
public interface AlarmService {
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);
    boolean deleteAlarmInfo(Integer typeId);
}
