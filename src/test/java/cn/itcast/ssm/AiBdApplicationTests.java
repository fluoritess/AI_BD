package cn.itcast.ssm;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
    @Test
    public void contextLoads() throws Exception{

     CollectInfoValue collectInfoValue=statisticalAnalysisService.selectLatest(1);
     System.out.print(collectInfoValue.getCollectTime());

      }




}
