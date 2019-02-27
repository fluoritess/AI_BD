package cn.itcast.ssm.po;

import java.io.Serializable;

public class SensorTypeInfo implements Serializable {
    private Integer sensorTypeId;

    private String sensorTypeName;

    private String sensorFuncationRemark;

    private String remark;

    private String unit;

    private static final long serialVersionUID = 1L;

    public Integer getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(Integer sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getSensorName() {
        return sensorTypeName;
    }

    public void setSensorName(String sensorName) {
        this.sensorTypeName = sensorName == null ? null : sensorName.trim();
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sensorTypeId=").append(sensorTypeId);
        sb.append(", sensorTypeName=").append(sensorTypeName);
        sb.append(", sensorFuncationRemark=").append(sensorFuncationRemark);
        sb.append(", remark=").append(remark);
        sb.append(", unit=").append(unit);
        sb.append("]");
        return sb.toString();
    }
}