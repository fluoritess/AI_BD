package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CropInfo;
import cn.itcast.ssm.po.CropInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CropInfoMapper {
    long countByExample(CropInfoExample example);

    int deleteByExample(CropInfoExample example);

    int deleteByPrimaryKey(Integer cropId);

    int insert(CropInfo record);

    int insertSelective(CropInfo record);

    List<CropInfo> selectByExample(CropInfoExample example);

    CropInfo selectByPrimaryKey(Integer cropId);

    int updateByExampleSelective(@Param("record") CropInfo record, @Param("example") CropInfoExample example);

    int updateByExample(@Param("record") CropInfo record, @Param("example") CropInfoExample example);

    int updateByPrimaryKeySelective(CropInfo record);

    int updateByPrimaryKey(CropInfo record);
}