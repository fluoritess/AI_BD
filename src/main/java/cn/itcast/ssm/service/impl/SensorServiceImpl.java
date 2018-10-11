package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.SensorTypeInfoMapper;
import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.po.SensorTypeInfo;
import cn.itcast.ssm.service.SensorService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    UserUtilMapper utilMapper;
    @Autowired
    SensorTypeInfoMapper sensorTypeInfoMapper;

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
    public boolean updateSensorTypeInfo(SensorTypeInfo sensorTypeInfo) {
        if(sensorTypeInfoMapper.updateByPrimaryKeySelective(sensorTypeInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean addSensorTypeInfos(SensorTypeInfo sensorTypeInfo) {
        if(sensorTypeInfoMapper.insert(sensorTypeInfo)!=0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteSensorTypeInfo(Integer typeId) {
        if(sensorTypeInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean inspectData(String tableName, String listName, String listValue) {
        List<LinkedHashMap<String, Object>> list = utilMapper.selectInspectData(tableName, listName, listValue);
        return list.size()==0;//返回true则代表未被注册过
    }
}
