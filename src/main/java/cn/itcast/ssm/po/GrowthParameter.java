package cn.itcast.ssm.po;

import java.io.Serializable;

public class GrowthParameter implements Serializable {
    private Integer growthParametersId;

    private String growthParametersName;

    private String growthParametersDescription;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getGrowthParametersId() {
        return growthParametersId;
    }

    public void setGrowthParametersId(Integer growthParametersId) {
        this.growthParametersId = growthParametersId;
    }

    public String getGrowthParametersName() {
        return growthParametersName;
    }

    public void setGrowthParametersName(String growthParametersName) {
        this.growthParametersName = growthParametersName == null ? null : growthParametersName.trim();
    }

    public String getGrowthParametersDescription() {
        return growthParametersDescription;
    }

    public void setGrowthParametersDescription(String growthParametersDescription) {
        this.growthParametersDescription = growthParametersDescription == null ? null : growthParametersDescription.trim();
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
        sb.append(", growthParametersId=").append(growthParametersId);
        sb.append(", growthParametersName=").append(growthParametersName);
        sb.append(", growthParametersDescription=").append(growthParametersDescription);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}