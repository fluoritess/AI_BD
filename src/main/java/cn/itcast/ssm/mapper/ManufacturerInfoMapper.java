package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ManufacturerInfo;
import cn.itcast.ssm.po.ManufacturerInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerInfoMapper {
    long countByExample(ManufacturerInfoExample example);

    int deleteByExample(ManufacturerInfoExample example);

    int deleteByPrimaryKey(Integer manufacturerId);

    int insert(ManufacturerInfo record);

    int insertSelective(ManufacturerInfo record);

    List<ManufacturerInfo> selectByExample(ManufacturerInfoExample example);

    ManufacturerInfo selectByPrimaryKey(Integer manufacturerId);

    int updateByExampleSelective(@Param("record") ManufacturerInfo record, @Param("example") ManufacturerInfoExample example);

    int updateByExample(@Param("record") ManufacturerInfo record, @Param("example") ManufacturerInfoExample example);

    int updateByPrimaryKeySelective(ManufacturerInfo record);

    int updateByPrimaryKey(ManufacturerInfo record);
}