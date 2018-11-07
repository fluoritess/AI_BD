package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.GreenhouseInfo;
import cn.itcast.ssm.po.GreenhouseInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GreenhouseInfoMapper {
    long countByExample(GreenhouseInfoExample example);

    int deleteByExample(GreenhouseInfoExample example);

    int deleteByPrimaryKey(Integer greenhouseId);

    int insert(GreenhouseInfo record);

    int insertSelective(GreenhouseInfo record);

    List<GreenhouseInfo> selectByExample(GreenhouseInfoExample example);

    GreenhouseInfo selectByPrimaryKey(Integer greenhouseId);

    int updateByExampleSelective(@Param("record") GreenhouseInfo record, @Param("example") GreenhouseInfoExample example);

    int updateByExample(@Param("record") GreenhouseInfo record, @Param("example") GreenhouseInfoExample example);

    int updateByPrimaryKeySelective(GreenhouseInfo record);

    int updateByPrimaryKey(GreenhouseInfo record);


}