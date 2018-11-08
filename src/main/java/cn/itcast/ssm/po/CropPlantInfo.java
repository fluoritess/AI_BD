package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class CropPlantInfo implements Serializable {
    private Integer cropPlantId;

    private Integer greenhouseId;

    private Integer cropVarietiesId;

    private Date cropPlantStarttime;

    private Date cropPlantEndtime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getCropPlantId() {
        return cropPlantId;
    }

    public void setCropPlantId(Integer cropPlantId) {
        this.cropPlantId = cropPlantId;
    }

    public Integer getGreenhouseId() {
        return greenhouseId;
    }

    public void setGreenhouseId(Integer greenhouseId) {
        this.greenhouseId = greenhouseId;
    }

    public Integer getCropVarietiesId() {
        return cropVarietiesId;
    }

    public void setCropVarietiesId(Integer cropVarietiesId) {
        this.cropVarietiesId = cropVarietiesId;
    }

    public Date getCropPlantStarttime() {
        return cropPlantStarttime;
    }

    public void setCropPlantStarttime(Date cropPlantStarttime) {
        this.cropPlantStarttime = cropPlantStarttime;
    }

    public Date getCropPlantEndtime() {
        return cropPlantEndtime;
    }

    public void setCropPlantEndtime(Date cropPlantEndtime) {
        this.cropPlantEndtime = cropPlantEndtime;
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
        sb.append(", cropPlantId=").append(cropPlantId);
        sb.append(", greenhouseId=").append(greenhouseId);
        sb.append(", cropVarietiesId=").append(cropVarietiesId);
        sb.append(", cropPlantStarttime=").append(cropPlantStarttime);
        sb.append(", cropPlantEndtime=").append(cropPlantEndtime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}