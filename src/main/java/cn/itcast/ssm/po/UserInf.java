package cn.itcast.ssm.po;

import java.io.Serializable;
import java.util.Date;

public class UserInf implements Serializable {
    private Integer id;

    private String userid;

    private String password;

    private String tel;

    private String email;

    private String name;

    private String idnumber;

    private String state;

    private Date regtime;

    private Integer userTypeId;

    private String userOtherId;

    private Integer qq;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserOtherId() {
        return userOtherId;
    }

    public void setUserOtherId(String userOtherId) {
        this.userOtherId = userOtherId == null ? null : userOtherId.trim();
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", password=").append(password);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", name=").append(name);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", state=").append(state);
        sb.append(", regtime=").append(regtime);
        sb.append(", userTypeId=").append(userTypeId);
        sb.append(", userOtherId=").append(userOtherId);
        sb.append(", qq=").append(qq);
        sb.append("]");
        return sb.toString();
    }
}