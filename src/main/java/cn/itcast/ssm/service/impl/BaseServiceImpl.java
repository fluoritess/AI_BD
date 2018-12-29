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
        List<NodedeviceSensorconfigInfo> nodedeviceSensorconfigInfos= nodedeviceSensorconfigInfoMapper.selectByExample(null);
        Date day=new Date();
        Date date = new Date(day.getTime());
        for (NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo:nodedeviceSensorconfigInfos){
           if ("土壤根系温度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               CollectInfoValue collectInfoValue = new CollectInfoValue();
               collectInfoValue.setCollectTime(date);
               collectInfoValue.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue.setSensorValue(Float.parseFloat((String)add.get(4)));
               collectInfoValueMapper.insertSelective(collectInfoValue);
            }
            else  if ("土壤表层温度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
                CollectInfoValue collectInfoValue1 = new CollectInfoValue();
                collectInfoValue1.setCollectTime(date);
                collectInfoValue1.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
                collectInfoValue1.setSensorValue(Float.parseFloat((String)add.get(5)));
                collectInfoValueMapper.insertSelective(collectInfoValue1);
            } else if ("土壤根系湿度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
                CollectInfoValue collectInfoValue2 = new CollectInfoValue();
                collectInfoValue2.setCollectTime(date);
                collectInfoValue2.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
                collectInfoValue2.setSensorValue(Float.parseFloat((String)add.get(6)));
                collectInfoValueMapper.insertSelective(collectInfoValue2);
            }

        }


    }
}
