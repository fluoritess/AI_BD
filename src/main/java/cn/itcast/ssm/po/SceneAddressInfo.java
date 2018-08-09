package cn.itcast.ssm.po;

import java.io.Serializable;

public class SceneAddressInfo implements Serializable {
    private Integer addressId;

    private String address;

    private Integer typeId;

    private String other;

    private String interpret;

    private String unitName;

    private static final long serialVersionUID = 1L;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret == null ? null : interpret.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", address=").append(address);
        sb.append(", typeId=").append(typeId);
        sb.append(", other=").append(other);
        sb.append(", interpret=").append(interpret);
        sb.append(", unitName=").append(unitName);
        sb.append("]");
        return sb.toString();
    }
}