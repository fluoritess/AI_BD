package cn.itcast.ssm.po;

import java.io.Serializable;

public class UserState implements Serializable {
    private String stateid;

    private String statename;

    private String detail;

    private static final long serialVersionUID = 1L;

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid == null ? null : stateid.trim();
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename == null ? null : statename.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stateid=").append(stateid);
        sb.append(", statename=").append(statename);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}