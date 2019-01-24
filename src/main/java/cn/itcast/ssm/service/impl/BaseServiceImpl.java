package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.BaseService;
import cn.itcast.ssm.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 18:05 2018/10/24
 * Modified By:
 */
@Service
public class BaseServiceImpl implements BaseService,Constant {

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
               map.put("土壤根系温度",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue = new CollectInfoValue();
               collectInfoValue.setCollectTime(date);
               collectInfoValue.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue.setSensorValue(Float.parseFloat((String)add.get(4)));
               collectInfoValueMapper.insertSelective(collectInfoValue);

            }
            else  if ("土壤表层温度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("土壤表层温度",nodedeviceSensorconfigInfo.getSensorId());
                CollectInfoValue collectInfoValue1 = new CollectInfoValue();
                collectInfoValue1.setCollectTime(date);
                collectInfoValue1.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
                collectInfoValue1.setSensorValue(Float.parseFloat((String)add.get(5)));
                collectInfoValueMapper.insertSelective(collectInfoValue1);
            } else if ("土壤根系湿度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("土壤根系湿度",nodedeviceSensorconfigInfo.getSensorId());
                CollectInfoValue collectInfoValue3 = new CollectInfoValue();
                collectInfoValue3.setCollectTime(date);
                collectInfoValue3.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
                collectInfoValue3.setSensorValue(Float.parseFloat((String)add.get(6)));
                collectInfoValueMapper.insertSelective(collectInfoValue3);
            }
           else if ("土壤表层湿度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("土壤表层湿度",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue4 = new CollectInfoValue();
               collectInfoValue4.setCollectTime(date);
               collectInfoValue4.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue4.setSensorValue(Float.parseFloat((String)add.get(7)));
               collectInfoValueMapper.insertSelective(collectInfoValue4);
           }
           else if ("温室温度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("温室温度",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue5 = new CollectInfoValue();
               collectInfoValue5.setCollectTime(date);
               collectInfoValue5.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue5.setSensorValue(Float.parseFloat((String)add.get(8)));
               collectInfoValueMapper.insertSelective(collectInfoValue5);
           }
           else if ("温室湿度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("温室湿度",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue6 = new CollectInfoValue();
               collectInfoValue6.setCollectTime(date);
               collectInfoValue6.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue6.setSensorValue(Float.parseFloat((String)add.get(9)));
               collectInfoValueMapper.insertSelective(collectInfoValue6);
           }
           else if ("温室气压".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("温室气压",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue7 = new CollectInfoValue();
               collectInfoValue7.setCollectTime(date);
               collectInfoValue7.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue7.setSensorValue(Float.parseFloat((String)add.get(10)));
               collectInfoValueMapper.insertSelective(collectInfoValue7);
           }
           else if ("温室二氧化碳浓度".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("温室二氧化碳浓度",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue8 = new CollectInfoValue();
               collectInfoValue8.setCollectTime(date);
               collectInfoValue8.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue8.setSensorValue(Float.parseFloat((String)add.get(11)));
               collectInfoValueMapper.insertSelective(collectInfoValue8);
           }
           else if ("温室通风风速".equals(nodedeviceSensorconfigInfo.getSensorPosition())){
               map.put("温室通风风速",nodedeviceSensorconfigInfo.getSensorId());
               CollectInfoValue collectInfoValue9 = new CollectInfoValue();
               collectInfoValue9.setCollectTime(date);
               collectInfoValue9.setSensorId(nodedeviceSensorconfigInfo.getSensorId());
               collectInfoValue9.setSensorValue(Float.parseFloat((String)add.get(12)));
               collectInfoValueMapper.insertSelective(collectInfoValue9);
           }

        }


    }
}
