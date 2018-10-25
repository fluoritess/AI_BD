package cn.itcast.ssm.service;

import cn.itcast.ssm.po.CropInfo;
import cn.itcast.ssm.po.NodedeviceSensorconfigInfo;
import cn.itcast.ssm.po.SoilTypeInfo;
import cn.itcast.ssm.util.Paging;
import org.springframework.stereotype.Service;

@Service
public interface AgricultureService {
    Paging selectPaging(String name, int offset, int pageSize, String limitName, String limitValue);
    boolean addSoilTypeInfos(SoilTypeInfo soilTypeInfo);
    boolean updateSoilTypeInfo(SoilTypeInfo soilTypeInfo);
    boolean deleteSoilTypeInfo(Integer typeId);

    boolean addCropTypeInfos(CropInfo cropInfo);
    boolean updateCropTypeInfo(CropInfo cropInfo);
    boolean deleteCropTypeInfo(Integer typeId);

    boolean addNodeDeviceInfos(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo);
    boolean updateNodeDeviceInfo(NodedeviceSensorconfigInfo nodedeviceSensorconfigInfo);
    boolean deleteNodeDeviceInfo(Integer typeId);

}
