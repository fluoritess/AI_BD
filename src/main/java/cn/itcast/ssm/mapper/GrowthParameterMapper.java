package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.GrowthParameter;
import cn.itcast.ssm.po.GrowthParameterExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrowthParameterMapper {
    long countByExample(GrowthParameterExample example);

    int deleteByExample(GrowthParameterExample example);

    int deleteByPrimaryKey(Integer growthParametersId);

    int insert(GrowthParameter record);

    int insertSelective(GrowthParameter record);

    List<GrowthParameter> selectByExample(GrowthParameterExample example);

    GrowthParameter selectByPrimaryKey(Integer growthParametersId);

    int updateByExampleSelective(@Param("record") GrowthParameter record, @Param("example") GrowthParameterExample example);

    int updateByExample(@Param("record") GrowthParameter record, @Param("example") GrowthParameterExample example);

    int updateByPrimaryKeySelective(GrowthParameter record);

    int updateByPrimaryKey(GrowthParameter record);
}