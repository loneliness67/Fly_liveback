package com.flyl.liveback.vo;


public class UserVo {

    private Integer id ;
    private Integer liveId ;
    private String username ;
    private String sex ;
    private Integer statuc ;
    private String createTime ;
    //角色权限
    //账户状态
    private String phone ;
    private String email ;
    //用户密码，MD5加密
    //用户名

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private Integer role ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLiveId() {
        return liveId;
    }

    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }


    public Integer getStatuc() {
        return statuc;
    }

    public void setStatuc(Integer statuc) {
        this.statuc = statuc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
