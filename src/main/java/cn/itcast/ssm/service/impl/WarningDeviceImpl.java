package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.service.WarningDevice;
import cn.itcast.ssm.util.WarningException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Service
public class WarningDeviceImpl implements WarningDevice {
    @Autowired
    private UserUtilMapper utilMapper;
@Override
   public WarningException ValueJudgment(int sensor_id, float value){
       WarningException warningException=null;
       String Sensor_id=String.valueOf(sensor_id);
       List<LinkedHashMap<String,Object>> parameter=utilMapper.selectInspectData("parameter_threshold_view","sensor_id",Sensor_id);
       int size=parameter.size();
       /*找出最新的一条数据*/
       long date=0;
       int j=0;
       for(int i=0;i<size;i++){
           LinkedHashMap<String,Object> linkedHashMap=parameter.get(i);
           int count=1;
           for(Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
                if(count==4){
                    java.util.Date date1=(java.util.Date)entry.getValue();
                    if(date<date1.getTime()){
                        date=date1.getTime();
                        j++;
                    }
                }
               count++;
           }
       }
       /*查出上下限*/
       LinkedHashMap<String,Object> linkedHashMap=parameter.get(j);
       float max=0;//最高
       float min=0;//最低
       int count=1;
       for(Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
           if(count==2){
                max=(float)entry.getValue();
           }
           if(count==3){
                min=(float)entry.getValue();
           }
           count++;
       }


        if(value<min){
          warningException=new WarningException("温度(湿度)过低",sensor_id);
        }
        if(value>max){
            warningException=new WarningException("温度(湿度)过高",sensor_id);
        }
        return warningException;
    }




    public float[] select_minAndMax(int sensor_id){
        String Sensor_id=String.valueOf(sensor_id);
        float[] minAndMax=new float[2];
        List<LinkedHashMap<String,Object>> parameter=utilMapper.selectInspectData("parameter_threshold_view","sensor_id",Sensor_id);
        int size=parameter.size();
        /*找出最新的一条数据*/
        long date=0;
        int j=0;
        for(int i=0;i<size;i++){
            LinkedHashMap<String,Object> linkedHashMap=parameter.get(i);
            int count=1;
            for(Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
                if(count==4){
                    java.util.Date date1=(java.util.Date)entry.getValue();
                    if(date<date1.getTime()){
                        date=date1.getTime();
                        j++;
                    }
                }
                count++;
            }
        }
        /*查出上下限*/
        LinkedHashMap<String,Object> linkedHashMap=parameter.get(j);
        float max=0;//最高
        float min=0;//最低
        int count=1;
        for(Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
            if(count==2){
                max=(float)entry.getValue();
            }
            if(count==3){
                min=(float)entry.getValue();
            }
            count++;
        }
        minAndMax[0]=max;
        minAndMax[1]=min;
        return minAndMax;
    }








}
