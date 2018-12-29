package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.mapper.CollectUtil;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StatisticalAnalysisServiceImpl implements StatisticalAnalysisService {
    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;
    @Autowired
    CollectUtil collectUtil;
    @Autowired
    WarningDeviceImpl warningDevice;
    @Autowired
    StatisticalAnalysisServiceImpl statisticalAnalysisService;
    @Override

    public CollectInfoValue selectLatest(Integer SensorId){
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        Iterator<CollectInfoValue> it=list.iterator();
        CollectInfoValue collectInfoValue_tar=null;
        Date date=new Date();
        long count=1000000000;
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            if((date.getTime()-date1.getTime())<count){
               collectInfoValue_tar=collectInfoValue;
               count=date.getTime()-date1.getTime();
            }
        }
        return collectInfoValue_tar;
    }
    @Override
    public  List<CollectInfoValue> StatisticalQuarter(Integer SensorId){
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Iterator<CollectInfoValue> it=list.iterator();
        Date date=new Date();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            long min=(date.getTime()-date1.getTime())/60000;
            if(min<=15){

                if(SensorId==collectInfoValue.getSensorId()) {
                    tarlist.add(collectInfoValue);
                }
            }
        }
        return tarlist;
    }
    @Override
    public  List<CollectInfoValue> StatisticalOneHour(Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Iterator<CollectInfoValue> it=list.iterator();
        Date date=new Date();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            long min=(date.getTime()-date1.getTime())/60000;
            if(min<=60){

                if(SensorId==collectInfoValue.getSensorId()) {
                tarlist.add(collectInfoValue);
            }}
        }
        return tarlist;
    }

    @Override

    public  List<CollectInfoValue> StatisticalOneDay(Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Date date=new Date();
        Iterator<CollectInfoValue> it=list.iterator();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            long hour=(date.getTime()-date1.getTime())/60000/60;
            if(hour<=24){

                if(SensorId==collectInfoValue.getSensorId()) {
                tarlist.add(collectInfoValue);}
            }
        }
        return tarlist;
    }

    @Override

    public  List<CollectInfoValue>  StatisticalOneWeek(Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Date date=new Date();
        Iterator<CollectInfoValue> it=list.iterator();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            long day=(date.getTime()-date1.getTime())/60000/60/24;
            if(day<=7){

                if(SensorId==collectInfoValue.getSensorId()) {
                    tarlist.add(collectInfoValue);
                }}
        }
        return tarlist;
    }
    @Override
    public  List<CollectInfoValue> StatisticalOneDay_2(Integer SensorId){
        List<CollectInfoValue> list=collectUtil.selectOneDay(SensorId);
        return  list;
    }
    @Override
    public   List<CollectInfoValue>  StatisticalOneWeek_2(Integer SensorId){
        List<CollectInfoValue> list=collectUtil.selectOneWeek(SensorId);
        return  list;
    }
    @Override
    public   List<CollectInfoValue>  StatisticalQuarter_2(Integer SensorId){
        List<CollectInfoValue> list=collectUtil.selectQuarter(SensorId);
        return  list;
    }
    @Override
    public   List<CollectInfoValue>  StatisticalOneHour_2(Integer SensorId){
        List<CollectInfoValue> list=collectUtil.selectOneHour(SensorId);
        return  list;
    }
    @Override
    public   CollectInfoValue  selectLatest_2(Integer SensorId){
       CollectInfoValue collectInfoValue=collectUtil.selectLatest(SensorId);
        return  collectInfoValue;
    }





    @Override
    public List<cn.itcast.ssm.po.CollectUtil> StatisticalOneDay_3(Integer device_id) {
        List<cn.itcast.ssm.po.CollectUtil> list=collectUtil.selectOneDay_2(device_id);
        return list;
    }

    @Override
    public List<cn.itcast.ssm.po.CollectUtil> StatisticalOneWeek_3(Integer device_id) {
        List<cn.itcast.ssm.po.CollectUtil> list=collectUtil.selectOneWeek_2(device_id);
        return list;
    }

    @Override
    public List<cn.itcast.ssm.po.CollectUtil> StatisticalQuarter_3(Integer device_id) {
        List<cn.itcast.ssm.po.CollectUtil> list=collectUtil.selectQuarter_2(device_id);
        return list;
    }

    @Override
    public List<cn.itcast.ssm.po.CollectUtil> StatisticalOneHour_3(Integer device_id) {
        List<cn.itcast.ssm.po.CollectUtil> list=collectUtil.selectOneHour_2(device_id);
        return list;
    }

    @Override
    public Map selectLatest_3(Integer device_id) {
        cn.itcast.ssm.po.CollectUtil collectInfoValue=collectUtil.selectLatest_2(device_id);
        int Sensor_id=collectInfoValue.getSensorId().intValue();
        float[] minAndMax=warningDevice.select_minAndMax(Sensor_id);
        Map map=new HashMap();
        map.put("收集数据",collectInfoValue);
        map.put("环境参数",minAndMax);
        return map;
    }

    @Override
    public List<List<cn.itcast.ssm.po.CollectUtil>> Classification(List<cn.itcast.ssm.po.CollectUtil> list) {
        List<List<cn.itcast.ssm.po.CollectUtil>> grouplist=new ArrayList<>();
        list.stream().collect(Collectors.groupingBy(cn.itcast.ssm.po.CollectUtil::getSensorId,Collectors.toList()))
                .forEach((age,fooListBySensorId)->{
                    grouplist.add(fooListBySensorId);
                });
        return grouplist;
    }


}
