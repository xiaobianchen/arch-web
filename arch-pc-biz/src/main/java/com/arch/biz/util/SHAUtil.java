package com.arch.biz.util;


import com.arch.biz.exception.ApplicationException;
import lombok.extern.log4j.Log4j;

import java.security.MessageDigest;

/**
 * Created by chenxiaobian on 16/7/1.
 * 对明文密码进行sha算法加密
 */
@Log4j
public class SHAUtil {

    public static String shaEncode(String inStr) throws Exception {

        MessageDigest sha;
        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (Exception e) {
            log.error("加密失败", e);
            throw new ApplicationException("亲,系统内部异常,请联系技术人员", e);
        }
        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = sha.digest(byteArray);
        StringBuilder hexValue = new StringBuilder();
        for (byte md5Byte : md5Bytes) {
            int val = ((int) md5Byte) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
