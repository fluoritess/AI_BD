package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.GreenhouseInfoMapper;
import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.po.GreenhouseInfo;
import cn.itcast.ssm.service.GreenHouseService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: LiuYang
 * @Description:
 * @Date: Created in 15:27 2018/10/8
 * Modified By:
 */


@Service
public class GreenHouseServicelmpl implements GreenHouseService {
    @Autowired
    UserUtilMapper utilMapper;

    @Autowired
    GreenhouseInfoMapper greenhouseInfoMapper;
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
    public boolean addGreenHouseInfos(GreenhouseInfo greenhouseInfo) {
        if(greenhouseInfoMapper.insert(greenhouseInfo)!=0) {
            return true;
        }else {
            return false;
        }

    }
    @Override
    public boolean updateSensorTypeInfo(GreenhouseInfo greenhouseInfo) {

        if(greenhouseInfoMapper.updateByPrimaryKeySelective(greenhouseInfo)!=0)
        {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteSensorTypeInfo(Integer typeId) {
        if(greenhouseInfoMapper.deleteByPrimaryKey(typeId)!=0){
            return true;
        }else {
            return false;
        }
    }


}
