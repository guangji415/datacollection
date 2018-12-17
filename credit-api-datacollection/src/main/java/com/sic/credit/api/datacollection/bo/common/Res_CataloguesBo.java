package com.sic.credit.api.datacollection.bo.common;

import com.sic.credit.api.datacollection.domain.common.Res_Catalogues;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 18-12-25 下午4:59
 * <br>@version : 1.0
 */
public class Res_CataloguesBo extends Res_Catalogues implements Serializable {

    public Res_CataloguesBo(){
        super();
    }

    private String publishDateStr;

    public String getPublishDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(this.getPublishDate()!=null){
            publishDateStr = sdf.format(this.getPublishDate());
        }else{
            publishDateStr="";
        }
        return publishDateStr;
    }

    private String subjectTypeText;

    public String getSubjectTypeText() {
        return subjectTypeText;
    }

    public void setSubjectTypeText(String subjectTypeText) {
        this.subjectTypeText = subjectTypeText;
    }
}
