package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.PageInf;
import cn.itcast.ssm.po.PageInfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageInfMapper {
    long countByExample(PageInfExample example);

    int deleteByExample(PageInfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PageInf record);

    int insertSelective(PageInf record);

    List<PageInf> selectByExample(PageInfExample example);

    PageInf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PageInf record, @Param("example") PageInfExample example);

    int updateByExample(@Param("record") PageInf record, @Param("example") PageInfExample example);

    int updateByPrimaryKeySelective(PageInf record);

    int updateByPrimaryKey(PageInf record);
}