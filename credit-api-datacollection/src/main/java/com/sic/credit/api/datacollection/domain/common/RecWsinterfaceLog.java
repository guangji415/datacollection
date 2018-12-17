package com.sic.credit.api.datacollection.domain.common;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-17
 */
@Table(name = "xzzf_xzcf_fr")
public class RecWsinterfaceLog implements Serializable {

    @Id
    private String id;
    private Date uploadTime;
    private String uploadStatus;
    private String uploadMemo;
    private String userId;
    private String stationId;
    private String uploadType;
    private Double total;
    private Double success;
    private Double fail;
    private String isTest;
    private String resultMemo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getUploadMemo() {
        return uploadMemo;
    }

    public void setUploadMemo(String uploadMemo) {
        this.uploadMemo = uploadMemo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSuccess() {
        return success;
    }

    public void setSuccess(Double success) {
        this.success = success;
    }

    public Double getFail() {
        return fail;
    }

    public void setFail(Double fail) {
        this.fail = fail;
    }

    public String getIsTest() {
        return isTest;
    }

    public void setIsTest(String isTest) {
        this.isTest = isTest;
    }

    public String getResultMemo() {
        return resultMemo;
    }

    public void setResultMemo(String resultMemo) {
        this.resultMemo = resultMemo;
    }

    @Override
    public String toString() {
        return "RecWsinterfaceLog{" +
        ", id=" + id +
        ", uploadTime=" + uploadTime +
        ", uploadStatus=" + uploadStatus +
        ", uploadMemo=" + uploadMemo +
        ", userId=" + userId +
        ", stationId=" + stationId +
        ", uploadType=" + uploadType +
        ", total=" + total +
        ", success=" + success +
        ", fail=" + fail +
        ", isTest=" + isTest +
        ", resultMemo=" + resultMemo +
        "}";
    }
}
