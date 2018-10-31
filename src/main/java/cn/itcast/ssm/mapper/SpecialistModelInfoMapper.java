package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.SpecialistModelInfo;
import cn.itcast.ssm.po.SpecialistModelInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SpecialistModelInfoMapper {
    long countByExample(SpecialistModelInfoExample example);

    int deleteByExample(SpecialistModelInfoExample example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(SpecialistModelInfo record);

    int insertSelective(SpecialistModelInfo record);

    List<SpecialistModelInfo> selectByExample(SpecialistModelInfoExample example);

    SpecialistModelInfo selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") SpecialistModelInfo record, @Param("example") SpecialistModelInfoExample example);

    int updateByExample(@Param("record") SpecialistModelInfo record, @Param("example") SpecialistModelInfoExample example);

    int updateByPrimaryKeySelective(SpecialistModelInfo record);

    int updateByPrimaryKey(SpecialistModelInfo record);
}