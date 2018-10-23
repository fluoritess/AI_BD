package cn.itcast.ssm;

import cn.itcast.ssm.mapper.CollectInfoValueMapper;
import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.DeployNodeInfo;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.service.StatisticalAnalysisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
       /* //根据父节点名字查询父节点id
        Integer parent_id=0;
        List<DeployNodeInfo> list=(List)equipmentService.selectAllInfo(DeployNodeInfo.class);
        Iterator<DeployNodeInfo> it=list.iterator();
        while(it.hasNext()){
            DeployNodeInfo deployNodeInfo=it.next();
            if(deployNodeInfo.getNodeName().equals("成大养猪场3号位置")){
                parent_id=deployNodeInfo.getParentId();
                System.out.print(parent_id);
            }
        }*/
    /*  List<CollectInfoValue> list=(List)collectInfoValueMapper.selectByExample(null);
      Iterator<CollectInfoValue> it=list.iterator();
      while(it.hasNext()){
          CollectInfoValue collectInfoValue=it.next();
          java.util.Date date=collectInfoValue.getCollectTime();

          Date date1=new Date();
          Long long1=date.getTime();
          Long long2=date1.getTime();

          long min=(long2-long1)/60000;
          long hour=(long2-long1)/60000/60;
          long day=(long2-long1)/60000/60/24;
          System.out.print("day:"+day+"       hour"+hour+"            min"+min);*/
        List<CollectInfoValue> collectInfoValues=statisticalAnalysisService.StatisticalOneWeek(new Date());
        Iterator<CollectInfoValue> it=collectInfoValues.iterator();
        while(it.hasNext()){
            CollectInfoValue collectInfoValue=it.next();
            System.out.print(collectInfoValue.getCollectId());
        }

      }




}
