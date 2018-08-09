package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class EquipmentDeployInfo implements Serializable {
    private Integer equipmentDeployId;

    private Integer equipmentId;

    private Integer deployNodeId;

    private Date deployTime;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getEquipmentDeployId() {
        return equipmentDeployId;
    }

    public void setEquipmentDeployId(Integer equipmentDeployId) {
        this.equipmentDeployId = equipmentDeployId;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getDeployNodeId() {
        return deployNodeId;
    }

    public void setDeployNodeId(Integer deployNodeId) {
        this.deployNodeId = deployNodeId;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentDeployId=").append(equipmentDeployId);
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", deployNodeId=").append(deployNodeId);
        sb.append(", deployTime=").append(deployTime);
        sb.append(", remarks=").append(remarks);
        sb.append("]");
        return sb.toString();
    }
}