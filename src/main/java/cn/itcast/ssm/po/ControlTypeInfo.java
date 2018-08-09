package cn.itcast.ssm.po;

import java.io.Serializable;

public class ControlTypeInfo implements Serializable {
    private Integer controlTypeId;

    private String controlTypeName;

    private String functionExplain;

    private String other;

    private static final long serialVersionUID = 1L;

    public Integer getControlTypeId() {
        return controlTypeId;
    }

    public void setControlTypeId(Integer controlTypeId) {
        this.controlTypeId = controlTypeId;
    }

    public String getControlTypeName() {
        return controlTypeName;
    }

    public void setControlTypeName(String controlTypeName) {
        this.controlTypeName = controlTypeName == null ? null : controlTypeName.trim();
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
        sb.append(", controlTypeId=").append(controlTypeId);
        sb.append(", controlTypeName=").append(controlTypeName);
        sb.append(", functionExplain=").append(functionExplain);
        sb.append(", other=").append(other);
        sb.append("]");
        return sb.toString();
    }
}