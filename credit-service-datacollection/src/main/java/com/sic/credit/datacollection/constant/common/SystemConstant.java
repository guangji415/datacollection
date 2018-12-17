package com.sic.credit.datacollection.constant.common;

import com.sic.common.web.context.ReadAblePropertyPlaceholderConfigurer;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 */
public class SystemConstant {
    //=========================== CxfClient 设置 =========================================

    /**
     * cxfClient连接超时
     */
    public static long CXFCLIENT_CONNECTIONTIMEOUT = 10000;

    /**
     * cxfClient响应超时
     */
    public static long CXFCLIENT_RECEIVETIMEOUT = 60000;


    /**
     * cxfClientPool 最大保留个数
     */
    public static int CXFCLIENTPOOL_MAX = 30;

    //===========================  双公示国家报送常量参数  =========================================
    /**
     * 国家数据库相关操作 调用webservice，上报行政许可类数据
     */
    public static String SGS_METHODNAME_TOIMPORTPERMISSION;

    /**
     * 国家数据库相关操作 调用webservice，取消上报行政许可类数据
     */
    public static String SGS_METHODNAME_TOREMOVEPERMISSION;

    /**
     * 国家数据库相关操作 调用webservice，上报行政处罚类数据
     */
    public static String SGS_METHODNAME_TOIMPORTPENALY;

    /**
     * 国家数据库相关操作 调用webservice，取消上报行政处罚类数据
     */
    public static String SGS_METHODNAME_TOREMOVEPENALY;

    /**
     * 密钥文件的物理路径
     */
    public static String SGS_TRUSTSTORE_PATH;

    /**
     * TOKEN
     */
    public static String SGS_TOKEN;

    /**
     * 密钥密码
     */
    public static String SGS_TRUSTSTORE_PASSWORD;

    /**
     * 行政许可wsdl地址
     */
    public static String SGS_PERMISSIONWEBSERVICE_WSDL;

    /**
     * 行政处罚wsdl地址
     */
    public static String SGS_PENALTYWEBSERVICE_WSDL;

    /**
     *  命名空间
     */
    public static String SGS_NAMESPACE;

    static {
        try {
            CXFCLIENT_CONNECTIONTIMEOUT = Long.valueOf((String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("cxfClient.connectionTimeout"));
            CXFCLIENT_RECEIVETIMEOUT = Long.valueOf((String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("cxfClient.receiveTimeout"));
            CXFCLIENTPOOL_MAX = Integer.valueOf((String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("cxfClientPool.max"));
            SGS_METHODNAME_TOIMPORTPERMISSION = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.methodname.toimportpermission");
            SGS_METHODNAME_TOREMOVEPERMISSION = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.methodname.toremovepermission");
            SGS_METHODNAME_TOIMPORTPENALY = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.methodname.toimportpenaly");
            SGS_METHODNAME_TOREMOVEPENALY = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.methodname.toremovepenaly");
            SGS_TRUSTSTORE_PATH = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.truststore.path");
            SGS_TRUSTSTORE_PASSWORD = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.truststore.password");
            SGS_PERMISSIONWEBSERVICE_WSDL = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.permissionwebservice.wsdl");
            SGS_PENALTYWEBSERVICE_WSDL = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.penaltywebservice.wsdl");
            SGS_NAMESPACE = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.namespace");
            SGS_TOKEN = (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("sgs.token");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

