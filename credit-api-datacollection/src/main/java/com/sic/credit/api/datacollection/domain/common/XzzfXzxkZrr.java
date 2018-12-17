package com.sic.credit.api.datacollection.domain.common;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 行政许可信息表(自然人)
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-13
 */
@Table(name = "xzzf_xzxk_zrr")
public class XzzfXzxkZrr implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 行政相对人名称
     */
    private String xkXdrMc;
    /**
     * 行政相对人代码_1(统一社会信
用代码)
     */
    private String xkXdrShxym;
    /**
     * 行政相对人代码_2 (工商注册
号)
     */
    private String xkXdrGszc;
    /**
     * 行政相对人代码_3(组织机构代
码)
     */
    private String xkXdrZzjg;
    /**
     * 行政相对人代码_4(税务登记号)
     */
    private String xkXdrSwdj;
    /**
     * 行政相对人代码_5(事业单位证
书号)
     */
    private String xkXdrSydw;
    /**
     * 行政相对人代码_6(社会组织登
记证号)
     */
    private String xkXdrShzz;
    /**
     * 法定代表人
     */
    private String xkFrdb;
    /**
     * 法定代表人身份证号
     */
    private String xkFrSfzh;
    /**
     * 证件类型
     */
    private String xkXdrZjlx;
    /**
     * 证件号码
     */
    private String xkXdrZjhm;
    /**
     * 行政许可决定文书名称
     */
    private String xkXkws;
    /**
     * 行政许可决定文书号
     */
    private String xkWsh;
    /**
     * 许可类别
     */
    private String xkXklb;
    /**
     * 许可证书名称
     */
    private String xkXkzs;
    /**
     * 许可编号
     */
    private String xkXkbh;
    /**
     * 许可内容
     */
    private String xkNr;
    /**
     * 许可决定日期
     */
    private Date xkJdrq;
    /**
     * 有效期自
     */
    private Date xkYxqz;
    /**
     * 有效期至
     */
    private Date xkYxqzi;
    /**
     * 许可机关
     */
    private String xkXkjg;
    /**
     * 当前状态
     */
    private String xkZt;
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
     * 许可机关统一社会信用代码
     */
    private String xkXkjgdm;
    /**
     * 数据来源单位
     */
    private String xkLydw;
    /**
     * 数据来源单位统一社会信用代
码
     */
    private String xkLydwdm;
    private String impId;
    private String flag;
    private String isSuccess;
    private String govId;
    private String reportNote;
    private Date reportTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXkXdrMc() {
        return xkXdrMc;
    }

    public void setXkXdrMc(String xkXdrMc) {
        this.xkXdrMc = xkXdrMc;
    }

    public String getXkXdrShxym() {
        return xkXdrShxym;
    }

    public void setXkXdrShxym(String xkXdrShxym) {
        this.xkXdrShxym = xkXdrShxym;
    }

    public String getXkXdrGszc() {
        return xkXdrGszc;
    }

    public void setXkXdrGszc(String xkXdrGszc) {
        this.xkXdrGszc = xkXdrGszc;
    }

    public String getXkXdrZzjg() {
        return xkXdrZzjg;
    }

    public void setXkXdrZzjg(String xkXdrZzjg) {
        this.xkXdrZzjg = xkXdrZzjg;
    }

    public String getXkXdrSwdj() {
        return xkXdrSwdj;
    }

    public void setXkXdrSwdj(String xkXdrSwdj) {
        this.xkXdrSwdj = xkXdrSwdj;
    }

    public String getXkXdrSydw() {
        return xkXdrSydw;
    }

    public void setXkXdrSydw(String xkXdrSydw) {
        this.xkXdrSydw = xkXdrSydw;
    }

    public String getXkXdrShzz() {
        return xkXdrShzz;
    }

    public void setXkXdrShzz(String xkXdrShzz) {
        this.xkXdrShzz = xkXdrShzz;
    }

    public String getXkFrdb() {
        return xkFrdb;
    }

    public void setXkFrdb(String xkFrdb) {
        this.xkFrdb = xkFrdb;
    }

    public String getXkFrSfzh() {
        return xkFrSfzh;
    }

    public void setXkFrSfzh(String xkFrSfzh) {
        this.xkFrSfzh = xkFrSfzh;
    }

    public String getXkXdrZjlx() {
        return xkXdrZjlx;
    }

    public void setXkXdrZjlx(String xkXdrZjlx) {
        this.xkXdrZjlx = xkXdrZjlx;
    }

    public String getXkXdrZjhm() {
        return xkXdrZjhm;
    }

    public void setXkXdrZjhm(String xkXdrZjhm) {
        this.xkXdrZjhm = xkXdrZjhm;
    }

    public String getXkXkws() {
        return xkXkws;
    }

    public void setXkXkws(String xkXkws) {
        this.xkXkws = xkXkws;
    }

    public String getXkWsh() {
        return xkWsh;
    }

    public void setXkWsh(String xkWsh) {
        this.xkWsh = xkWsh;
    }

    public String getXkXklb() {
        return xkXklb;
    }

    public void setXkXklb(String xkXklb) {
        this.xkXklb = xkXklb;
    }

    public String getXkXkzs() {
        return xkXkzs;
    }

    public void setXkXkzs(String xkXkzs) {
        this.xkXkzs = xkXkzs;
    }

    public String getXkXkbh() {
        return xkXkbh;
    }

    public void setXkXkbh(String xkXkbh) {
        this.xkXkbh = xkXkbh;
    }

    public String getXkNr() {
        return xkNr;
    }

    public void setXkNr(String xkNr) {
        this.xkNr = xkNr;
    }

    public Date getXkJdrq() {
        return xkJdrq;
    }

    public void setXkJdrq(Date xkJdrq) {
        this.xkJdrq = xkJdrq;
    }

    public Date getXkYxqz() {
        return xkYxqz;
    }

    public void setXkYxqz(Date xkYxqz) {
        this.xkYxqz = xkYxqz;
    }

    public Date getXkYxqzi() {
        return xkYxqzi;
    }

    public void setXkYxqzi(Date xkYxqzi) {
        this.xkYxqzi = xkYxqzi;
    }

    public String getXkXkjg() {
        return xkXkjg;
    }

    public void setXkXkjg(String xkXkjg) {
        this.xkXkjg = xkXkjg;
    }

    public String getXkZt() {
        return xkZt;
    }

    public void setXkZt(String xkZt) {
        this.xkZt = xkZt;
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

    public String getXkXkjgdm() {
        return xkXkjgdm;
    }

    public void setXkXkjgdm(String xkXkjgdm) {
        this.xkXkjgdm = xkXkjgdm;
    }

    public String getXkLydw() {
        return xkLydw;
    }

    public void setXkLydw(String xkLydw) {
        this.xkLydw = xkLydw;
    }

    public String getXkLydwdm() {
        return xkLydwdm;
    }

    public void setXkLydwdm(String xkLydwdm) {
        this.xkLydwdm = xkLydwdm;
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

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public String getReportNote() {
        return reportNote;
    }

    public void setReportNote(String reportNote) {
        this.reportNote = reportNote;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

}
