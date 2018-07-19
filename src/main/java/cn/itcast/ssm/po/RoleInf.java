package cn.itcast.ssm.po;

import java.io.Serializable;

public class RoleInf implements Serializable {
    private Integer id;

    private String rolename;

    private String roledetail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledetail() {
        return roledetail;
    }

    public void setRoledetail(String roledetail) {
        this.roledetail = roledetail == null ? null : roledetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rolename=").append(rolename);
        sb.append(", roledetail=").append(roledetail);
        sb.append("]");
        return sb.toString();
    }
}