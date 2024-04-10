package com.counter.basic.counterapp.utils;

import jakarta.servlet.http.HttpServletRequest;

public class UserUtils {
    public static String getUserIp(HttpServletRequest httpServletRequest){
        String userIp = httpServletRequest.getHeader("X-Forwarded-For");
        if (userIp == null || userIp.isEmpty()) {
            userIp = httpServletRequest.getRemoteAddr();
        }
        return userIp;
    }
}
