package cn.itcast.ssm.po;

import java.io.Serializable;

public class SoilTypeInfo implements Serializable {
    private Integer soilTypeId;

    private String soilTypeName;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getSoilTypeId() {
        return soilTypeId;
    }

    public void setSoilTypeId(Integer soilTypeId) {
        this.soilTypeId = soilTypeId;
    }

    public String getSoilTypeName() {
        return soilTypeName;
    }

    public void setSoilTypeName(String soilTypeName) {
        this.soilTypeName = soilTypeName == null ? null : soilTypeName.trim();
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
        sb.append(", soilTypeId=").append(soilTypeId);
        sb.append(", soilTypeName=").append(soilTypeName);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}