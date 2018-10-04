package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.NodedeviceSensorconfigInfo;
import cn.itcast.ssm.po.NodedeviceSensorconfigInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodedeviceSensorconfigInfoMapper {
    long countByExample(NodedeviceSensorconfigInfoExample example);

    int deleteByExample(NodedeviceSensorconfigInfoExample example);

    int deleteByPrimaryKey(Integer sensorId);

    int insert(NodedeviceSensorconfigInfo record);

    int insertSelective(NodedeviceSensorconfigInfo record);

    List<NodedeviceSensorconfigInfo> selectByExample(NodedeviceSensorconfigInfoExample example);

    NodedeviceSensorconfigInfo selectByPrimaryKey(Integer sensorId);

    int updateByExampleSelective(@Param("record") NodedeviceSensorconfigInfo record, @Param("example") NodedeviceSensorconfigInfoExample example);

    int updateByExample(@Param("record") NodedeviceSensorconfigInfo record, @Param("example") NodedeviceSensorconfigInfoExample example);

    int updateByPrimaryKeySelective(NodedeviceSensorconfigInfo record);

    int updateByPrimaryKey(NodedeviceSensorconfigInfo record);
}