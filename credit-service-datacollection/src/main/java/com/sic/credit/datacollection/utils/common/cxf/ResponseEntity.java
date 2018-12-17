package com.sic.credit.datacollection.utils.common.cxf;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public class ResponseEntity {

    /**
     * 结果
     */
    private String result;

    /**
     * 消息
     */
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

