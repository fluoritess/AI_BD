package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
    @Autowired
    NodedeviceSensorconfigInfoMapper nodedeviceSensorconfigInfoMapper;
    @Override
    public void test(List add) {
        NodedeviceSensorconfigInfoExample  nodedeviceSensorconfigInfoExample = new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andSensorPositionEqualTo("土壤根系温度");
        List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos= nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Date day=new Date();
        CollectInfoValue collectInfoValue = new CollectInfoValue();
        Date date = new Date(day.getTime());
        collectInfoValue.setCollectTime(date);
        collectInfoValue.setSensorId(nodedeviceSensorconfigInfos.get(0).getSensorId());
        System.out.println(Float.parseFloat((String)add.get(4)));
        collectInfoValue.setSensorValue(Float.parseFloat((String)add.get(4)));
        collectInfoValueMapper.insertSelective(collectInfoValue);
        NodedeviceSensorconfigInfoExample  nodedeviceSensorconfigInfoExample1 = new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria1=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria1.andSensorPositionEqualTo("土壤表层温度");
        List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos1= nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample1);
        CollectInfoValue collectInfoValue1 = new CollectInfoValue();
        collectInfoValue.setCollectTime(date);
        collectInfoValue.setSensorId(nodedeviceSensorconfigInfos1.get(0).getSensorId());
        collectInfoValue.setSensorValue(Float.parseFloat((String)add.get(5)));
        collectInfoValueMapper.insertSelective(collectInfoValue);
        NodedeviceSensorconfigInfoExample  nodedeviceSensorconfigInfoExample2 = new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria2=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria2.andSensorPositionEqualTo("土壤根系湿度");
        List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos2= nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample2);
        CollectInfoValue collectInfoValue2 = new CollectInfoValue();
        collectInfoValue.setCollectTime(date);
        collectInfoValue.setSensorId(nodedeviceSensorconfigInfos2.get(0).getSensorId());
        collectInfoValue.setSensorValue(Float.parseFloat(String.valueOf(add.get(6))));
        collectInfoValueMapper.insertSelective(collectInfoValue);
    }
}
