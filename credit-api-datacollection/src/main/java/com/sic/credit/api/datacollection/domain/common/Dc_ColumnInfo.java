package com.sic.credit.api.datacollection.domain.common;

import com.sic.credit.api.datacollection.enums.common.EnumWidgetType;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Lic
 * Date: 17-7-15
 * Time: 下午6:27
 * To change this template use File | Settings | File Templates.
 */
public class Dc_ColumnInfo implements Serializable {

    private String id;
    private String tableId;
    private String enName;
    private String cnName;
    private String fieldType;
    private String fieldLength;
    private Integer formField;
    private Integer jqGridField;
    private Integer pkField;
    private Integer widgetType;
    private String widgetTypeText;
    private String dicId;
    private Integer requiredField;
    private String checkExpession;
    private Integer orderIndex;
    private String bz;
    private Integer yn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    public Integer getFormField() {
        return formField;
    }

    public void setFormField(Integer formField) {
        this.formField = formField;
    }

    public Integer getJqGridField() {
        return jqGridField;
    }

    public void setJqGridField(Integer jqGridField) {
        this.jqGridField = jqGridField;
    }

    public Integer getPkField() {
        return pkField;
    }

    public void setPkField(Integer pkField) {
        this.pkField = pkField;
    }

    public Integer getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(Integer widgetType) {
        this.widgetType = widgetType;
    }

    public String getWidgetTypeText() {
        return EnumWidgetType.valueOf(this.getWidgetType());
    }

    public String getDicId() {
        return dicId;
    }

    public void setDicId(String dicId) {
        this.dicId = dicId;
    }

    public Integer getRequiredField() {
        return requiredField;
    }

    public void setRequiredField(Integer requiredField) {
        this.requiredField = requiredField;
    }

    public String getCheckExpession() {
        return checkExpession;
    }

    public void setCheckExpession(String checkExpession) {
        this.checkExpession = checkExpession;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}
