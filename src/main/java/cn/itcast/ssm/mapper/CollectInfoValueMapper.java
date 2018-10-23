package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CollectInfoValue;
import cn.itcast.ssm.po.CollectInfoValueExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CollectInfoValueMapper {
    long countByExample(CollectInfoValueExample example);

    int deleteByExample(CollectInfoValueExample example);

    int deleteByPrimaryKey(Integer collectId);

    int insert(CollectInfoValue record);

    int insertSelective(CollectInfoValue record);

    List<CollectInfoValue> selectByExample(CollectInfoValueExample example);

    CollectInfoValue selectByPrimaryKey(Integer collectId);

    /**/
    CollectInfoValue selectByTime(Date date);

    int updateByExampleSelective(@Param("record") CollectInfoValue record, @Param("example") CollectInfoValueExample example);

    int updateByExample(@Param("record") CollectInfoValue record, @Param("example") CollectInfoValueExample example);

    int updateByPrimaryKeySelective(CollectInfoValue record);

    int updateByPrimaryKey(CollectInfoValue record);
}