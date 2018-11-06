package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.GrowthEnviromentSeting;
import cn.itcast.ssm.po.GrowthEnviromentSetingExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrowthEnviromentSetingMapper {
    long countByExample(GrowthEnviromentSetingExample example);

    int deleteByExample(GrowthEnviromentSetingExample example);

    int insert(GrowthEnviromentSeting record);

    int insertSelective(GrowthEnviromentSeting record);

    List<GrowthEnviromentSeting> selectByExample(GrowthEnviromentSetingExample example);

    int updateByExampleSelective(@Param("record") GrowthEnviromentSeting record, @Param("example") GrowthEnviromentSetingExample example);

    int updateByExample(@Param("record") GrowthEnviromentSeting record, @Param("example") GrowthEnviromentSetingExample example);

}