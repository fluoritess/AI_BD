package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.EquipmentTypeInfoMapper;
import cn.itcast.ssm.mapper.UserUtilMapper;
import cn.itcast.ssm.po.EquipmentTypeInfo;
import cn.itcast.ssm.service.EquipmentService;
import cn.itcast.ssm.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author tyh
 * @Package cn.itcast.ssm.service.impl
 * @Description:
 * @date 18-8-9 上午10:37
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    EquipmentTypeInfoMapper equipmentTypeInfoMapper;

    @Autowired
    UserUtilMapper utilMapper;

    @Override
    public boolean addEquipmentType(EquipmentTypeInfo equipmentTypeInfo) {
        if(equipmentTypeInfoMapper.insertSelective(equipmentTypeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean modifyEquipmentType(EquipmentTypeInfo equipmentTypeInfo) {
        if(equipmentTypeInfoMapper.updateByPrimaryKeySelective(equipmentTypeInfo)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteEquipmentType(Integer equipmentTypeId) {
        if(equipmentTypeInfoMapper.deleteByPrimaryKey(equipmentTypeId)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Paging selectPaging(String name, int offset, int pageSize) {
        Paging page=new Paging();
        //查询出注释
        page.addDataTitle(utilMapper.selectNotes(name));
        //查询出总条数
        page.setListTotal(utilMapper.selectCount(name,null));
        //查询数据
        List<Map<String,Object>> list= utilMapper.selectPaging(name,offset,pageSize,null);
        //装入数据
        page.setLists(list);
        //返回数据
        return page;
    }
}
