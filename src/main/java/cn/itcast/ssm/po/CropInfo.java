package cn.itcast.ssm.po;

import java.io.Serializable;

public class CropInfo implements Serializable {
    private Integer cropId;

    private Integer cropVarietiesId;

    private Integer soilTypeId;

    private String cropName;

    private Integer cropRowSpacing;

    private Integer cropDensity;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getCropId() {
        return cropId;
    }

    public void setCropId(Integer cropId) {
        this.cropId = cropId;
    }

    public Integer getCropVarietiesId() {
        return cropVarietiesId;
    }

    public void setCropVarietiesId(Integer cropVarietiesId) {
        this.cropVarietiesId = cropVarietiesId;
    }

    public Integer getSoilTypeId() {
        return soilTypeId;
    }

    public void setSoilTypeId(Integer soilTypeId) {
        this.soilTypeId = soilTypeId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName == null ? null : cropName.trim();
    }

    public Integer getCropRowSpacing() {
        return cropRowSpacing;
    }

    public void setCropRowSpacing(Integer cropRowSpacing) {
        this.cropRowSpacing = cropRowSpacing;
    }

    public Integer getCropDensity() {
        return cropDensity;
    }

    public void setCropDensity(Integer cropDensity) {
        this.cropDensity = cropDensity;
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
        sb.append(", cropId=").append(cropId);
        sb.append(", cropVarietiesId=").append(cropVarietiesId);
        sb.append(", soilTypeId=").append(soilTypeId);
        sb.append(", cropName=").append(cropName);
        sb.append(", cropRowSpacing=").append(cropRowSpacing);
        sb.append(", cropDensity=").append(cropDensity);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}