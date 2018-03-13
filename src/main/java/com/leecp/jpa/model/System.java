package com.leecp.jpa.model;
// Generated 2018-2-22 20:11:02 by Hibernate Tools 5.2.8.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * System generated by hbm2java
 */
@Entity
public class System implements java.io.Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;
    private String description;
    private Long ctime;
    private Long orders;

    public System() {
    }

    public System(String name) {
        this.name = name;
    }

    public System(String name, String code, String description, Long ctime, Long orders) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.ctime = ctime;
        this.orders = orders;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCtime() {
        return this.ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getOrders() {
        return this.orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

}
