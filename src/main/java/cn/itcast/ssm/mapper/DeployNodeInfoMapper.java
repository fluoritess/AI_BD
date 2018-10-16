package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.DeployNodeInfo;
import cn.itcast.ssm.po.DeployNodeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeployNodeInfoMapper {
    long countByExample(DeployNodeInfoExample example);

    int deleteByExample(DeployNodeInfoExample example);

    int deleteByPrimaryKey(Integer deployNodeId);

    int insert(DeployNodeInfo record);

    int insertSelective(DeployNodeInfo record);

    List<DeployNodeInfo> selectByExample(DeployNodeInfoExample example);

    DeployNodeInfo selectByPrimaryKey(Integer deployNodeId);

    int updateByExampleSelective(@Param("record") DeployNodeInfo record, @Param("example") DeployNodeInfoExample example);

    int updateByExample(@Param("record") DeployNodeInfo record, @Param("example") DeployNodeInfoExample example);

    int updateByPrimaryKeySelective(DeployNodeInfo record);

    int updateByPrimaryKey(DeployNodeInfo record);
}