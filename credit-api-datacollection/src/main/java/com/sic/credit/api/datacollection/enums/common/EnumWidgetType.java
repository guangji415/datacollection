package com.sic.credit.api.datacollection.enums.common;

import java.io.Serializable;

/**
 * [添加说明]
 * <br>@author : sunhw
 * <br>@date : 17-4-5 下午7:16
 * <br>@version : 1.0
 */
public enum EnumWidgetType implements Serializable {

    TEXTBOX(1,"文本框"),
    LABEL(0,"标签"),
    DROPDOWNLIST(2,"下拉框"),
    CHECKBOX(3,"复选框"),
    DATEPICKER(4,"日期选择框"),
    TEXTAREA(5,"大文本框");

    public static EnumWidgetType getEnumObject(int value){
        EnumWidgetType enumWidgetType = null;
        switch (value){
            case 0:
                enumWidgetType = EnumWidgetType.LABEL;
                break;
            case 1:
                enumWidgetType = EnumWidgetType.TEXTBOX;
                break;
            case 2:
                enumWidgetType = EnumWidgetType.DROPDOWNLIST;
                break;
            case 3:
                enumWidgetType = EnumWidgetType.CHECKBOX;
                break;
            case 4:
                enumWidgetType = EnumWidgetType.DATEPICKER;
                break;
            case 5:
                enumWidgetType = EnumWidgetType.TEXTAREA;
                break;
        }
        return enumWidgetType;
    }

    public static String valueOf(int value){
        String strReturn = "";
        switch (value){
            case 0:
                strReturn = EnumWidgetType.LABEL.getName();
                break;
            case 1:
                strReturn = EnumWidgetType.TEXTBOX.getName();
                break;
            case 2:
                strReturn = EnumWidgetType.DROPDOWNLIST.getName();
                break;
            case 3:
                strReturn = EnumWidgetType.CHECKBOX.getName();
                break;
            case 4:
                strReturn = EnumWidgetType.DATEPICKER.getName();
                break;
            case 5:
                strReturn = EnumWidgetType.TEXTAREA.getName();
                break;
        }
        return strReturn;
    }

    private int _value;
    private String _name;

    private EnumWidgetType(int value, String name){
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
