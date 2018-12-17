package com.sic.credit.api.datacollection.domain.common;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.Serializable;

/**
 * @ClassName
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/23 17:08
 * @Version 1.0
 **/
public class Xysb_Attachment_Catalog implements Serializable {
    private String id;
    private String name;
    private int typeid;
    private int orders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
}
