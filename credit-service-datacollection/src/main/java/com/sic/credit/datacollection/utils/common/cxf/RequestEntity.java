package com.sic.credit.datacollection.utils.common.cxf;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public class RequestEntity {

    //webservice请求参数对象信息
    private Object[] requestObjects;

    // xml返回信息根节点名称
    private String xmlRootnodename;

    public Object[] getRequestObjects() {
        return requestObjects;
    }



    public void setRequestObjects(Object[] requestObjects) {
        this.requestObjects = requestObjects;
    }

    public String getXmlRootnodename() {
        return xmlRootnodename;
    }

    public void setXmlRootnodename(String xmlRootnodename) {
        this.xmlRootnodename = xmlRootnodename;
    }

    /**
     *   调用接口名称
     * @return
     */
    public String getMethodName(){
        return "";
    }


}

