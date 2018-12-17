package com.sic.credit.datacollection.utils.common.cxf;

import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
public class CxfClientFactory {
    private CxfClientFactory() {}
    private static DynamicClientFactory clientFactory = null;
    public static DynamicClientFactory getInstance() {
        if (clientFactory == null) {
            clientFactory = DynamicClientFactory.newInstance();
        }
        return clientFactory;
    }
}