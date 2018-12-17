package com.sic.credit.datacollection.filter.common;

import com.sic.credit.datacollection.constant.common.CommonConstant;
import com.sic.credit.datacollection.utils.common.CommonUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * [添加说明]
 * <br>@author : licheng
 * <br>@date : 17-2-23 上午9:33
 * <br>@version : 1.0
 */
public class IpAccessFilter implements Filter {

    //region 变量
    String isSwitch = null;
    String[] ipAddressArr = null;
    //endregion

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        isSwitch = CommonUtil.getIpAccessFilterSwitch();
        String ipAddress = CommonUtil.getIpAccessFilterIpAddress();
        if (CommonUtil.isNotEmpty(ipAddress)) {
            ipAddressArr = ipAddress.split(",");
        }
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        boolean isPass = true;//默认为所有ip均可以访问
        if (CommonUtil.isNotEmpty(isSwitch) && CommonConstant.IP_ACCESS_FILTER_SWITCH_ON.equals(isSwitch)) {//开启ip过滤，只允许配置文件中的ip串可以访问
            isPass = false;
            if (CommonUtil.isEmpty(ipAddressArr)) {
                return;
            }
            String remoteIP = request.getRemoteAddr();
            for (String ip : ipAddressArr) {
                if (remoteIP.equals(ip)) {
                    isPass = true;
                    break;
                }
            }
        }
        if (isPass) {
            filterChain.doFilter(request, response);
        }
    }
    @Override
    public void destroy() {
    }
}
