package com.sic.credit.datacollection.service;


import com.sic.common.service.IService;
import com.sic.credit.api.datacollection.domain.common.XzzfXzxkFr;

/**
 * <p>
 * 行政许可信息表(法人) 服务类
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-13
 */
public interface IXzzfXzxkFrService extends IService<XzzfXzxkFr> {

    XzzfXzxkFr getDetail(String id);

}
