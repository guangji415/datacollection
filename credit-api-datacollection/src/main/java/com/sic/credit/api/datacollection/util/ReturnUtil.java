package com.sic.credit.api.datacollection.util;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public class ReturnUtil implements Serializable {
    /**
     * flag：判断状态
     * message：返回信息存储
     * fieldValue：预留 存储字段的值
     * status 判断状态 用于可能存在多个状态的情况
     */
    private boolean flag;  //判断状态
    private String message; //返回信息存储
    private String fieldValue; //预留 存储字段的值
    private boolean status;  //判断状态 用于可能存在多个状态的情况

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
