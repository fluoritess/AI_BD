package cn.itcast.ssm.po;

import java.io.Serializable;

public class NodedeviceSensorconfigInfo implements Serializable {
    private Integer sensorId;

    private Integer deviceId;

    private Integer sensorTypeId;

    private String sensorPosition;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(Integer sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getSensorPosition() {
        return sensorPosition;
    }

    public void setSensorPosition(String sensorPosition) {
        this.sensorPosition = sensorPosition == null ? null : sensorPosition.trim();
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
        sb.append(", sensorId=").append(sensorId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", sensorTypeId=").append(sensorTypeId);
        sb.append(", sensorPosition=").append(sensorPosition);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}