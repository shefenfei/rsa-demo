package com.example.rsademo;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Base64Utils {
    /** *//**
     * 文件读取缓冲区大小
     */
    private static final int CACHE_SIZE = 1024;

    /** *//**
     * <p>
     * BASE64字符串解码为二进制数据
     * </p>
     *
     * @param base64
     * @return
     * @throws Exception
     */
    public static byte[] decode(String base64) throws Exception {
//        return Base64.decode(base64);
        return org.springframework.util.Base64Utils.decode(base64.getBytes(StandardCharsets.UTF_8));
//        return Base64.decode(base64);
    }

    /** *//**
     * <p>
     * 二进制数据编码为BASE64字符串
     * </p>
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String encode(byte[] bytes) throws Exception {
//        return new String(Base64.encode(bytes));
        byte[] encode = org.springframework.util.Base64Utils.encode(bytes);
        return new String(encode);
    }

}
