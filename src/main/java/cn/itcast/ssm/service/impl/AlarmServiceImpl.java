package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.AlarmInfoMapper;
import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.service.AlarmService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AlarmServiceImpl implements AlarmService {

    @Autowired
    UserUtilMapper utilMapper;

    @Autowired
    AlarmInfoMapper alarmInfoMapper;
    @Override
    public Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue) {
        Paging page=new Paging();
        //查询出注释
        page.addDataTitle(utilMapper.selectNotes(name));
        //查询出总条数
        page.setListTotal(utilMapper.selectCount(name,limitName,limitValue));
        //查询数据
        List<Map<String,Object>> list= utilMapper.selectPaging(name,offset,pageSize,limitName,limitValue);
        //装入数据
        page.setLists(list);
        //返回数据
        return page;
    }

    @Override
    public boolean deleteAlarmInfo(Integer typeId) {
        if(alarmInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }
}
