package com.sic.credit.api.datacollection.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 18-12-25 下午4:59
 * <br>@version : 1.0
 */
public class Res_Catalog implements Serializable {

    private String id;
    private String catalogName;
    private String catalogType;
    private String catalogCode;
    private String orgId;
    private String enTableName;
    private String remark;
    private String catalogFormat;
    private String catalogRange;
    private String updateCycle;
    private String sharingMode;
    private String natureType;
    private String scope;
    private String templateId;
    private String fieldContent;
    private Date publishDate;
    private Integer statusFlag;
    private Date createTime;
    private Date updateTime;
    private String userId;
    private String deleteFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getEnTableName() {
        return enTableName;
    }

    public void setEnTableName(String enTableName) {
        this.enTableName = enTableName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCatalogFormat() {
        return catalogFormat;
    }

    public void setCatalogFormat(String catalogFormat) {
        this.catalogFormat = catalogFormat;
    }

    public String getCatalogRange() {
        return catalogRange;
    }

    public void setCatalogRange(String catalogRange) {
        this.catalogRange = catalogRange;
    }

    public String getUpdateCycle() {
        return updateCycle;
    }

    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }

    public String getSharingMode() {
        return sharingMode;
    }

    public void setSharingMode(String sharingMode) {
        this.sharingMode = sharingMode;
    }

    public String getNatureType() {
        return natureType;
    }

    public void setNatureType(String natureType) {
        this.natureType = natureType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getFieldContent() {
        return fieldContent;
    }

    public void setFieldContent(String fieldContent) {
        this.fieldContent = fieldContent;
    }

    public Date getPublishDate() {
        return publishDate;
    }
//    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
