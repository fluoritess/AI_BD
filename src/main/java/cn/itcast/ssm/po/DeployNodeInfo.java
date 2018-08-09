package cn.itcast.ssm.po;

import java.io.Serializable;

public class DeployNodeInfo implements Serializable {
    private Integer deployNodeId;

    private Integer addressId;

    private String nodeName;

    private String purposeExplain;

    private String insideLocation;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getDeployNodeId() {
        return deployNodeId;
    }

    public void setDeployNodeId(Integer deployNodeId) {
        this.deployNodeId = deployNodeId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getPurposeExplain() {
        return purposeExplain;
    }

    public void setPurposeExplain(String purposeExplain) {
        this.purposeExplain = purposeExplain == null ? null : purposeExplain.trim();
    }

    public String getInsideLocation() {
        return insideLocation;
    }

    public void setInsideLocation(String insideLocation) {
        this.insideLocation = insideLocation == null ? null : insideLocation.trim();
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
        sb.append(", deployNodeId=").append(deployNodeId);
        sb.append(", addressId=").append(addressId);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", purposeExplain=").append(purposeExplain);
        sb.append(", insideLocation=").append(insideLocation);
        sb.append(", remarks=").append(remarks);
        sb.append("]");
        return sb.toString();
    }
}