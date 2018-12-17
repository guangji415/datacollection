package com.sic.credit.datacollection.utils.common.cxf;

import javax.xml.namespace.QName;

import com.sic.credit.datacollection.constant.common.SystemConstant;
import org.apache.commons.pool.KeyedObjectPool;
import org.apache.commons.pool.KeyedObjectPoolFactory;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.apache.commons.pool.impl.StackKeyedObjectPoolFactory;
import org.apache.cxf.endpoint.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CxfClientUtil<E extends RequestEntity,T extends ResponseEntity> {

    //日志
    private final Logger logger = LoggerFactory.getLogger(CxfClientUtil.class);

    //对象池
    private static KeyedObjectPool clientPool = null;

    static{
        KeyedPoolableObjectFactory factory = new CxfClientPool();
        KeyedObjectPoolFactory poolFactory = new StackKeyedObjectPoolFactory(factory, SystemConstant.CXFCLIENTPOOL_MAX);
        clientPool = poolFactory.createPool();
    }

    public String sendAndGetString(QName serviceName,Object[] params, String urlname) throws Exception{
        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象: {} ",  client.toString());
        Object[] resultArray = client.invoke(serviceName,params);
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        String resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        return resultStr;
    }


    /**
     * 发送信息并接收信息转化为实体对象返回
     * @param request  请求信息实体
     * @param clazz    返回信息实体类型
     * @return 返回信息实体
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public T sendAndGetEntity(final E request,Class<T> clazz,QName serviceName,final QName serviceOption, String urlname)throws Exception{

        //创建传进来实体的实例
        T entity = clazz.newInstance();
        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象: {} ",  client.toString());
        //xstream  转换工具
        final XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        xstream.alias("Response", clazz);

        logger.info("发送消息:{}" , xstream.toXML(request));
        Object[] resultArray = client.invoke(serviceOption, xstream.toXML(request));
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        String resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        logger.info("接收返回消息:{}" , resultStr);
        entity = (T)xstream.fromXML(resultStr);

        return entity;
    }


    /**
     * 发送信息并接收信息转化为JSON字符串返回
     * @param request  请求信息实体
     * @param clazz    返回信息实体类型
     * @return 返回信息JSON字符串
     */
    public String sendAndGetJson(E request,Class<T> clazz,QName serviceName,QName serviceOption, String urlname) throws Exception {
        String resultJson = null;
        //cxf 客户端工厂
        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象:{}" , client.toString());
        //xstream  转换工具
        XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        xstream.alias("Response", clazz);
        //xstream  转换工具 json
        XStream jsonxXstream = new XStream(new JsonHierarchicalStreamDriver());
        jsonxXstream.alias("Response", clazz);

        logger.info("发送消息:{}" , xstream.toXML(request));
        Object[] resultArray = client.invoke(serviceOption, xstream.toXML(request));
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        String resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        logger.info("接收返回消息:{}" , resultStr);

        ResponseEntity entity = (ResponseEntity) xstream.fromXML(resultStr);
        jsonxXstream.setMode(XStream.NO_REFERENCES);

        resultJson = jsonxXstream.toXML(entity);
        logger.info("返回Json字符串:{}" , resultJson);

        return resultJson;
    }

    /**
     * 发送信息并接收信息转化为实体对象返回
     * @param request  请求信息实体
     * @param clazz    返回信息实体类型
     * @return 返回信息实体
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public T sendAndGetEntityByObject(E request,Class<T> clazz,QName serviceName,QName serviceOption, String urlname) throws Exception{
        T entity = clazz.newInstance();

        //cxf 客户端工厂
        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象:{}" , client.toString());
        //xstream  转换工具
        XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        xstream.alias(request.getXmlRootnodename(), clazz);

        logger.info("发送消息:{}" , xstream.toXML(request));
        Object[] resultArray = client.invoke(serviceOption, request.getRequestObjects());
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        String resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        logger.info("接收返回消息:{}" , resultStr);

        entity = (T)xstream.fromXML(resultStr);

        return entity;
    }


    /**
     * 发送信息并接收信息转化为JSON字符串返回
     * @param request  请求信息实体
     * @param clazz    返回信息实体类型
     * @return 返回信息JSON字符串
     */
    public String sendAndGetJsonByObject(E request,Class<T> clazz,QName serviceName,QName serviceOption, String urlname) throws Exception {
        String resultJson = null;

        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象:{}" , client.toString());
        //xstream  转换工具
        XStream xstream = new XStream(new DomDriver());
        xstream.autodetectAnnotations(true);
        xstream.alias(request.getXmlRootnodename(), clazz);
        //xstream  转换工具 json
        XStream jsonxXstream = new XStream(new JsonHierarchicalStreamDriver());
        jsonxXstream.alias("Response", clazz);

        logger.info("发送消息:{}" , xstream.toXML(request));
        Object[] resultArray = client.invoke(serviceOption, request.getRequestObjects());
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        String resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        logger.info("接收返回消息:{}" , resultStr);

        ResponseEntity entity = (ResponseEntity) xstream.fromXML(resultStr);
        jsonxXstream.setMode(XStream.NO_REFERENCES);

        resultJson = jsonxXstream.toXML(entity);
        logger.info("返回Json字符串:{}" , resultJson);

        return resultJson;
    }

    /**
     * 发送信息并接收信息转化为String字符串返回
     * @param request    请求内容
     * @param serviceName
     * @param serviceOption
     * @param urlname    请求URL的地址
     * @return
     * @throws Exception
     */
    public String sendAndGetString(Object[] request,QName serviceName,QName serviceOption, String urlname, String methodName) throws Exception{
        String resultStr = null;

        logger.info("接口调用入口！");
        Client client = (Client) clientPool.borrowObject(urlname);
        logger.info("从clientPool获得client对象:{}" , client.toString());
        logger.info("发送消息:{}" , request.toString());
        Object[] resultArray = client.invoke(methodName, request);
        logger.info("接口调用结束！");
        clientPool.returnObject(urlname, client);
        logger.debug("向clientPool归还client对象:{}", client.toString());
        printClientPoolLog(clientPool);
        resultStr = resultArray != null && resultArray.length > 0 ? resultArray[0].toString() : "";
        logger.info("接收返回消息:{}" , resultStr);

        return resultStr;
    }


    private void printClientPoolLog(KeyedObjectPool clientPool){
        logger.info("clientPool信息:{} Active:{} Idle:{}",
                new Object[]{
                        clientPool.toString(),
                        String.valueOf(clientPool.getNumActive()),
                        String.valueOf(clientPool.getNumIdle())
                });
    }

}

