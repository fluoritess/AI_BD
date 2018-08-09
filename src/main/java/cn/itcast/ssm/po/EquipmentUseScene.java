package cn.itcast.ssm.po;

import java.io.Serializable;

public class EquipmentUseScene implements Serializable {
    private Integer typeId;

    private String name;

    private String interpret;

    private String other;

    private static final long serialVersionUID = 1L;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret == null ? null : interpret.trim();
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
        sb.append(", typeId=").append(typeId);
        sb.append(", name=").append(name);
        sb.append(", interpret=").append(interpret);
        sb.append(", other=").append(other);
        sb.append("]");
        return sb.toString();
    }
}