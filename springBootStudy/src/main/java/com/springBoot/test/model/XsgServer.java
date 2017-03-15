package com.springBoot.test.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xiaojun.zhang on 2016/3/26.
 */
//@Entity
//@Table(name="game_server")
public class XsgServer implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="id",nullable = false)
    private int id;
//    @Column(name="show_id",nullable = false)
    private int showId;
//    @Column(name="host",nullable = false)
    private String host;
//    @Column(name="is_new",nullable = false)
    private boolean isNew;
//    @Column(name="name",nullable = false)
    private String name;
//    @Column(name="cp_show_only",nullable = false)
    private boolean isCpShowOnly;
//    @Column(name="cp_enter_only",nullable = false)
    private boolean isCpEnterOnly;
//    @Column(name="online_limit",nullable = false)
    private int onlineLimit;

    public XsgServer() { }

    public XsgServer(int id, int showId, String host, boolean isNew, String name, boolean isCpShowOnly, boolean isCpEnterOnly, int onlineLimit) {
        this.id = id;
        this.showId = showId;
        this.host = host;
        this.isNew = isNew;
        this.name = name;
        this.isCpShowOnly = isCpShowOnly;
        this.isCpEnterOnly = isCpEnterOnly;
        this.onlineLimit = onlineLimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCpShowOnly() {
        return isCpShowOnly;
    }

    public void setIsCpShowOnly(boolean isCpShowOnly) {
        this.isCpShowOnly = isCpShowOnly;
    }

    public boolean isCpEnterOnly() {
        return isCpEnterOnly;
    }

    public void setIsCpEnterOnly(boolean isCpEnterOnly) {
        this.isCpEnterOnly = isCpEnterOnly;
    }

    public int getOnlineLimit() {
        return onlineLimit;
    }

    public void setOnlineLimit(int onlineLimit) {
        this.onlineLimit = onlineLimit;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
