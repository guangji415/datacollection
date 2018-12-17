package com.sic.credit.api.datacollection.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Xysb_Personal
 * @Description TODO
 * @Author zhh
 * @Date 2018/10/23 16:51
 * @Version 1.0
 **/
public class Xysb_Attachment implements Serializable {
    private String id;
    private String sbid;
    private String catalogid;
    private int orders;
    private String filename;
    private String filepath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSbid() {
        return sbid;
    }

    public void setSbid(String sbid) {
        this.sbid = sbid;
    }

    public String getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(String catalogid) {
        this.catalogid = catalogid;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}
