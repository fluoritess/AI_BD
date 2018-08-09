package cn.itcast.ssm.po;

import java.io.Serializable;

public class ApplicationSystemInformation implements Serializable {
    private Integer applicationSystemId;

    private String systemName;

    private String remarks;

    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getApplicationSystemId() {
        return applicationSystemId;
    }

    public void setApplicationSystemId(Integer applicationSystemId) {
        this.applicationSystemId = applicationSystemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationSystemId=").append(applicationSystemId);
        sb.append(", systemName=").append(systemName);
        sb.append(", remarks=").append(remarks);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}