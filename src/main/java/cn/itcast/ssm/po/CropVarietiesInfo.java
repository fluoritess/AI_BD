package cn.itcast.ssm.po;

import java.io.Serializable;

public class CropVarietiesInfo implements Serializable {
    private Integer cropVarietiesId;

    private String cropVarietiesName;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getCropVarietiesId() {
        return cropVarietiesId;
    }

    public void setCropVarietiesId(Integer cropVarietiesId) {
        this.cropVarietiesId = cropVarietiesId;
    }

    public String getCropVarietiesName() {
        return cropVarietiesName;
    }

    public void setCropVarietiesName(String cropVarietiesName) {
        this.cropVarietiesName = cropVarietiesName == null ? null : cropVarietiesName.trim();
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
        sb.append(", cropVarietiesId=").append(cropVarietiesId);
        sb.append(", cropVarietiesName=").append(cropVarietiesName);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}