package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.AlarmDisposalInfo;
import cn.itcast.ssm.po.AlarmDisposalInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlarmDisposalInfoMapper {
    long countByExample(AlarmDisposalInfoExample example);

    int deleteByExample(AlarmDisposalInfoExample example);

    int insert(AlarmDisposalInfo record);

    int insertSelective(AlarmDisposalInfo record);

    List<AlarmDisposalInfo> selectByExample(AlarmDisposalInfoExample example);

    int updateByExampleSelective(@Param("record") AlarmDisposalInfo record, @Param("example") AlarmDisposalInfoExample example);

    int updateByExample(@Param("record") AlarmDisposalInfo record, @Param("example") AlarmDisposalInfoExample example);
}