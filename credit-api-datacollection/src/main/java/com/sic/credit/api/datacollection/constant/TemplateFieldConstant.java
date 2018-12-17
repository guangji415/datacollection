package com.sic.credit.api.datacollection.constant;

import java.util.ArrayList;
import java.util.List;

public class TemplateFieldConstant {

    //region 法人、企业行政许可模板字段
    //获取许可list 与模板列字段对应
    public static List<String> getCompanyPermissionFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("xkXdrMc");
        excelField.add("xkXdrShxym");
        excelField.add("xkXdrGszc");
        excelField.add("xkXdrZzjg");
        excelField.add("xkXdrSwdj");
        excelField.add("xkXdrSydw");
        excelField.add("xkXdrShzz");
        excelField.add("xkFrdb");
        excelField.add("xkFrSfzh");
        excelField.add("xkXkws");
        excelField.add("xkWsh");
        excelField.add("xkXklbText");
        excelField.add("xkXkzs");
        excelField.add("xkXkbh");
        excelField.add("xkNr");
        excelField.add("xkJdrq");
        excelField.add("xkYxqz");
        excelField.add("xkYxqzi");
        excelField.add("xkXkjg");
        excelField.add("xkXkjgdm");
        excelField.add("xkZt");
        excelField.add("xkLydw");
        excelField.add("xkLydwdm");
        excelField.add("bz");
        return excelField;
    }

    //获取许可中文list 与模板列字段对应
    public static List<String> getCompanyPermissionChineseFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("行政相对人名称");
        excelField.add("行政相对人代码_1 (统一社会信用代码)");
        excelField.add("行政相对人代码_2 (工商注册号)");
        excelField.add("行政相对人代码_3 (组织机构代码)");
        excelField.add("行政相对人代码_4 (税务登记号)");
        excelField.add("行政相对人代码_5 (事业单位证书号)");
        excelField.add("行政相对人代码_6 (社会组织登记证号)");
        excelField.add("法定代表人");
        excelField.add("法定代表人身份证号");
        excelField.add("行政许可决定文书名称");
        excelField.add("行政许可决定文书号");
        excelField.add("许可类别");
        excelField.add("许可证书名称");
        excelField.add("许可编号");
        excelField.add("许可内容");
        excelField.add("许可决定日期");
        excelField.add("有效期自");
        excelField.add("有效期至");
        excelField.add("许可机关");
        excelField.add("许可机关统一社会信用代码");
        excelField.add("当前状态");
        excelField.add("数据来源单位");
        excelField.add("数据来源单位统一社会信用代码");
        excelField.add("备注");
        return excelField;
    }
    //endregion

    //region 自然人行政许可模板字段
    //获取许可list 与模板列字段对应
    public static List<String> getNaturalPersonPermissionFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("xkXdrMc");
        excelField.add("xkXdrZjlxText");
        excelField.add("xkXdrZjhm");
        excelField.add("xkXkws");
        excelField.add("xkWsh");
        excelField.add("xkXklbText");
        excelField.add("xkXkzs");
        excelField.add("xkXkbh");
        excelField.add("xkNr");
        excelField.add("xkJdrq");
        excelField.add("xkYxqz");
        excelField.add("xkYxqzi");
        excelField.add("xkXkjg");
        excelField.add("xkXkjgdm");
        excelField.add("xkZt");
        excelField.add("xkLydw");
        excelField.add("xkLydwdm");
        excelField.add("bz");
        return excelField;
    }

    //获取许可中文list 与模板列字段对应
    public static List<String> getNaturalPersonPermissionChineseFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("行政相对人名称");
        excelField.add("证件类型");
        excelField.add("证件号码");
        excelField.add("行政许可决定文书名称");
        excelField.add("行政许可决定文书号");
        excelField.add("许可类别");
        excelField.add("许可证书名称");
        excelField.add("许可编号");
        excelField.add("许可内容");
        excelField.add("许可决定日期");
        excelField.add("有效期自");
        excelField.add("有效期至");
        excelField.add("许可机关");
        excelField.add("许可机关统一社会信用代码");
        excelField.add("当前状态");
        excelField.add("数据来源单位");
        excelField.add("数据来源单位统一社会信用代码");
        excelField.add("备注");
        return excelField;
    }
    //endregion

    //region 法人、企业行政处罚模板字段
    //获取处罚list 与模板列字段对应
    public static List<String> getCompanyPenaltyFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("cfXdrMc");
        excelField.add("cfXdrShxym");
        excelField.add("cfXdrGszc");
        excelField.add("cfXdrZzjg");
        excelField.add("cfXdrSwdj");
        excelField.add("cfXdrSydw");
        excelField.add("cfXdrShzz");
        excelField.add("cfFrdb");
        excelField.add("cfFrSfzh");
        excelField.add("cfWsh");
        excelField.add("cfWfxw");
        excelField.add("cfSy");
        excelField.add("cfYj");
        excelField.add("cfCflbText");
        excelField.add("cfNr");
        excelField.add("cfNrFk");
        excelField.add("cfNrWfff");
        excelField.add("cfNrZkdx");
        excelField.add("cfJdrq");
        excelField.add("cfYxq");
        excelField.add("cfGsjzq");
        excelField.add("cfCfjg");
        excelField.add("cfCfjgdm");
        excelField.add("cfSjly");
        excelField.add("cfSjlydm");
        excelField.add("bz");
        return excelField;
    }

    //获取处罚中文list 与模板列字段对应
    public static List<String> getCompanyPenaltyChineseFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("行政相对人名称");
        excelField.add("行政相对人代码_1 (统一社会信用代码)");
        excelField.add("行政相对人代码_2 (工商注册号)");
        excelField.add("行政相对人代码_3 (组织机构代码)");
        excelField.add("行政相对人代码_4 (税务登记号)");
        excelField.add("行政相对人代码_5 (事业单位证书号)");
        excelField.add("行政相对人代码_6 (社会组织登记证号)");
        excelField.add("法定代表人");
        excelField.add("法定代表人身份证号");
        excelField.add("行政处罚决定书文号");
        excelField.add("违法行为类型");
        excelField.add("违法事实");
        excelField.add("处罚依据");
        excelField.add("处罚类别");
        excelField.add("处罚内容");
        excelField.add("罚款金额 (万元)");
        excelField.add("没收违法所得、没收非法财物的金额 (万元)");
        excelField.add("暂扣或吊销证照名称及编号");
        excelField.add("处罚决定日期");
        excelField.add("处罚有效期");
        excelField.add("公示截止期");
        excelField.add("处罚机关");
        excelField.add("处罚机关统一社会信用代码");
        excelField.add("数据来源单位");
        excelField.add("数据来源单位统一社会信用代码");
        excelField.add("备注");
        return excelField;
    }
    //endregion

    //region 自然人行政处罚模板字段
    //获取处罚list 与模板列字段对应
    public static List<String> getNaturalPersonPenaltyFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("cfXdrMc");
        excelField.add("cfXdrZjlxText");
        excelField.add("cfXdrZjhm");
        excelField.add("cfWsh");
        excelField.add("cfWfxw");
        excelField.add("cfSy");
        excelField.add("cfYj");
        excelField.add("cfCflbText");
        excelField.add("cfNr");
        excelField.add("cfNrFk");
        excelField.add("cfNrWfff");
        excelField.add("cfNrZkdx");
        excelField.add("cfJdrq");
        excelField.add("cfYxq");
        excelField.add("cfGsjzq");
        excelField.add("cfCfjg");
        excelField.add("cfCfjgdm");
        excelField.add("cfSjly");
        excelField.add("cfSjlydm");
        excelField.add("bz");
        return excelField;
    }

    //获取处罚中文list 与模板列字段对应
    public static List<String> getNaturalPersonPenaltyChineseFieldList(){
        List<String> excelField = new ArrayList<String>();
        excelField.add("行政相对人名称");
        excelField.add("证件类型");
        excelField.add("证件号码");
        excelField.add("行政处罚决定书文号");
        excelField.add("违法行为类型");
        excelField.add("违法事实");
        excelField.add("处罚依据");
        excelField.add("处罚类别");
        excelField.add("处罚内容");
        excelField.add("罚款金额 (万元)");
        excelField.add("没收违法所得、没收非法财物的金额 (万元)");
        excelField.add("暂扣或吊销证照名称及编号");
        excelField.add("处罚决定日期");
        excelField.add("处罚有效期");
        excelField.add("公示截止期");
        excelField.add("处罚机关");
        excelField.add("处罚机关统一社会信用代码");
        excelField.add("数据来源单位");
        excelField.add("数据来源单位统一社会信用代码");
        excelField.add("备注");
        return excelField;
    }
    //endregion
}