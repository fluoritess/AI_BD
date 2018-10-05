package cn.itcast.ssm.po;

import java.io.Serializable;

public class SensorTypeInfo implements Serializable {
    private Integer sensorTypeId;

    private String sensorName;

    private String sensorFuncationRemark;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(Integer sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName == null ? null : sensorName.trim();
    }

    public String getSensorFuncationRemark() {
        return sensorFuncationRemark;
    }

    public void setSensorFuncationRemark(String sensorFuncationRemark) {
        this.sensorFuncationRemark = sensorFuncationRemark == null ? null : sensorFuncationRemark.trim();
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
        sb.append(", sensorTypeId=").append(sensorTypeId);
        sb.append(", sensorName=").append(sensorName);
        sb.append(", sensorFuncationRemark=").append(sensorFuncationRemark);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}