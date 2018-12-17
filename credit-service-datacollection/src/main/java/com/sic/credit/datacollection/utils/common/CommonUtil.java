package com.sic.credit.datacollection.utils.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sic.common.util.context.PageBean;
import com.sic.common.web.context.ReadAblePropertyPlaceholderConfigurer;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * [添加说明]
 * <br>@author : licheng
 * <br>@date : 17-2-22 下午4:01
 * <br>@version : 1.0
 */
public class CommonUtil {

    //region 通用工具类(该类为通用类，修改后会影响所有引用类，慎重修改)

    //region 判断对象是否不为空
    public static boolean isNotEmpty(Object obj) {
        if (CommonUtil.isEmpty(obj)) {
            return false;
        }
        return true;
    }
    //endregion

    //region 判断对象是否为空
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof String) {
            if (StringUtils.isBlank(obj.toString())) {
                return true;
            }
        } else if (obj instanceof Collection) {
            if (((Collection) obj).isEmpty()) {
                return true;
            }
        } else if (obj instanceof Map) {
            if (((Map) obj).isEmpty()) {
                return true;
            }
        }
        return false;
    }
    //endregion

    //region 获取Json对象
    public static JSONObject getJsonObject(String jsonParams) {
        JSONObject jsonObj = new JSONObject();
        if (CommonUtil.isNotEmpty(jsonParams)) {
            try {
                jsonObj = JSON.parseObject(jsonParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonObj;
    }
    //endregion

    //region 获取Json数组
    public static JSONArray getJsonArray(String jsonParams) {
        JSONArray jsonArray = null;
        if (CommonUtil.isNotEmpty(jsonParams)) {
            try {
                jsonArray = JSON.parseArray(jsonParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonArray;
    }
    //endregion

    //region获取Json对象中指定key的字符串value
    public static String getJsonStringValue(JSONObject jsonObj, String key) {
        String value = StringUtils.EMPTY;
        try {
            if (jsonObj.containsKey(key)) {
                value = jsonObj.getString(key);
            }
        } catch (Exception e) {

        }
        return value;
    }
    //endregion

    //region 获取ip访问过滤器开关状态值
    public static String getIpAccessFilterSwitch() {
        return (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("filter.ipaccessfilter.switch");
    }
    //endregion

    //region 获取允许访问的ip串
    public static String getIpAccessFilterIpAddress() {
        return (String) ReadAblePropertyPlaceholderConfigurer.getContextProperty("filter.ipaccessfilter.ipaddress");
    }
    //endregion

    //endregion


    //region json转map 无分页情况
    /**
     * 将json格式的字符串解析成Map对象 <li>
     * json格式：{"name":"admin","retries":"3fff","testname"
     * :"ddd","testretries":"fffffffff"}
     */
    public static HashMap<String, String> jsonToHashMap(String object)
    {
        HashMap<String, String> data = new HashMap<String, String>();
        if(!StringUtils.isEmpty(object)){
            // 将json字符串转换成jsonObject
            JSONObject jsonObject = JSONObject.parseObject(object);
            Set<String> set = jsonObject.keySet();
            Iterator<String> it = set.iterator();
            // 遍历jsonObject数据，添加到Map对象
            while (it.hasNext())
            {
                String key = String.valueOf(it.next());
                String value = (String) jsonObject.get(key);
                data.put(key, value);
            }
        }
        return data;
    }
    //endregion

    //region json转map 有分页情况
    /**
     * 将json格式的字符串解析成Map对象 <li>
     * json格式：{"name":"admin","retries":"3fff","testname"
     * :"ddd","testretries":"fffffffff"}
     */
    public static HashMap<String, String> jsonToHashMap(String object, PageBean<Map<String, Object>> pageParams)
    {
        HashMap<String, String> data = new HashMap<String, String>();
        // 将json字符串转换成jsonObject
        JSONObject jsonObject = JSONObject.parseObject(object);
        Set<String> set = jsonObject.keySet();
        Iterator<String> it = set.iterator();
        // 遍历jsonObject数据，添加到Map对象
        int pageNum = 0, pageSize = 0;
        String sidx = "", sord = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (it.hasNext())
        {
            String key = String.valueOf(it.next());
            String value = null;
            if(jsonObject.get(key) instanceof Integer){
                value = jsonObject.get(key).toString();
            }else{
                value = (String) jsonObject.get(key);
            }
            if(key.equals("pageNum")){
                pageNum = Integer.parseInt(value);
            }else if(key.equals("pageSize")){
                pageSize = Integer.parseInt(value);
            }else if(key.equals("sidx")){
                sidx = value;
            }else if(key.equals("sord")){
                sord = value;
            }else{
                data.put(key, value);
            }
        }
        if(pageNum > 0 && pageSize > 0){
            pageParams.setPage(pageNum);
            pageParams.setPageSize(pageSize);
            if(!StringUtils.isEmpty(sidx) && !StringUtils.isEmpty(sord)){
                linkedHashMap.put(sidx, sord);
                pageParams.setSortItemMap(linkedHashMap);
            }
            return data;
        }else{
            return null;
        }
    }

    /**
     * 去掉NULL的值替换为“”
     *
     * @param value
     * @return
     */
    public static String removeNull(Object value) {
        return (value == null) ? "" : value.toString();
    }
    //endregion
}
