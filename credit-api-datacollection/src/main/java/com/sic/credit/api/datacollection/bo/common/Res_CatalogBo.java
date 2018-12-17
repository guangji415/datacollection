package com.sic.credit.api.datacollection.bo.common;

import com.sic.credit.api.datacollection.domain.common.Res_Catalog;
import com.sic.credit.api.datacollection.enums.common.EnumStatusFlagType;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 17-12-26 下午1:40
 * <br>@version : 1.0
 */
public class Res_CatalogBo extends Res_Catalog implements Serializable {

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

    private String statusFlagText;

    public String getStatusFlagText() {
        return EnumStatusFlagType.valueOf(this.getStatusFlag());
    }
}
