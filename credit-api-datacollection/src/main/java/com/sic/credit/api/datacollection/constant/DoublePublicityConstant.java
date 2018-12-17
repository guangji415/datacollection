package com.sic.credit.api.datacollection.constant;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public class DoublePublicityConstant {

    /**
     * 上报国家默认的返回ID，添加时默认赋值0
     */
    public static final String REPORT_TO_COUNTRY_VALUE = "0";

    /**
     * 是否测试数据
     */
    public static final String REPORT_ISTESTDATA = "1";
    public static final String REPORT_ISNOTTESTDATA = "0";

    /**
     * 测试数据字段名称
     */
    public static final String REPORT_FIELD_ISTESTDATA = "istestdata";

    /**
     * 是上报还是取消上报 0未上报 1已上报 2取消上报
     */
    public static final String ISNOTREPORTCOUNTRY = "0";
    public static final String ISREPORTCOUNTRY = "1";
    public static final String ISOFFREPORTCOUNTRY = "2";

    public static final String ISFAIL = "0";//失败状态
    public static final String ISSUCCESS = "1";//成功状态
    public static final String PARTSUCCESS = "2";//部分成功状态

    public static final String TYPE_COMPANY_PERMISSION = "1";//行政许可(企业)
    public static final String TYPE_COMPANY_PENALTY = "2";//行政处罚(企业)
    public static final String TYPE_NATURALPERSON_PERMISSION = "4";//行政许可(自然人)
    public static final String TYPE_NATURALPERSON_PENALTY = "5";//行政处罚(自然人)

    public static final String TYPE_COMPANY = "1";//企业、法人
    public static final String TYPE_NATURALPERSON = "2";//自然人

    public static final String ISDELETE = "1";//删除状态
    public static final String NOTDELETE = "0";//未删除

    /**
     * 统计标准
     */
    public static final String COUNTSTANDARD_UPDATE = "0"; // 更新数据
    public static final String COUNTSTANDARD_NEW = "1"; // 上传数据

}
