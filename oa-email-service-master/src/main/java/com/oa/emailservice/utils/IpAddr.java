package com.oa.emailservice.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class IpAddr {

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-real-ip");
        Enumeration<String> headerNames = request.getHeaderNames();
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}