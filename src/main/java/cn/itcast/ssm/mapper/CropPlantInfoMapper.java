package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CropPlantInfo;
import cn.itcast.ssm.po.CropPlantInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CropPlantInfoMapper {
    long countByExample(CropPlantInfoExample example);

    int deleteByExample(CropPlantInfoExample example);

    int deleteByPrimaryKey(Integer cropPlantId);

    int insert(CropPlantInfo record);

    int insertSelective(CropPlantInfo record);

    List<CropPlantInfo> selectByExample(CropPlantInfoExample example);

    CropPlantInfo selectByPrimaryKey(Integer cropPlantId);

    int updateByExampleSelective(@Param("record") CropPlantInfo record, @Param("example") CropPlantInfoExample example);

    int updateByExample(@Param("record") CropPlantInfo record, @Param("example") CropPlantInfoExample example);

    int updateByPrimaryKeySelective(CropPlantInfo record);

    int updateByPrimaryKey(CropPlantInfo record);
}