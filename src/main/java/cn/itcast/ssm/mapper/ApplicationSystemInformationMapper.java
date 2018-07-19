package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.ApplicationSystemInformation;
import cn.itcast.ssm.po.ApplicationSystemInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationSystemInformationMapper {
    long countByExample(ApplicationSystemInformationExample example);

    int deleteByExample(ApplicationSystemInformationExample example);

    int deleteByPrimaryKey(Integer applicationSystemId);

    int insert(ApplicationSystemInformation record);

    int insertSelective(ApplicationSystemInformation record);

    List<ApplicationSystemInformation> selectByExample(ApplicationSystemInformationExample example);

    ApplicationSystemInformation selectByPrimaryKey(Integer applicationSystemId);

    int updateByExampleSelective(@Param("record") ApplicationSystemInformation record, @Param("example") ApplicationSystemInformationExample example);

    int updateByExample(@Param("record") ApplicationSystemInformation record, @Param("example") ApplicationSystemInformationExample example);

    int updateByPrimaryKeySelective(ApplicationSystemInformation record);

    int updateByPrimaryKey(ApplicationSystemInformation record);
}