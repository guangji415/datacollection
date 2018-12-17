package com.sic.credit.api.datacollection.enums.common;

import java.io.Serializable;

/**
 * [添加说明]
 * <br>@author : sunhw
 * <br>@date : 17-4-5 下午7:16
 * <br>@version : 1.0
 */
public enum EnumStatusFlagType implements Serializable {
    DOING(0,"在编"),
    WAITING(1,"待审"),
    READY(2,"已审"),
    RETURN(3,"退回"),
    CHANGE(4,"变更申请");

    public static String valueOf(int value){
        String strReturn = "";
        switch (value){
            case 0:
                strReturn = EnumStatusFlagType.DOING.getName();
                break;
            case 1:
                strReturn = EnumStatusFlagType.WAITING.getName();
                break;
            case 2:
                strReturn = EnumStatusFlagType.READY.getName();
                break;
            case 3:
                strReturn = EnumStatusFlagType.RETURN.getName();
                break;
            case 4:
                strReturn = EnumStatusFlagType.CHANGE.getName();
                break;
        }
        return strReturn;
    }

    private int _value;
    private String _name;

    private EnumStatusFlagType(int value, String name){
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
