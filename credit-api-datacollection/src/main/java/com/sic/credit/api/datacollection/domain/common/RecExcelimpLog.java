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
public class RecExcelimpLog implements Serializable {

    @Id
    private String id;
    private Date uploadTime;
    private String fileDateName;
    private String uploadLog;
    private String userId;
    private String stationId;
    private String uploadType;
    private String deleteFlag;
    private String successFlag;
    private String fileRealName;
    private Double total;
    private Double success;
    private Double fail;


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

    public String getFileDateName() {
        return fileDateName;
    }

    public void setFileDateName(String fileDateName) {
        this.fileDateName = fileDateName;
    }

    public String getUploadLog() {
        return uploadLog;
    }

    public void setUploadLog(String uploadLog) {
        this.uploadLog = uploadLog;
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

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getSuccessFlag() {
        return successFlag;
    }

    public void setSuccessFlag(String successFlag) {
        this.successFlag = successFlag;
    }

    public String getFileRealName() {
        return fileRealName;
    }

    public void setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
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

    @Override
    public String toString() {
        return "RecExcelimpLog{" +
        ", id=" + id +
        ", uploadTime=" + uploadTime +
        ", fileDateName=" + fileDateName +
        ", uploadLog=" + uploadLog +
        ", userId=" + userId +
        ", stationId=" + stationId +
        ", uploadType=" + uploadType +
        ", deleteFlag=" + deleteFlag +
        ", successFlag=" + successFlag +
        ", fileRealName=" + fileRealName +
        ", total=" + total +
        ", success=" + success +
        ", fail=" + fail +
        "}";
    }
}
