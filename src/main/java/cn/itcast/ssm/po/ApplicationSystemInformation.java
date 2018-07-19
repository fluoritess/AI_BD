package cn.itcast.ssm.po;

import java.io.Serializable;

public class ApplicationSystemInformation implements Serializable {
    private Integer applicationSystemId;

    private String remarks;

    private String describe;

    private String systemName;

    private static final long serialVersionUID = 1L;

    public Integer getApplicationSystemId() {
        return applicationSystemId;
    }

    public void setApplicationSystemId(Integer applicationSystemId) {
        this.applicationSystemId = applicationSystemId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationSystemId=").append(applicationSystemId);
        sb.append(", remarks=").append(remarks);
        sb.append(", describe=").append(describe);
        sb.append(", systemName=").append(systemName);
        sb.append("]");
        return sb.toString();
    }
}