package com.sic.credit.api.datacollection.domain.common;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 行政处罚信息表(自然人)
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-13
 */
@Table(name = "xzzf_xzcf_zrr")
public class XzzfXzcfZrr implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 行政相对人名称
     */
    private String cfXdrMc;
    /**
     * 行政相对人代码_1(统一社会
信用代码)
     */
    private String cfXdrShxym;
    /**
     * 行政相对人代码_2 (工商注
册号)
     */
    private String cfXdrGszc;
    /**
     * 行政相对人代码_3(组织机构
代码)
     */
    private String cfXdrZzjg;
    /**
     * 行政相对人代码_4(税务登记
号)
     */
    private String cfXdrSwdj;
    /**
     * 行政相对人代码_5(事业单位
证书号)
     */
    private String cfXdrSydw;
    /**
     * 行政相对人代码_6(社会组织
登记证号)
     */
    private String cfXdrShzz;
    /**
     * 法定代表人
     */
    private String cfFrdb;
    /**
     * 法定代表人身份证号
     */
    private String cfFrSfzh;
    /**
     * 证件类型
     */
    private String cfXdrZjlx;
    /**
     * 证件号码
     */
    private String cfXdrZjhm;
    /**
     * 行政处罚决定书文号
     */
    private String cfWsh;
    /**
     * 行政处罚决定书文号
     */
    private String cfWfxw;
    /**
     * 违法事实
     */
    private String cfSy;
    /**
     * 处罚依据
     */
    private String cfYj;
    /**
     * 处罚类别
     */
    private String cfCflb;
    /**
     * 处罚内容
     */
    private String cfNr;
    /**
     * 罚款金额（万元）
     */
    private Double cfNrFk;
    /**
     * 没收违法所得、没收非法财物
的金额（万元）
     */
    private Double cfNrWfff;
    /**
     * 暂扣或吊销证照名称及编号
     */
    private String cfNrZkdx;
    /**
     * 处罚决定日期
     */
    private Date cfJdrq;
    /**
     * 处罚有效期
     */
    private Date cfYxq;
    /**
     * 公示截止期
     */
    private Date cfGsjzq;
    /**
     * 处罚机关
     */
    private String cfCfjg;
    /**
     * 备注
     */
    private String bz;
    private String stationId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 导入类型
     */
    private String impType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 处罚机关统一社会信用代码
     */
    private String cfCfjgdm;
    /**
     * 数据来源单位
     */
    private String cfSjly;
    /**
     * 数据来源单位统一社会信用
代码
     */
    private String cfSjlydm;
    private Date reportTime;
    private String impId;
    private String flag;
    private String isSuccess;
    private Double govId;
    private String reportNote;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCfXdrMc() {
        return cfXdrMc;
    }

    public void setCfXdrMc(String cfXdrMc) {
        this.cfXdrMc = cfXdrMc;
    }

    public String getCfXdrShxym() {
        return cfXdrShxym;
    }

    public void setCfXdrShxym(String cfXdrShxym) {
        this.cfXdrShxym = cfXdrShxym;
    }

    public String getCfXdrGszc() {
        return cfXdrGszc;
    }

    public void setCfXdrGszc(String cfXdrGszc) {
        this.cfXdrGszc = cfXdrGszc;
    }

    public String getCfXdrZzjg() {
        return cfXdrZzjg;
    }

    public void setCfXdrZzjg(String cfXdrZzjg) {
        this.cfXdrZzjg = cfXdrZzjg;
    }

    public String getCfXdrSwdj() {
        return cfXdrSwdj;
    }

    public void setCfXdrSwdj(String cfXdrSwdj) {
        this.cfXdrSwdj = cfXdrSwdj;
    }

    public String getCfXdrSydw() {
        return cfXdrSydw;
    }

    public void setCfXdrSydw(String cfXdrSydw) {
        this.cfXdrSydw = cfXdrSydw;
    }

    public String getCfXdrShzz() {
        return cfXdrShzz;
    }

    public void setCfXdrShzz(String cfXdrShzz) {
        this.cfXdrShzz = cfXdrShzz;
    }

    public String getCfFrdb() {
        return cfFrdb;
    }

    public void setCfFrdb(String cfFrdb) {
        this.cfFrdb = cfFrdb;
    }

    public String getCfFrSfzh() {
        return cfFrSfzh;
    }

    public void setCfFrSfzh(String cfFrSfzh) {
        this.cfFrSfzh = cfFrSfzh;
    }

    public String getCfXdrZjlx() {
        return cfXdrZjlx;
    }

    public void setCfXdrZjlx(String cfXdrZjlx) {
        this.cfXdrZjlx = cfXdrZjlx;
    }

    public String getCfXdrZjhm() {
        return cfXdrZjhm;
    }

    public void setCfXdrZjhm(String cfXdrZjhm) {
        this.cfXdrZjhm = cfXdrZjhm;
    }

    public String getCfWsh() {
        return cfWsh;
    }

    public void setCfWsh(String cfWsh) {
        this.cfWsh = cfWsh;
    }

    public String getCfWfxw() {
        return cfWfxw;
    }

    public void setCfWfxw(String cfWfxw) {
        this.cfWfxw = cfWfxw;
    }

    public String getCfSy() {
        return cfSy;
    }

    public void setCfSy(String cfSy) {
        this.cfSy = cfSy;
    }

    public String getCfYj() {
        return cfYj;
    }

    public void setCfYj(String cfYj) {
        this.cfYj = cfYj;
    }

    public String getCfCflb() {
        return cfCflb;
    }

    public void setCfCflb(String cfCflb) {
        this.cfCflb = cfCflb;
    }

    public String getCfNr() {
        return cfNr;
    }

    public void setCfNr(String cfNr) {
        this.cfNr = cfNr;
    }

    public Double getCfNrFk() {
        return cfNrFk;
    }

    public void setCfNrFk(Double cfNrFk) {
        this.cfNrFk = cfNrFk;
    }

    public Double getCfNrWfff() {
        return cfNrWfff;
    }

    public void setCfNrWfff(Double cfNrWfff) {
        this.cfNrWfff = cfNrWfff;
    }

    public String getCfNrZkdx() {
        return cfNrZkdx;
    }

    public void setCfNrZkdx(String cfNrZkdx) {
        this.cfNrZkdx = cfNrZkdx;
    }

    public Date getCfJdrq() {
        return cfJdrq;
    }

    public void setCfJdrq(Date cfJdrq) {
        this.cfJdrq = cfJdrq;
    }

    public Date getCfYxq() {
        return cfYxq;
    }

    public void setCfYxq(Date cfYxq) {
        this.cfYxq = cfYxq;
    }

    public Date getCfGsjzq() {
        return cfGsjzq;
    }

    public void setCfGsjzq(Date cfGsjzq) {
        this.cfGsjzq = cfGsjzq;
    }

    public String getCfCfjg() {
        return cfCfjg;
    }

    public void setCfCfjg(String cfCfjg) {
        this.cfCfjg = cfCfjg;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImpType() {
        return impType;
    }

    public void setImpType(String impType) {
        this.impType = impType;
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

    public String getCfCfjgdm() {
        return cfCfjgdm;
    }

    public void setCfCfjgdm(String cfCfjgdm) {
        this.cfCfjgdm = cfCfjgdm;
    }

    public String getCfSjly() {
        return cfSjly;
    }

    public void setCfSjly(String cfSjly) {
        this.cfSjly = cfSjly;
    }

    public String getCfSjlydm() {
        return cfSjlydm;
    }

    public void setCfSjlydm(String cfSjlydm) {
        this.cfSjlydm = cfSjlydm;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Double getGovId() {
        return govId;
    }

    public void setGovId(Double govId) {
        this.govId = govId;
    }

    public String getReportNote() {
        return reportNote;
    }

    public void setReportNote(String reportNote) {
        this.reportNote = reportNote;
    }

}
