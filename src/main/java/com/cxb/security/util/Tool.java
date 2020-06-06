package com.cxb.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Tool {
    /**
     *  数据库加密解密
     * @param args
     */
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePass = passwordEncoder.encode("123456");
        System.out.println(encodePass);
        boolean matches = passwordEncoder.matches("123456", encodePass);
        System.out.println(matches);
    }
}
