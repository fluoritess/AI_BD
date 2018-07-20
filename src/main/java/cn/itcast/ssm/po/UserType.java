package cn.itcast.ssm.po;

import java.io.Serializable;

public class UserType implements Serializable {
    private Integer userTypeId;

    private String name;

    private String descrip;

    private static final long serialVersionUID = 1L;

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userTypeId=").append(userTypeId);
        sb.append(", name=").append(name);
        sb.append(", descrip=").append(descrip);
        sb.append("]");
        return sb.toString();
    }
}