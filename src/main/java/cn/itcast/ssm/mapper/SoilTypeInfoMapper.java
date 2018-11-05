package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.SoilTypeInfo;
import cn.itcast.ssm.po.SoilTypeInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SoilTypeInfoMapper {
    long countByExample(SoilTypeInfoExample example);

    int deleteByExample(SoilTypeInfoExample example);

    int deleteByPrimaryKey(Integer soilTypeId);

    int insert(SoilTypeInfo record);

    int insertSelective(SoilTypeInfo record);

    List<SoilTypeInfo> selectByExample(SoilTypeInfoExample example);

    SoilTypeInfo selectByPrimaryKey(Integer soilTypeId);

    int updateByExampleSelective(@Param("record") SoilTypeInfo record, @Param("example") SoilTypeInfoExample example);

    int updateByExample(@Param("record") SoilTypeInfo record, @Param("example") SoilTypeInfoExample example);

    int updateByPrimaryKeySelective(SoilTypeInfo record);

    int updateByPrimaryKey(SoilTypeInfo record);
    List<SoilTypeInfo> selectSoilType();
}