package com.sic.credit.api.datacollection.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Xysb_Personal
 * @Description
 * @Author zhh
 * @Date 2018/10/23 16:51
 * @Version 1.0
 **/
public class Xysb_Personal implements Serializable {
    private String id;
    private String reason;
    private String sbr;
    private Date sbrq;
    private String sfzh;
    private String lxdh;
    private String lxdz;
    private String yzbm;
    private String sbxxms;
    private String userid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSbr() {
        return sbr;
    }

    public void setSbr(String sbr) {
        this.sbr = sbr;
    }

    public Date getSbrq() {
        return sbrq;
    }

    public void setSbrq(Date sbrq) {
        this.sbrq = sbrq;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getSbxxms() {
        return sbxxms;
    }

    public void setSbxxms(String sbxxms) {
        this.sbxxms = sbxxms;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
