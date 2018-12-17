package com.sic.credit.api.datacollection.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 17-12-25 下午4:59
 * <br>@version : 1.0
 */
public class Res_Catalogues implements Serializable {

    private String id;
    private String catalogId;
    private String cataloguesCode;
    private String subjectType;
    private String catalogFormat;
    private String catalogRange;
    private String updateCycle;
    private String sharingMode;
    private String natureType;
    private String scope;
    private Date publishDate;
    private String cbjg;
    private String ssyj;
    private String sszt;
    private String zrsx;
    private String zzqx;
    private String bz;
    private Date createTime;
    private Date updateTime;
    private String userId;
    private String deleteFlag;
    /**
     *  有效期限
     */
    private String yxqx;
    /**
     *  公开属性
     */
    private String gksx;
    /**
     *  数据提供方式
     */
    private String sjtgfs;
    /**
     *  是否可提供
     */
    private String sfktg;

    public Res_Catalogues(){}

    public String getYxqx() {
        return yxqx;
    }

    public void setYxqx(String yxqx) {
        this.yxqx = yxqx;
    }

    public String getGksx() {
        return gksx;
    }

    public void setGksx(String gksx) {
        this.gksx = gksx;
    }

    public String getSjtgfs() {
        return sjtgfs;
    }

    public void setSjtgfs(String sjtgfs) {
        this.sjtgfs = sjtgfs;
    }

    public String getSfktg() {
        return sfktg;
    }

    public void setSfktg(String sfktg) {
        this.sfktg = sfktg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCataloguesCode() {
        return cataloguesCode;
    }

    public void setCataloguesCode(String cataloguesCode) {
        this.cataloguesCode = cataloguesCode;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
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

    public Date getPublishDate() {
        return publishDate;
    }

//    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getCbjg() {
        return cbjg;
    }

    public void setCbjg(String cbjg) {
        this.cbjg = cbjg;
    }

    public String getSsyj() {
        return ssyj;
    }

    public void setSsyj(String ssyj) {
        this.ssyj = ssyj;
    }

    public String getSszt() {
        return sszt;
    }

    public void setSszt(String sszt) {
        this.sszt = sszt;
    }

    public String getZrsx() {
        return zrsx;
    }

    public void setZrsx(String zrsx) {
        this.zrsx = zrsx;
    }

    public String getZzqx() {
        return zzqx;
    }

    public void setZzqx(String zzqx) {
        this.zzqx = zzqx;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
