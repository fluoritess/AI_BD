package cn.itcast.ssm;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import cn.itcast.ssm.service.impl.WarningDeviceImpl;
import cn.itcast.ssm.service.impl.predictDataImpl;
import cn.itcast.ssm.util.LeastSquare;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import sun.util.calendar.BaseCalendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AiBdApplicationTests {
    @Autowired
    EquipmentService equipmentService;
    @Autowired
    StatisticalAnalysisService statisticalAnalysisService;
   @Autowired
   CollectInfoValueMapper collectInfoValueMapper;
    @Autowired
    predictDataImpl predictData;
    @Autowired
    WarningDeviceImpl warningDevice;
    @Test
    public void contextLoads() throws Exception{

   /*  CollectInfoValue collectInfoValue=statisticalAnalysisService.selectLatest(1);
     System.out.print(collectInfoValue.getCollectTime());*/
       /* double[] X=new double[5];
        double[] Y=new double[5];
        X[0]=1;X[1]=2;X[2]=3;X[3]=4;X[4]=5;
        Y[0]=3;Y[1]=4;Y[2]=6;Y[3]=8;Y[4]=9;
        Map map=new LeastSquare().lineRegression(X, Y);
        double a=(double)map.get("a");
        double b=(double)map.get("b");
        double y=a*6+b;
        System.out.println(y);*/
      /* List<CollectInfoValue> list=statisticalAnalysisService.StatisticalOneHour_2(1);
       List<CollectInfoValue> list3=statisticalAnalysisService.StatisticalOneDay_2(1);
        List<CollectInfoValue> list2=statisticalAnalysisService.StatisticalQuarter_2(1);
        CollectInfoValue collectInfoValue=statisticalAnalysisService.selectLatest_2(1);
        List<CollectInfoValue> list4=statisticalAnalysisService.StatisticalOneWeek_2(1);*/
  /*    predictData.predictOneDayGM(1);
       System.out.print("sdasd");*/
  warningDevice.ValueJudgment(1,60);
      }



}
