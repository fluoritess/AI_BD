package cn.itcast.ssm.po;

import java.io.Serializable;

public class EquipmentTypeInfo implements Serializable {
    private Integer equipmentTypeId;

    private String equipmentTypeName;

    private String functionExplain;

    private String other;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(Integer equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }

    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName == null ? null : equipmentTypeName.trim();
    }

    public String getFunctionExplain() {
        return functionExplain;
    }

    public void setFunctionExplain(String functionExplain) {
        this.functionExplain = functionExplain == null ? null : functionExplain.trim();
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
        sb.append(", equipmentTypeId=").append(equipmentTypeId);
        sb.append(", equipmentTypeName=").append(equipmentTypeName);
        sb.append(", functionExplain=").append(functionExplain);
        sb.append(", other=").append(other);
        sb.append("]");
        return sb.toString();
    }
}