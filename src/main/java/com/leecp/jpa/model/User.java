package com.leecp.jpa.model;
// Generated 2018-2-22 20:11:02 by Hibernate Tools 5.2.8.Final

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * User generated by hbm2java
 */
@Entity
public class User implements java.io.Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String password;
    private String salt;
    private String nickname;
    private Byte sex;
    private String avatar;
    private Date createTime;
    private String createIp;
    private Date lastLoginTime;
    private String lastLoginIp;

    public User() {
    }

    public User(Date createTime, Date lastLoginTime) {
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
    }

    public User(String password, String salt, String nickname, Byte sex, String avatar, Date createTime,
            String createIp, Date lastLoginTime, String lastLoginIp) {
        this.password = password;
        this.salt = salt;
        this.nickname = nickname;
        this.sex = sex;
        this.avatar = avatar;
        this.createTime = createTime;
        this.createIp = createIp;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Byte getSex() {
        return this.sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateIp() {
        return this.createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

}
