package com.leecp.jpa.model;
// Generated 2018-2-22 20:11:02 by Hibernate Tools 5.2.8.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tag generated by hbm2java
 */
@Entity
public class Tag implements java.io.Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private String icon;
    private byte type;
    private String alias;
    private Integer systemId;
    private long ctime;
    private long orders;

    public Tag() {
    }

    public Tag(String name, byte type, long ctime, long orders) {
        this.name = name;
        this.type = type;
        this.ctime = ctime;
        this.orders = orders;
    }

    public Tag(String name, String description, String icon, byte type, String alias, Integer systemId, long ctime,
            long orders) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.type = type;
        this.alias = alias;
        this.systemId = systemId;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public byte getType() {
        return this.type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getSystemId() {
        return this.systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public long getCtime() {
        return this.ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public long getOrders() {
        return this.orders;
    }

    public void setOrders(long orders) {
        this.orders = orders;
    }

}
