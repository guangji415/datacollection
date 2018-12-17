package com.sic.credit.datacollection.utils.common;

import com.sic.credit.api.datacollection.constant.DoublePublicityConstant;
import com.sic.credit.datacollection.constant.common.SystemConstant;
import com.sic.credit.datacollection.utils.common.cxf.CxfClientUtil;
import com.sic.credit.datacollection.utils.common.cxf.RequestEntity;
import com.sic.credit.datacollection.utils.common.cxf.ResponseEntity;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import javax.xml.namespace.QName;
import java.io.StringReader;
import java.security.Security;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 易天
 * Date: 18-7-17
 * Time: 下午2:19
 * To change this template use File | Settings | File Templates.
 */
public class ReportToCountryUtil {
    //日志
    private final Logger logger = LoggerFactory.getLogger(ReportToCountryUtil.class);

    public ReportToCountryUtil(){
        Properties systemProps = System.getProperties();
        String webServiceKey = SystemConstant.SGS_TRUSTSTORE_PATH;
        System.setProperty("javax.net.ssl.trustStore",webServiceKey);
        System.setProperty("javax.net.ssl.trustStore.Password",SystemConstant.SGS_TRUSTSTORE_PASSWORD);
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        System.setProperties(systemProps);
    }
    /**
     * 国家数据库相关操作 调用webservice，上报行政许可类数据
     * @param xmlValue
     * @return resultStr
     * @throws Exception
     */
    public String toImportPermission(String xmlValue) throws Exception{
        return invokeCxf(xmlValue,SystemConstant.SGS_PERMISSIONWEBSERVICE_WSDL,SystemConstant.SGS_METHODNAME_TOIMPORTPERMISSION);
    }

    /**
     * 国家数据库相关操作 调用webservice，取消上报行政许可类数据
     * @param xmlValue
     * @return resultStr
     * @throws Exception
     */
    public String toRemovePermission(String xmlValue) throws Exception{
        return invokeCxf(xmlValue,SystemConstant.SGS_PERMISSIONWEBSERVICE_WSDL,SystemConstant.SGS_METHODNAME_TOREMOVEPERMISSION);
    }

    /**
     * 国家数据库相关操作 调用webservice，上报行政处罚类数据
     * @param xmlValue
     * @return resultStr
     * @throws Exception
     */
    public String toImportPenaly( String xmlValue) throws Exception{
        return invokeCxf(xmlValue,SystemConstant.SGS_PENALTYWEBSERVICE_WSDL,SystemConstant.SGS_METHODNAME_TOIMPORTPENALY);
    }

    /**
     * 国家数据库相关操作 调用webservice，取消上报行政处罚类数据
     * @param xmlValue
     * @return resultStr
     * @throws Exception
     */
    public String toRemovePenaly(String xmlValue) throws Exception{
        return invokeCxf(xmlValue,SystemConstant.SGS_PENALTYWEBSERVICE_WSDL,SystemConstant.SGS_METHODNAME_TOREMOVEPENALY);
    }

    /**
     * cxf调用统一配置方法
     * @param xmlValue,wsdlUrl,functionName
     * @return resultStr
     * @throws Exception
     */
    public String invokeCxf(String xmlValue,String wsdlUrl,String functionName) throws Exception{
        String token = SystemConstant.SGS_TOKEN;
        Object[] params = new Object[] { token, xmlValue };
        QName qname = new QName(SystemConstant.SGS_NAMESPACE, functionName);
        CxfClientUtil<RequestEntity, ResponseEntity> cxf = new CxfClientUtil<RequestEntity, ResponseEntity>();
        logger.info(MessageFormat.format("invokeCxf 发送:{0},{1}", qname, params));
        logger.info(MessageFormat.format("invokeCxf 发送:{0}",wsdlUrl));
        String resultStr = cxf.sendAndGetString(qname, params, wsdlUrl);
        logger.info(MessageFormat.format("invokeCxf 接收:{0}",resultStr));
        return resultStr;
    }

