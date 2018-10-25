package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class StatisticalAnalysisServiceImpl implements StatisticalAnalysisService {
    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;
    @Override
    public  List<CollectInfoValue> StatisticalQuarter(java.util.Date date,Integer SensorId){
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Iterator<CollectInfoValue> it=list.iterator();
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
    public  List<CollectInfoValue> StatisticalOneHour(java.util.Date  date,Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Iterator<CollectInfoValue> it=list.iterator();
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
    public  List<CollectInfoValue> StatisticalOneDay(java.util.Date  date,Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
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
    public  List<CollectInfoValue>  StatisticalOneWeek(java.util.Date  date,Integer SensorId) {
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
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
}
