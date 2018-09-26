package cn.itcast.ssm.po;

import java.io.Serializable;

public class DisposalMethodInfo implements Serializable {
    private Integer disposalMethodId;

    private String disposalMethodName;

    private String disposalMeasure;

    private String disposalContent;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getDisposalMethodId() {
        return disposalMethodId;
    }

    public void setDisposalMethodId(Integer disposalMethodId) {
        this.disposalMethodId = disposalMethodId;
    }

    public String getDisposalMethodName() {
        return disposalMethodName;
    }

    public void setDisposalMethodName(String disposalMethodName) {
        this.disposalMethodName = disposalMethodName == null ? null : disposalMethodName.trim();
    }

    public String getDisposalMeasure() {
        return disposalMeasure;
    }

    public void setDisposalMeasure(String disposalMeasure) {
        this.disposalMeasure = disposalMeasure == null ? null : disposalMeasure.trim();
    }

    public String getDisposalContent() {
        return disposalContent;
    }

    public void setDisposalContent(String disposalContent) {
        this.disposalContent = disposalContent == null ? null : disposalContent.trim();
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
        sb.append(", disposalMethodId=").append(disposalMethodId);
        sb.append(", disposalMethodName=").append(disposalMethodName);
        sb.append(", disposalMeasure=").append(disposalMeasure);
        sb.append(", disposalContent=").append(disposalContent);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}