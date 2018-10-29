package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:05 2018/10/24
 * Modified By:
 */
@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;

    @Override
    public void test(String add) {
        Date day=new Date();
        CollectInfoValue collectInfoValue = new CollectInfoValue();
        Date date = new Date(day.getTime());
        collectInfoValue.setCollectTime(date);
        collectInfoValue.setSensorId(1);
        collectInfoValue.setSensorValue( Float.parseFloat(add));
        collectInfoValueMapper.insertSelective(collectInfoValue);
    }
}
