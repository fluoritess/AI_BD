package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CropVarietiesInfo;
import cn.itcast.ssm.po.CropVarietiesInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CropVarietiesInfoMapper {
    long countByExample(CropVarietiesInfoExample example);

    int deleteByExample(CropVarietiesInfoExample example);

    int deleteByPrimaryKey(Integer cropVarietiesId);

    int insert(CropVarietiesInfo record);

    int insertSelective(CropVarietiesInfo record);

    List<CropVarietiesInfo> selectByExample(CropVarietiesInfoExample example);

    CropVarietiesInfo selectByPrimaryKey(Integer cropVarietiesId);

    int updateByExampleSelective(@Param("record") CropVarietiesInfo record, @Param("example") CropVarietiesInfoExample example);

    int updateByExample(@Param("record") CropVarietiesInfo record, @Param("example") CropVarietiesInfoExample example);

    int updateByPrimaryKeySelective(CropVarietiesInfo record);

    int updateByPrimaryKey(CropVarietiesInfo record);
}