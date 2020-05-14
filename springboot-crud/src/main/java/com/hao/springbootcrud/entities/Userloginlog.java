package com.hao.springbootcrud.entities;

import java.util.Date;

public class Userloginlog {
    private Integer id;

    private String username;

    private String password;

    private Date createTime;

    private String ipaddr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    @Override
    public String toString() {
        return "Userloginlog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", ipaddr='" + ipaddr + '\'' +
                '}';
    }
}