package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.NodedeviceSensorconfigInfoMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.NodedeviceSensorconfigInfo;
import cn.itcast.ssm.po.NodedeviceSensorconfigInfoExample;
import cn.itcast.ssm.service.NodedeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NodedeviceServiceImpl implements NodedeviceService {
    @Autowired
    StatisticalAnalysisServiceImpl statisticalAnalysisService;
    @Autowired
    NodedeviceSensorconfigInfoMapper nodedeviceSensorconfigInfoMapper;
    @Autowired
    WarningDeviceImpl warningDevice;
    @Override
    public List<List<CollectInfoValue>> StatisticalQuarter(Integer device_id) {
        List<List<CollectInfoValue>> tarlist=new ArrayList<>();
        List<CollectInfoValue> list=null;
        NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample=new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andDeviceIdEqualTo(device_id);
        List<NodedeviceSensorconfigInfo> devicelist=nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Iterator<NodedeviceSensorconfigInfo> it=devicelist.iterator();
        while(it.hasNext()){
            NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo=it.next();
            int sensor_id=nodedeviceSensorconfigInfo.getSensorId();
            list=statisticalAnalysisService.StatisticalQuarter_2(sensor_id);
            tarlist.add(list);
        }
        return tarlist;
    }

    @Override
    public  List<Map<String,Object>>  selectLatest(Integer device_id) {
        Map<String,Object> data_=null;
        List<Map<String,Object>> tarlist=new ArrayList<>();
        CollectInfoValue collectInfoValue=null;
        NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample=new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andDeviceIdEqualTo(device_id);
        List<NodedeviceSensorconfigInfo> devicelist=nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Iterator<NodedeviceSensorconfigInfo> it=devicelist.iterator();
        while(it.hasNext()){
            NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo=it.next();
            int sensor_id=nodedeviceSensorconfigInfo.getSensorId();
            collectInfoValue=statisticalAnalysisService.selectLatest(sensor_id);
            float[] para=warningDevice.select_minAndMax(sensor_id);
            float min=para[0];
            float max=para[1];
            data_=new HashMap<>();
            data_.put("collectInfoValue",collectInfoValue);
            data_.put("min",min);
            data_.put("max",max);
            tarlist.add(data_);

        }
        return tarlist;
    }

    @Override
    public List<List<CollectInfoValue>> StatisticalOneHour(Integer device_id) {
        List<List<CollectInfoValue>> tarlist=new ArrayList<>();
        List<CollectInfoValue> list=null;
        NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample=new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andDeviceIdEqualTo(device_id);
        List<NodedeviceSensorconfigInfo> devicelist=nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Iterator<NodedeviceSensorconfigInfo> it=devicelist.iterator();
        while(it.hasNext()){
            NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo=it.next();
            int sensor_id=nodedeviceSensorconfigInfo.getSensorId();
            list=statisticalAnalysisService.StatisticalOneHour_2(sensor_id);
            tarlist.add(list);
        }
        return tarlist;
    }

    @Override
    public List<List<CollectInfoValue>> StatisticalOneDay(Integer device_id) {
        List<List<CollectInfoValue>> tarlist=new ArrayList<>();
        List<CollectInfoValue> list=null;
        NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample=new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andDeviceIdEqualTo(device_id);
        List<NodedeviceSensorconfigInfo> devicelist=nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Iterator<NodedeviceSensorconfigInfo> it=devicelist.iterator();
        while(it.hasNext()){
            NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo=it.next();
            int sensor_id=nodedeviceSensorconfigInfo.getSensorId();
            list=statisticalAnalysisService.StatisticalOneDay_2(sensor_id);
            tarlist.add(list);
        }
        return tarlist;
    }

    @Override
    public List<List<CollectInfoValue>> StatisticalOneWeek(Integer device_id) {
        List<List<CollectInfoValue>> tarlist=new ArrayList<>();
        List<CollectInfoValue> list=null;
        NodedeviceSensorconfigInfoExample nodedeviceSensorconfigInfoExample=new NodedeviceSensorconfigInfoExample();
        NodedeviceSensorconfigInfoExample.Criteria criteria=nodedeviceSensorconfigInfoExample.createCriteria();
        criteria.andDeviceIdEqualTo(device_id);
        List<NodedeviceSensorconfigInfo> devicelist=nodedeviceSensorconfigInfoMapper.selectByExample(nodedeviceSensorconfigInfoExample);
        Iterator<NodedeviceSensorconfigInfo> it=devicelist.iterator();
        while(it.hasNext()){
            NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo=it.next();
            int sensor_id=nodedeviceSensorconfigInfo.getSensorId();
            list=statisticalAnalysisService.StatisticalOneWeek_2(sensor_id);
            tarlist.add(list);
        }
        return tarlist;
    }
}
