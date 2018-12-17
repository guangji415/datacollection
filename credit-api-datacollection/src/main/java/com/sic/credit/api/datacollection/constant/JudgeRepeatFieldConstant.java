package com.sic.credit.api.datacollection.constant;

public class JudgeRepeatFieldConstant {

    //region 非自然人 法人
    //行政许可判断数据库中重复的标准
    public static String getCompanyPermissionRepeatJson(String xkWsh, String xkXdr, String id, String deleteFlag){
        String jsonParams = String.format("{\"xkWsh\":\"%1$s\",\"xkXdrMc\":\"%2$s\",\"id\":\"%3$s\"" +
                ",\"deleteFlag\":\"%4$s\"}", xkWsh, xkXdr, id, deleteFlag);
        return jsonParams;
    }
    //行政处罚判断数据库中重复的标准
    public static String getCompanyPenaltyRepeatJson(String cfWsh, String cfXdrMc, String id, String deleteFlag){
        String jsonParams = String.format("{\"cfWsh\":\"%1$s\",\"cfXdrMc\":\"%2$s\",\"id\":\"%3$s\"" +
                ",\"deleteFlag\":\"%4$s\"}", cfWsh, cfXdrMc, id, deleteFlag);
        return jsonParams;
    }
    //endregion

    //region 自然人
    //行政许可判断数据库中重复的标准
    public static String getNaturalPersonPermissionRepeatJson(String xkWsh, String xkXdr, String id, String deleteFlag){
        String jsonParams = String.format("{\"xkWsh\":\"%1$s\",\"xkXdrMc\":\"%2$s\",\"id\":\"%3$s\"" +
                ",\"deleteFlag\":\"%4$s\"}", xkWsh, xkXdr, id, deleteFlag);
        return jsonParams;
    }
    //行政处罚判断数据库中重复的标准
    public static String getNaturalPersonPenaltyRepeatJson(String cfWsh, String cfXdrMc, String id, String deleteFlag){
        String jsonParams = String.format("{\"cfWsh\":\"%1$s\",\"cfXdrMc\":\"%2$s\",\"id\":\"%3$s\"" +
                ",\"deleteFlag\":\"%4$s\"}", cfWsh, cfXdrMc, id, deleteFlag);
        return jsonParams;
    }
    //endregion

}