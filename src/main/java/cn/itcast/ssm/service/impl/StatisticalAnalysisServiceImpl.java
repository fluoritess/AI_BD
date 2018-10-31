package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.mapper.CollectUtil;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Service
public class StatisticalAnalysisServiceImpl implements StatisticalAnalysisService {
    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;
    @Autowired
    CollectUtil collectUtil;
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
}
