package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class AlarmInfo implements Serializable {
    private Integer alarmId;

    private Integer collectId;

    private String alarmContent;

    private Date alarmTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent == null ? null : alarmContent.trim();
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
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
        sb.append(", alarmId=").append(alarmId);
        sb.append(", collectId=").append(collectId);
        sb.append(", alarmContent=").append(alarmContent);
        sb.append(", alarmTime=").append(alarmTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}