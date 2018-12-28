package cn.itcast.ssm.po;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class CollectUtil implements Serializable {
    private Integer deviceId;

    private java.lang.Long sensorId;

    private String growthParametersName;

    private String sensorPosition;

    private String sensorFuncationRemark;

    private Float sensorValue;

    private String unit;

    private java.sql.Timestamp collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getDeviceId() {
        return deviceId;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public String getGrowthParametersName() {
        return growthParametersName;
    }

    public String getSensorPosition() {
        return sensorPosition;
    }

    public String getSensorFuncationRemark() {
        return sensorFuncationRemark;
    }

    public Float getSensorValue() {
        return sensorValue;
    }

    public String getUnit() {
        return unit;
    }

    public Timestamp getCollectTime() {
        return collectTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public void setGrowthParametersName(String growthParametersName) {
        this.growthParametersName = growthParametersName;
    }

    public void setSensorPosition(String sensorPosition) {
        this.sensorPosition = sensorPosition;
    }

    public void setSensorFuncationRemark(String sensorFuncationRemark) {
        this.sensorFuncationRemark = sensorFuncationRemark;
    }

    public void setSensorValue(Float sensorValue) {
        this.sensorValue = sensorValue;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCollectTime(Timestamp collectTime) {
        this.collectTime = collectTime;
    }

    public CollectUtil(Integer deviceId, Long sensorId, String growthParametersName, String sensorPosition, String sensorFuncationRemark, Float sensorValue, String unit, Timestamp collectTime) {
        this.deviceId = deviceId;
        this.sensorId = sensorId;
        this.growthParametersName = growthParametersName;
        this.sensorPosition = sensorPosition;
        this.sensorFuncationRemark = sensorFuncationRemark;
        this.sensorValue = sensorValue;
        this.unit = unit;
        this.collectTime = collectTime;
    }
}
