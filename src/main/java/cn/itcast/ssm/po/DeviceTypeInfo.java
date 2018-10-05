package cn.itcast.ssm.po;

import java.io.Serializable;

public class DeviceTypeInfo implements Serializable {
    private Integer deviceTypeId;

    private String deviceTypeName;

    private String deviceFuncationRemark;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    public String getDeviceFuncationRemark() {
        return deviceFuncationRemark;
    }

    public void setDeviceFuncationRemark(String deviceFuncationRemark) {
        this.deviceFuncationRemark = deviceFuncationRemark == null ? null : deviceFuncationRemark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceTypeId=").append(deviceTypeId);
        sb.append(", deviceTypeName=").append(deviceTypeName);
        sb.append(", deviceFuncationRemark=").append(deviceFuncationRemark);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}