    /**
     * 解析xml返回maplist
     * @param xmlValue
     * @param mapList
     * @return
     */
    public boolean analyzeImportReturnXml(String xmlValue, List<Map<String, String>> mapList){
        boolean isSucc = false;
        try {
            // 创建一个新的字符串
            StringReader read = new StringReader(xmlValue);
            // 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
            InputSource source = new InputSource(read);
            SAXReader reader = new SAXReader();
            Document document = reader.read(source);
            // 获取文档的根节点
            Element root = document.getRootElement();
            Element rowElement = root.element("row");
            String code = "";
            for (Iterator it = rowElement.elementIterator(); it.hasNext();) {
                Element element = (Element) it.next();
                if (element.getName().equals("code")) {
                    code = element.getStringValue();
                } else if (element.getName().equals("line")) {
                    isSucc = false;
                    // 判断这条记录是否出错
                    // 若存在错误则返回line节点，否则返回的为ids节点
                    for (int j = 0; j < mapList.size(); j++) {
                        if(element.getStringValue().equals("0")){//上报xml解析错误 所有数据都置为已上报状态
                            Map<String, String> errorMap = mapList.get(j);
                            errorMap.put("govId", DoublePublicityConstant.REPORT_TO_COUNTRY_VALUE);
                            errorMap.put("isSucc", DoublePublicityConstant.ISFAIL);
                            errorMap.put("flag", DoublePublicityConstant.ISREPORTCOUNTRY);
                        }else{ //错误信息进行添加到map 只有一条错误数据信息返回
                            if (element.getStringValue().equals(String.valueOf(j + 1))) {
                                Map<String, String> errorMap = new HashMap<String, String>();
                                errorMap.put("id", mapList.get(j).get("id"));
                                errorMap.put("govId", DoublePublicityConstant.REPORT_TO_COUNTRY_VALUE);
                                errorMap.put("isSucc", DoublePublicityConstant.ISFAIL);
                                errorMap.put("flag", DoublePublicityConstant.ISREPORTCOUNTRY);
                                errorMap.put("reportNote", code);
                                //清空list 将唯一的一条错误信息放入list中 用于更新数据库 其他条件下所有数据都更新
                                mapList.clear();
                                mapList.add(errorMap);
                            }
                        }
                    }
                } else if (element.getName().equals("ids")) {//数据上报成功
                    isSucc = true;
                    int j = 0;
                    for (Iterator it2 = element.elementIterator(); it2.hasNext();) {
                        Map<String, String> successMap = mapList.get(j);
                        successMap.put("govId", ((Element) it2.next()).getStringValue());
                        successMap.put("isSucc", DoublePublicityConstant.ISSUCCESS);
                        successMap.put("flag", DoublePublicityConstant.ISREPORTCOUNTRY);
                        successMap.put("reportNote", code);
                        j++;
                    }
                }
            }
        } catch (DocumentException e) {
            isSucc = false;
            e.printStackTrace();
        }
        return isSucc;
    }

    /**
     * 解析xml判断是否成功
     * @param xmlValue
     * @return
     */
    public boolean analyzeRemoveReturnXml(String xmlValue){
        boolean isSucc = false;
        try {
            // 创建一个新的字符串
            StringReader read = new StringReader(xmlValue);
            // 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
            InputSource source = new InputSource(read);
            SAXReader reader = new SAXReader();
            Document document = reader.read(source);
            // 获取文档的根节点
            Element root = document.getRootElement();
            Element rowElement = root.element("row");
            for (Iterator it = rowElement.elementIterator(); it.hasNext();) {
                Element element = (Element) it.next();
                if (element.getName().equals("code")) {
                    if(element.getStringValue().equals("00"))
                        isSucc = true;
                    break;
                }
            }
        } catch (DocumentException e) {
            isSucc = false;
            e.printStackTrace();
        }
        return isSucc;
    }
}

