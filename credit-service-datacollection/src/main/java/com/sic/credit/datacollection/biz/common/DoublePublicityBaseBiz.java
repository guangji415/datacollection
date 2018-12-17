/**
 * sic-credit.cn Inc. * Copyright (c) 2009-2018 All Rights Reserved.
 */
package com.sic.credit.datacollection.biz.common;

import com.sic.common.service.plugins.pagination.Page;
import com.sic.credit.api.datacollection.domain.common.XzzfXzcfFr;
import com.sic.credit.api.datacollection.domain.common.XzzfXzcfZrr;

import java.util.List;

/**
 * @author shanpeng.gao gaoshanpeng@sic-credit.cn on 2018-12-17
 */
public interface DoublePublicityBaseBiz {

    //region 处罚对应的基本操作
    //新增 处罚法人
    boolean addXzzfXzcfFr(XzzfXzcfFr entity);
    //更新 处罚法人
    boolean updateXzzfXzcfFr(XzzfXzcfFr entity);
    //删除 处罚法人
    boolean deleteXzzfXzcfFr(String id);
    //非分页列表 处罚法人
    List<XzzfXzcfFr> selectXzzfXzcfFrList(XzzfXzcfFr entity);
    //分页列表 处罚法人
    Page<XzzfXzcfFr> selectXzzfXzcfFrPage(Page<XzzfXzcfFr> page, XzzfXzcfFr entity);

    //新增 处罚自然人
    boolean addXzzfXzcfZrr(XzzfXzcfZrr entity);
    //更新 处罚自然人
    boolean updateXzzfXzcfZrr(XzzfXzcfZrr entity);
    //删除 处罚自然人
    boolean deleteXzzfXzcfZrr(String id);
    //非分页列表 处罚自然人
    List<XzzfXzcfZrr> selecXzzfXzcfZrrList(XzzfXzcfZrr entity);
    //分页列表 处罚法人
    Page<XzzfXzcfZrr> selectXzzfXzcfZrrPage(Page<XzzfXzcfZrr> page, XzzfXzcfZrr entity);
    //endregion
}