package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class AlarmDisposalInfo implements Serializable {
    private Integer disposalMethodId;

    private Integer alarmId;

    private Integer disposalStatus;

    private Date disposalTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getDisposalMethodId() {
        return disposalMethodId;
    }

    public void setDisposalMethodId(Integer disposalMethodId) {
        this.disposalMethodId = disposalMethodId;
    }

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public Integer getDisposalStatus() {
        return disposalStatus;
    }

    public void setDisposalStatus(Integer disposalStatus) {
        this.disposalStatus = disposalStatus;
    }

    public Date getDisposalTime() {
        return disposalTime;
    }

    public void setDisposalTime(Date disposalTime) {
        this.disposalTime = disposalTime;
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
        sb.append(", disposalMethodId=").append(disposalMethodId);
        sb.append(", alarmId=").append(alarmId);
        sb.append(", disposalStatus=").append(disposalStatus);
        sb.append(", disposalTime=").append(disposalTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}