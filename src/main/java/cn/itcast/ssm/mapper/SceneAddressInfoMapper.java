package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.SceneAddressInfo;
import cn.itcast.ssm.po.SceneAddressInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SceneAddressInfoMapper {
    long countByExample(SceneAddressInfoExample example);

    int deleteByExample(SceneAddressInfoExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(SceneAddressInfo record);

    int insertSelective(SceneAddressInfo record);

    List<SceneAddressInfo> selectByExample(SceneAddressInfoExample example);

    SceneAddressInfo selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") SceneAddressInfo record, @Param("example") SceneAddressInfoExample example);

    int updateByExample(@Param("record") SceneAddressInfo record, @Param("example") SceneAddressInfoExample example);

    int updateByPrimaryKeySelective(SceneAddressInfo record);

    int updateByPrimaryKey(SceneAddressInfo record);
}