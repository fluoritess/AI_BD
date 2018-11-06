package cn.itcast.ssm.po;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class GrowthEnviromentSeting implements Serializable {
    private Integer gropId;

    private Integer growthParameterId;

    private Float growthParameterValue;

    private Float growthParameterMax;

    private Float growthParameterMin;

    private static final long serialVersionUID = 1L;

    public Integer getGropId() {
        return gropId;
    }

    public void setGropId(Integer gropId) {
        this.gropId = gropId;
    }

    public Integer getGrowthParameterId() {
        return growthParameterId;
    }

    public void setGrowthParameterId(Integer growthParameterId) {
        this.growthParameterId = growthParameterId;
    }

    public Float getGrowthParameterValue() {
        return growthParameterValue;
    }

    public void setGrowthParameterValue(Float growthParameterValue) {
        this.growthParameterValue = growthParameterValue;
    }

    public Float getGrowthParameterMax() {
        return growthParameterMax;
    }

    public void setGrowthParameterMax(Float growthParameterMax) {
        this.growthParameterMax = growthParameterMax;
    }

    public Float getGrowthParameterMin() {
        return growthParameterMin;
    }

    public void setGrowthParameterMin(Float growthParameterMin) {
        this.growthParameterMin = growthParameterMin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gropId=").append(gropId);
        sb.append(", growthParameterId=").append(growthParameterId);
        sb.append(", growthParameterValue=").append(growthParameterValue);
        sb.append(", growthParameterMax=").append(growthParameterMax);
        sb.append(", growthParameterMin=").append(growthParameterMin);
        sb.append("]");
        return sb.toString();
    }
}