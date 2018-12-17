package com.sic.credit.datacollection.service.impl;

import com.sic.common.service.plugins.pagination.Page;
import com.sic.credit.api.datacollection.domain.common.XzzfXzxkFr;
import com.sic.credit.datacollection.mapper.XzzfXzxkFrMapper;
import com.sic.credit.datacollection.service.IXzzfXzxkFrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 行政许可信息表(法人) 服务实现类
 * </p>
 *
 * @author gaoshp
 * @since 2018-12-13
 */
@Service
public class XzzfXzxkFrServiceImpl implements IXzzfXzxkFrService {

    @Resource
    private XzzfXzxkFrMapper mapper;

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity
     *            实体对象
     * @return boolean
     */
    @Override
    public boolean insert(XzzfXzxkFr entity){
        return mapper.insert(entity) > 0 ? true : false;
    }

    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id
     *            主键ID
     * @return boolean
     */
    @Override
    public boolean deleteById(Serializable id){
        return mapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }

    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity
     *            实体对象
     * @return boolean
     */
    @Override
    public boolean updateById(XzzfXzxkFr entity){
        return mapper.updateByPrimaryKey(entity) > 0 ? true : false;
    }


    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id
     *            主键ID
     * @return T
     */
    @Override
    public XzzfXzxkFr selectById(Serializable id){
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * <p>
     * 查询（根据 columnMap 条件）
     * </p>
     *
     * @param entity
     *            表字段 map 对象
     * @return List<T>
     */
    @Override
    public List<XzzfXzxkFr> selectByEntity(XzzfXzxkFr entity){
        return mapper.select(entity);
    }

    /**
     * <p>
     * 翻页查询
     * </p>
     *
     * @param page
     *            翻页对象
     * @param entity
     * @return
     */
    @Override
    public Page<XzzfXzxkFr> selectPage(Page<XzzfXzxkFr> page, XzzfXzxkFr entity){
        List<XzzfXzxkFr> test = mapper.selectByRowBounds(entity, page);
        page.setRecords(test);
        return page;
    }

    @Override
    public XzzfXzxkFr getDetail(String id){
        return mapper.getDetail(id);
    }
    

}
