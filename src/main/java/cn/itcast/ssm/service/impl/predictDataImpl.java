package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.mapper.CollectInfoValueUtil;
import cn.itcast.ssm.mapper.CollectUtil;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.predictData;
import cn.itcast.ssm.util.GreyModel;
import cn.itcast.ssm.util.LeastSquare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
/**/
@Service
public class predictDataImpl implements predictData {
    @Autowired
    StatisticalAnalysisServiceImpl statisticalAnalysisService;
    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;
    @Autowired
    CollectUtil collectUtil;
    @Autowired
    predictDataImpl predictData;
    @Autowired
    CollectInfoValueUtil collectInfoValueUtil;
    @Override
    public List<CollectInfoValue> predictOneDay(Integer SensorId){
        LeastSquare leastSquare=new LeastSquare();
        double[] x=new double[1000000];
        double[] y=new double[1000000];
        int i=0;
        double a=0;
        double b=0;
        Map<String,Double> map;
        List<CollectInfoValue> list=collectInfoValueMapper.selectByExample(null);
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        Iterator<CollectInfoValue> it=list.iterator();
        Date date=new Date();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            java.util.Date date1=collectInfoValue.getCollectTime();
            long min=(date.getTime()-date1.getTime())/60000;//系统当前时间减去收集时间
            if(min<=1440){
                if(SensorId==collectInfoValue.getSensorId()) {
                    long spacing=1440-min;
                    x[i]=min+2*spacing;
                    y[i]=collectInfoValue.getSensorValue();
                    i++;
                    //最小二乘法
                    map=leastSquare.lineRegression(x,y);
                    a=map.get("a");
                    b=map.get("b");
                }
            }
        }

        for(long j=2880;j<4320;j=j+60){
                x[i]=j;
                y[i]=a*x[i]+b;
                i++;

                float n=(float)y[i-1];
                CollectInfoValue collectInfoValue=new CollectInfoValue();
                collectInfoValue.setSensorValue(n);
                Date date2=new Date(System.currentTimeMillis()+(j-1440)*60000);
                collectInfoValue.setCollectTime(date2);
                collectInfoValue.setSensorId(SensorId);
                tarlist.add(collectInfoValue);
        }
        return tarlist;
    }

    /**/
    @Override
    public  List<CollectInfoValue>  predictOneDayGM(Integer SensorId){
        List<CollectInfoValue> tarlist=new ArrayList<CollectInfoValue>();
        GreyModel greyModel=new GreyModel();
        double[] arr=new double[1000000];
        int i=0;
        List<CollectInfoValue> list=collectInfoValueUtil.selectOneDay(SensorId);
        Iterator<CollectInfoValue> collectInfoValueIterator=list.iterator();
        while(collectInfoValueIterator.hasNext()){
            CollectInfoValue collectInfoValue=collectInfoValueIterator.next();
            double value=(double)collectInfoValue.getSensorValue();
            arr[i]=value;
            i++;
        }
        double[] tar=new double[1000000];
        int m=0;
        int hour=1;
        for(int j=0;j<list.size();j++){

            double y=greyModel.gm(arr,2);
            float n=(float) y;
            CollectInfoValue collectInfoValue=new CollectInfoValue();
            collectInfoValue.setSensorValue(n);
            collectInfoValue.setSensorId(SensorId);
            Date date2=new Date(System.currentTimeMillis()+hour*60000*60);
            collectInfoValue.setCollectTime(date2);
            tarlist.add(collectInfoValue);
            hour++;
            arr[i]=y;
            i++;
            tar[m]=y;
            m++;
        }

        return tarlist;
    }

    @Override
    public List<List<CollectInfoValue>> predictOneDay_Device(Integer DeviceId) {
        List<cn.itcast.ssm.po.CollectUtil> list=statisticalAnalysisService.StatisticalOneDay_3(DeviceId);
        List<List<cn.itcast.ssm.po.CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Iterator<List<cn.itcast.ssm.po.CollectUtil>>  it=grouplist.iterator();
        List tarlist=new ArrayList();
        while(it.hasNext()){
            List<cn.itcast.ssm.po.CollectUtil> list_=it.next();
            cn.itcast.ssm.po.CollectUtil collectUtil=list.get(0);
            int sensor_id=collectUtil.getSensorId().intValue();
            List tarlist_son= predictData.predictOneDay(sensor_id);
            tarlist.add(tarlist_son);
        }
        return tarlist;
    }

    @Override
    public List<List<CollectInfoValue>> predictOneDayGM_Device(Integer DeviceId) {
        List<cn.itcast.ssm.po.CollectUtil> list=statisticalAnalysisService.StatisticalOneDay_3(DeviceId);
        List<List<cn.itcast.ssm.po.CollectUtil>> grouplist=statisticalAnalysisService.Classification(list);
        Iterator<List<cn.itcast.ssm.po.CollectUtil>>  it=grouplist.iterator();
        List tarlist=new ArrayList();
        while(it.hasNext()){
            List<cn.itcast.ssm.po.CollectUtil> list_=it.next();
            cn.itcast.ssm.po.CollectUtil collectUtil=list.get(0);
            int sensor_id=collectUtil.getSensorId().intValue();
            List tarlist_son= predictData.predictOneDayGM(sensor_id);
            tarlist.add(tarlist_son);
        }
        return tarlist;
    }
}
