package cn.itcast.ssm.po;

import java.io.Serializable;

public class RootInf implements Serializable {
    private String rootid;

    private String rootpw;

    private String tel;

    private static final long serialVersionUID = 1L;

    public String getRootid() {
        return rootid;
    }

    public void setRootid(String rootid) {
        this.rootid = rootid == null ? null : rootid.trim();
    }

    public String getRootpw() {
        return rootpw;
    }

    public void setRootpw(String rootpw) {
        this.rootpw = rootpw == null ? null : rootpw.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rootid=").append(rootid);
        sb.append(", rootpw=").append(rootpw);
        sb.append(", tel=").append(tel);
        sb.append("]");
        return sb.toString();
    }
}