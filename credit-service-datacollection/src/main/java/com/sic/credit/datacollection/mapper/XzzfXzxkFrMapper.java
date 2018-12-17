package com.sic.credit.datacollection.mapper;

import com.sic.credit.api.datacollection.domain.common.XzzfXzxkFr;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>
 * 行政许可信息表(法人) Mapper 接口
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-13
 */
public interface XzzfXzxkFrMapper extends Mapper<XzzfXzxkFr> {

    XzzfXzxkFr getDetail(String id);

}
