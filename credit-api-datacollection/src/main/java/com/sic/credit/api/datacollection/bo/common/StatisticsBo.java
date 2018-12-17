package com.sic.credit.api.datacollection.bo.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 18-12-25 下午4:59
 * <br>@version : 1.0
 */
public class StatisticsBo implements Serializable {

    private String orgName;//厅局中文全称
    private String enShortName;//厅局英文缩写名称
    private String cnShortName;//厅局中文缩写名称
    private int sbDataTotal;//上报数据总和
    private Date lastCreateTime;
    private String lastCreateTimeText;
    private String areaPrefix;
    private String areaPrefixText;
    private String impType;
    private int sbXzxkDataTotal;
    private int sbXzcfDataTotal;
    private String startCreateTime;
    private String endCreateTime;
    private String startSjcTime;
    private String endSjcTime;
    private String startUpdateTime;
    private String endUpdateTime;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getEnShortName() {
        return enShortName;
    }

    public void setEnShortName(String enShortName) {
        this.enShortName = enShortName;
    }

    public String getCnShortName() {
        return cnShortName;
    }

    public void setCnShortName(String cnShortName) {
        this.cnShortName = cnShortName;
    }

    public int getSbDataTotal() {
        return sbDataTotal;
    }

    public void setSbDataTotal(int sbDataTotal) {
        this.sbDataTotal = sbDataTotal;
    }

    public Date getLastCreateTime() {
        return lastCreateTime;
    }

    public void setLastCreateTime(Date lastCreateTime) {
        this.lastCreateTime = lastCreateTime;
    }

    public void setLastCreateTimeText(String lastCreateTimeText) {
        this.lastCreateTimeText = lastCreateTimeText;
    }

    public String getLastCreateTimeText() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(lastCreateTime==null){
            return "";
        }else{
            return sdf.format(lastCreateTime);
        }

    }

    public String getAreaPrefix() {
        return areaPrefix;
    }

    public void setAreaPrefix(String areaPrefix) {
        this.areaPrefix = areaPrefix;
    }

    public String getAreaPrefixText() {
        return areaPrefixText;
    }

    public void setAreaPrefixText(String areaPrefixText) {
        this.areaPrefixText = areaPrefixText;
    }

    public String getImpType() {
        return impType;
    }

    public void setImpType(String impType) {
        this.impType = impType;
    }

    public int getSbXzxkDataTotal() {
        return sbXzxkDataTotal;
    }

    public void setSbXzxkDataTotal(int sbXzxkDataTotal) {
        this.sbXzxkDataTotal = sbXzxkDataTotal;
    }

    public int getSbXzcfDataTotal() {
        return sbXzcfDataTotal;
    }

    public void setSbXzcfDataTotal(int sbXzcfDataTotal) {
        this.sbXzcfDataTotal = sbXzcfDataTotal;
    }

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public String getStartSjcTime() {
        return startSjcTime;
    }

    public void setStartSjcTime(String startSjcTime) {
        this.startSjcTime = startSjcTime;
    }

    public String getEndSjcTime() {
        return endSjcTime;
    }

    public void setEndSjcTime(String endSjcTime) {
        this.endSjcTime = endSjcTime;
    }

    public String getStartUpdateTime() {
        return startUpdateTime;
    }

    public void setStartUpdateTime(String startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }

    public String getEndUpdateTime() {
        return endUpdateTime;
    }

    public void setEndUpdateTime(String endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
    }
}
