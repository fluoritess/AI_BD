package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.RootInf;
import cn.itcast.ssm.po.RootInfExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RootInfMapper {
    long countByExample(RootInfExample example);

    int deleteByExample(RootInfExample example);

    int insert(RootInf record);

    int insertSelective(RootInf record);

    List<RootInf> selectByExample(RootInfExample example);

    int updateByExampleSelective(@Param("record") RootInf record, @Param("example") RootInfExample example);

    int updateByExample(@Param("record") RootInf record, @Param("example") RootInfExample example);
}