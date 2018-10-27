package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.predictData;
import cn.itcast.ssm.util.LeastSquare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class predictDataImpl implements predictData {
    @Autowired
    StatisticalAnalysisServiceImpl statisticalAnalysisService;
    @Autowired
    CollectInfoValueMapper collectInfoValueMapper;

    @Override
    public List<CollectInfoValue> predictOneDay(Integer SensorId){
        LeastSquare leastSquare=new LeastSquare();
        double[] x=new double[1000];
        double[] y=new double[1000];
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
                Date date2=new Date(new Date().getTime()+(j-1440)*60000);
                collectInfoValue.setCollectTime(date2);
                collectInfoValue.setSensorId(SensorId);
                tarlist.add(collectInfoValue);
        }
        return tarlist;
    }
}
