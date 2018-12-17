package com.sic.credit.api.datacollection.enums.common;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public class DoublePublicityField {

    //region 枚举
    /**
     * 发布状态标记
     */
    public enum PublishState {
        NOPUBLISH("0", "未上报"), PUBLISH("1", "已上报"), CANCEL("2", "已撤销");

        private String value;
        private String showText;

        private PublishState(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static PublishState getByValue(String val) {
            for (PublishState status : PublishState.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + PublishState.class.getName() + "'");
        }
    }

    /**
     * 获取数据状态列表
     * @return
     */
    public static List<PublishState> getPublishStateList(){
        return Arrays.asList(DoublePublicityField.PublishState.NOPUBLISH, DoublePublicityField.PublishState.PUBLISH, DoublePublicityField.PublishState.CANCEL);
    }

    /**
     * 数据来源
     */
    public enum DataSource {
        FORM("0", "表单填报"), AUTOEXCHANGE("2", "自动交换"), WEBSERVICE("1", "WebService"), EXCEL("3", "Excel上报");

        private String value;
        private String showText;

        private DataSource(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static DataSource getByValue(String val) {
            for (DataSource status : DataSource.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + DataSource.class.getName() + "'");
        }
    }

    /**
     * 获取数据来源列表
     * @return
     */
    public static List<DoublePublicityField.DataSource> getDataSourceList(){
        return Arrays.asList(DoublePublicityField.DataSource.FORM, DoublePublicityField.DataSource.WEBSERVICE, DoublePublicityField.DataSource.EXCEL);
    }

    /**
     * 是否合格
     */
    public enum Accredited {
        ISACCREDITED("1", "合格"), NOTACCREDITED("0", "不合格");

        private String value;
        private String showText;

        private Accredited(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static Accredited getByValue(String val) {
            for (Accredited status : Accredited.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + Accredited.class.getName() + "'");
        }
    }

    /**
     * 获取是否合格列表
     * @return
     */
    public static List<DoublePublicityField.Accredited> getAccreditedList(){
        return Arrays.asList(DoublePublicityField.Accredited.ISACCREDITED, DoublePublicityField.Accredited.NOTACCREDITED);
    }
    /**
     *     许可审批类别
     */
    public enum XkXklb {
        NORMAL("0", "普通"), FRANCHISE("1", "特许"), ACCEPTABLE("2", "认可"), APPROVAL("3", "核准"), REGISTERED("4", "登记")
        , OTHERS("5", "其他（备注注明）");

        private String value;
        private String showText;

        private XkXklb(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static XkXklb getByValue(String val) {
            for (XkXklb status : XkXklb.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + XkXklb.class.getName() + "'");
        }
    }
    /**
     * 获取许可审批类别列表
     * @return
     */
    public static List<DoublePublicityField.XkXklb> getXkXklbList(){
        return Arrays.asList(DoublePublicityField.XkXklb.NORMAL, DoublePublicityField.XkXklb.FRANCHISE, DoublePublicityField.XkXklb.ACCEPTABLE
                , DoublePublicityField.XkXklb.APPROVAL, DoublePublicityField.XkXklb.REGISTERED, DoublePublicityField.XkXklb.OTHERS);
    }
    /**
     *     处罚类别1
     */
    public enum CfCflb {
        WARING("0", "警告"), FINE("1", "罚款"), CONFISCATE("2", "没收违法所得、没收非法财物"), STOP("3", "责令停产停业"), REVOKE("4", "暂扣或者吊销许可证、暂扣或者吊销执照")
        , DETENTION("5", "行政拘留"), OTHERS("6", "其他（见处罚类别2）");

        private String value;
        private String showText;

        private CfCflb(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static CfCflb getByValue(String val) {
            for (CfCflb status : CfCflb.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + CfCflb.class.getName() + "'");
        }
    }
    /**
     * 获取处罚类别1列表
     * @return
     */
    public static List<DoublePublicityField.CfCflb> getCfCflbList(){
        return Arrays.asList(DoublePublicityField.CfCflb.WARING, DoublePublicityField.CfCflb.FINE, DoublePublicityField.CfCflb.CONFISCATE
                , DoublePublicityField.CfCflb.STOP, DoublePublicityField.CfCflb.REVOKE, DoublePublicityField.CfCflb.DETENTION, DoublePublicityField.CfCflb.OTHERS);
    }

    /**
     *许可状态
     */
    public enum XkZt {
        VALID("1", "有效"), INVALID("2", "无效");

        private String value;
        private String showText;

        private XkZt(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static XkZt getByValue(String val) {
            for (XkZt status : XkZt.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + XkZt.class.getName() + "'");
        }
    }

    /**
     * 获取当前状态列表
     * @return
     */
    public static List<DoublePublicityField.XkZt> getXkZtList(){
        return Arrays.asList(DoublePublicityField.XkZt.VALID, XkZt.INVALID);
    }

    /**
     *    公开范围
     */
    public enum GkFw {
        PUBLIC("1", "社会公开"), SHARE("2", "政务共享"), QUERY("3", "授权查询");

        private String value;
        private String showText;

        private GkFw(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static GkFw getByValue(String val) {
            for (GkFw status : GkFw.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + GkFw.class.getName() + "'");
        }
    }

    /**
     * 获取公开范围列表
     * @return
     */
    public static List<DoublePublicityField.GkFw> getGkFwList(){
        return Arrays.asList(DoublePublicityField.GkFw.PUBLIC, DoublePublicityField.GkFw.SHARE, DoublePublicityField.GkFw.QUERY);
    }

    /**
     *    证件类型
     */
    public enum Zjlx {
        IDCARD("1", "身份证"),PASSPORTNO("2", "护照号"), INLANDPASS("3", "港澳居民来往内地通行证"),
        TRAVELPASSESFORTAIWAN("4", "台湾居民来往大陆通行证"), PERMANENTRESIDENCECARD("5", "外国人永久居留身份证中对应的证件类型");

        private String value;
        private String showText;

        private Zjlx(String val, String showText) {
            this.value = val;
            this.showText = showText;
        }

        public String getValue() {
            return this.value;
        }

        public String getShowText() {
            return this.showText;
        }

        public static Zjlx getByValue(String val) {
            for (Zjlx status : Zjlx.values()) {
                if (status.getValue() == val) {
                    return status;
                }
            }
            throw new IllegalArgumentException("unknown value '" + val + "' in enum '" + GkFw.class.getName() + "'");
        }
    }

    /**
     * 获取证件类型列表
     * @return
     */
    public static List<DoublePublicityField.Zjlx> getZjlxList(){
        return Arrays.asList(Zjlx.IDCARD, Zjlx.PASSPORTNO, Zjlx.INLANDPASS,
                Zjlx.TRAVELPASSESFORTAIWAN, Zjlx.PERMANENTRESIDENCECARD);
    }

    //endregion

}
