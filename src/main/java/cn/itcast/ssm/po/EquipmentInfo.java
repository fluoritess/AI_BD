package cn.itcast.ssm.po;

import java.io.Serializable;

public class EquipmentInfo implements Serializable {
    private Integer equipmentId;

    private Integer equipmentTypeId;

    private String equipmentName;

    private String equipmentWorkState;

    private Integer equipmentCheck;

    private Integer controlTypeId;

    private Integer manufacturerId;

    private String algModelId;

    private Integer appId;

    private String functionExplain;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(Integer equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getEquipmentWorkState() {
        return equipmentWorkState;
    }

    public void setEquipmentWorkState(String equipmentWorkState) {
        this.equipmentWorkState = equipmentWorkState == null ? null : equipmentWorkState.trim();
    }

    public Integer getEquipmentCheck() {
        return equipmentCheck;
    }

    public void setEquipmentCheck(Integer equipmentCheck) {
        this.equipmentCheck = equipmentCheck;
    }

    public Integer getControlTypeId() {
        return controlTypeId;
    }

    public void setControlTypeId(Integer controlTypeId) {
        this.controlTypeId = controlTypeId;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getAlgModelId() {
        return algModelId;
    }

    public void setAlgModelId(String algModelId) {
        this.algModelId = algModelId == null ? null : algModelId.trim();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getFunctionExplain() {
        return functionExplain;
    }

    public void setFunctionExplain(String functionExplain) {
        this.functionExplain = functionExplain == null ? null : functionExplain.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", equipmentTypeId=").append(equipmentTypeId);
        sb.append(", equipmentName=").append(equipmentName);
        sb.append(", equipmentWorkState=").append(equipmentWorkState);
        sb.append(", equipmentCheck=").append(equipmentCheck);
        sb.append(", controlTypeId=").append(controlTypeId);
        sb.append(", manufacturerId=").append(manufacturerId);
        sb.append(", algModelId=").append(algModelId);
        sb.append(", appId=").append(appId);
        sb.append(", functionExplain=").append(functionExplain);
        sb.append("]");
        return sb.toString();
    }
}