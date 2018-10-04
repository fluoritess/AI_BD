package cn.itcast.ssm.po;

import java.io.Serializable;

public class GreenhouseInfo implements Serializable {
    private Integer greenhouseId;

    private String greenhouseName;

    private String greenhouseUseage;

    private String greenhouseAddress;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getGreenhouseId() {
        return greenhouseId;
    }

    public void setGreenhouseId(Integer greenhouseId) {
        this.greenhouseId = greenhouseId;
    }

    public String getGreenhouseName() {
        return greenhouseName;
    }

    public void setGreenhouseName(String greenhouseName) {
        this.greenhouseName = greenhouseName == null ? null : greenhouseName.trim();
    }

    public String getGreenhouseUseage() {
        return greenhouseUseage;
    }

    public void setGreenhouseUseage(String greenhouseUseage) {
        this.greenhouseUseage = greenhouseUseage == null ? null : greenhouseUseage.trim();
    }

    public String getGreenhouseAddress() {
        return greenhouseAddress;
    }

    public void setGreenhouseAddress(String greenhouseAddress) {
        this.greenhouseAddress = greenhouseAddress == null ? null : greenhouseAddress.trim();
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
        sb.append(", greenhouseId=").append(greenhouseId);
        sb.append(", greenhouseName=").append(greenhouseName);
        sb.append(", greenhouseUseage=").append(greenhouseUseage);
        sb.append(", greenhouseAddress=").append(greenhouseAddress);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}