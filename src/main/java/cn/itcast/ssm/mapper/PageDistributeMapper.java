package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.PageDistribute;
import cn.itcast.ssm.po.PageDistributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageDistributeMapper {
    long countByExample(PageDistributeExample example);

    int deleteByExample(PageDistributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PageDistribute record);

    int insertSelective(PageDistribute record);

    List<PageDistribute> selectByExample(PageDistributeExample example);

    PageDistribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PageDistribute record, @Param("example") PageDistributeExample example);

    int updateByExample(@Param("record") PageDistribute record, @Param("example") PageDistributeExample example);

    int updateByPrimaryKeySelective(PageDistribute record);

    int updateByPrimaryKey(PageDistribute record);
}