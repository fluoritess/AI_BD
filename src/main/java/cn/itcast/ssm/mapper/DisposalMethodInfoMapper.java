package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.DisposalMethodInfo;
import cn.itcast.ssm.po.DisposalMethodInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisposalMethodInfoMapper {
    long countByExample(DisposalMethodInfoExample example);

    int deleteByExample(DisposalMethodInfoExample example);

    int deleteByPrimaryKey(Integer disposalMethodId);

    int insert(DisposalMethodInfo record);

    int insertSelective(DisposalMethodInfo record);

    List<DisposalMethodInfo> selectByExample(DisposalMethodInfoExample example);

    DisposalMethodInfo selectByPrimaryKey(Integer disposalMethodId);

    int updateByExampleSelective(@Param("record") DisposalMethodInfo record, @Param("example") DisposalMethodInfoExample example);

    int updateByExample(@Param("record") DisposalMethodInfo record, @Param("example") DisposalMethodInfoExample example);

    int updateByPrimaryKeySelective(DisposalMethodInfo record);

    int updateByPrimaryKey(DisposalMethodInfo record);
}