package com.sic.credit.api.datacollection.bo.common;

import com.sic.credit.api.datacollection.domain.common.Xysb_Attachment;

import java.io.Serializable;

/**
 * @ClassName Xysb_AttachmentBo
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/23 17:51
 * @Version 1.0
 **/
public class Xysb_AttachmentBo extends Xysb_Attachment implements Serializable {
    private String catalogId;
    private String catalogName;
    private int catalogOrder;

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getCatalogOrder() {
        return catalogOrder;
    }

    public void setCatalogOrder(int catalogOrder) {
        this.catalogOrder = catalogOrder;
    }
}
