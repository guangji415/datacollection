package com.sic.credit.datacollection.utils.common.cxf;

import com.sic.credit.datacollection.constant.common.SystemConstant;
import org.apache.commons.pool.BaseKeyedPoolableObjectFactory;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
public class CxfClientPool extends BaseKeyedPoolableObjectFactory {
    //日志
    private final static Logger logger = Logger.getLogger(CxfClientPool.class);
    /**
     * 创建对象方法
     */
    public Object makeObject(Object key) throws Exception {
        if (key == null || !(key instanceof String) || "".equals(key)) {
            throw new RuntimeException("对象标示key为空！");
        }

        logger.info("创建一个新的对象的key:" + key);

        //cxf 客户端工厂
        DynamicClientFactory clientFactory = CxfClientFactory.getInstance();
        Client client = clientFactory.createClient(key.toString());

        //设置超时单位为毫秒
        HTTPConduit http = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(SystemConstant.CXFCLIENT_CONNECTIONTIMEOUT);  //连接超时
        httpClientPolicy.setAllowChunking(false);    //取消块编码
        httpClientPolicy.setReceiveTimeout(SystemConstant.CXFCLIENT_RECEIVETIMEOUT);     //响应超时
        http.setClient(httpClientPolicy);

        return client;
    }

    @Override
    public void activateObject(Object key, Object obj) throws Exception {
        super.activateObject(key, obj);
        logger.debug("激活对象");
    }

    @Override
    public void destroyObject(Object key, Object obj) throws Exception {
        super.destroyObject(key, obj);
        logger.debug("销毁对象");
    }

    @Override
    public void passivateObject(Object key, Object obj) throws Exception {
        super.passivateObject(key, obj);
        logger.debug("挂起对象");
    }

    @Override
    public boolean validateObject(Object key, Object obj) {
        logger.debug("验证对象");
        return super.validateObject(key, obj);

    }

}

