package cn.itcast.ssm.po;

import java.io.Serializable;

public class ManufacturerInfo implements Serializable {
    private Integer manufacturerId;

    private String manufacturerName;

    private String manufacturerDiscripte;

    private String other;

    private static final long serialVersionUID = 1L;

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName == null ? null : manufacturerName.trim();
    }

    public String getManufacturerDiscripte() {
        return manufacturerDiscripte;
    }

    public void setManufacturerDiscripte(String manufacturerDiscripte) {
        this.manufacturerDiscripte = manufacturerDiscripte == null ? null : manufacturerDiscripte.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", manufacturerId=").append(manufacturerId);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", manufacturerDiscripte=").append(manufacturerDiscripte);
        sb.append(", other=").append(other);
        sb.append("]");
        return sb.toString();
    }
}