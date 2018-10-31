package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.AlarmInfo;
import cn.itcast.ssm.po.AlarmInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlarmInfoMapper {
    long countByExample(AlarmInfoExample example);

    int deleteByExample(AlarmInfoExample example);

    int deleteByPrimaryKey(Integer alarmId);

    int insert(AlarmInfo record);

    int insertSelective(AlarmInfo record);

    List<AlarmInfo> selectByExample(AlarmInfoExample example);

    AlarmInfo selectByPrimaryKey(Integer alarmId);

    int updateByExampleSelective(@Param("record") AlarmInfo record, @Param("example") AlarmInfoExample example);

    int updateByExample(@Param("record") AlarmInfo record, @Param("example") AlarmInfoExample example);

    int updateByPrimaryKeySelective(AlarmInfo record);

    int updateByPrimaryKey(AlarmInfo record);
}