package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class CollectInfoValue implements Serializable {
    private Integer collectId;

    private Integer sensorId;

    private Float sensorValue;

    private Date collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Float getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(Float sensorValue) {
        this.sensorValue = sensorValue;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectId=").append(collectId);
        sb.append(", sensorId=").append(sensorId);
        sb.append(", sensorValue=").append(sensorValue);
        sb.append(", collectTime=").append(collectTime);
        sb.append("]");
        return sb.toString();
    }
}