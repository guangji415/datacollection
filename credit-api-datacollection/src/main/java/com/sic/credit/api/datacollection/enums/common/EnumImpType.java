package com.sic.credit.api.datacollection.enums.common;

import java.io.Serializable;

/**
 * [添加说明]
 * <br>@author : sunhw
 * <br>@date : 17-4-5 下午7:16
 * <br>@version : 1.0
 */
public enum EnumImpType implements Serializable {
    FORM(0,"表单填报"),
    WEBSERVICE(1,"接口调用"),
    DB(2,"数据库自动交换"),
    EXCEL(3,"Excel上报");

    public static String valueOf(int value){
        String strReturn = "";
        switch (value){
            case 0:
                strReturn = EnumImpType.FORM.getName();
                break;
            case 1:
                strReturn = EnumImpType.WEBSERVICE.getName();
                break;
            case 2:
                strReturn = EnumImpType.DB.getName();
                break;
            case 3:
                strReturn = EnumImpType.EXCEL.getName();
                break;
        }
        return strReturn;
    }

    private int _value;
    private String _name;

    private EnumImpType(int value, String name){
        _value=value;
        _name=name;
    }

    public int getValue(){
        return _value;
    }

    public String getName(){
        return _name;
    }
}
