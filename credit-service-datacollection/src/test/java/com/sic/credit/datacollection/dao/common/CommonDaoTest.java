package com.sic.credit.datacollection.dao.common;


import com.sic.common.service.plugins.pagination.Page;
import com.sic.credit.api.datacollection.domain.common.XzzfXzxkFr;
import com.sic.credit.datacollection.service.IXzzfXzxkFrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * [添加说明]
 * <br>@author : sanGe
 * <br>@date : 18-2-22 下午3:14
 * <br>@version : 1.0
 */
@ContextConfiguration(locations = {"classpath*:META-INF/spring/spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonDaoTest {

    //region 类实例
    @Resource
    private IXzzfXzxkFrService service;

    @Test
    public void getResCatalogByCatalogNameAndOrgIdTest(){
        XzzfXzxkFr test = service.selectById("1");
        XzzfXzxkFr test1 = service.getDetail("1");
        List<XzzfXzxkFr> list = service.selectByEntity(new XzzfXzxkFr());
        Page<XzzfXzxkFr> a = new Page<>(2, 2);
        service.selectPage(a, new XzzfXzxkFr());
        System.out.print("test");
    }

    @Test
    public void getSysGuidIdTest(){
        System.out.println("aaa");
    }
}
