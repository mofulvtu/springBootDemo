package com.lzg.springBootDemo;

/**
 * Desc:
 *
 * @author liuzg
 * @date 2017/10/28
 */
public class Test {

    public static void main(String[] args) throws Exception{
        final String str = "中国";

        byte[] bytes1 = str.getBytes("utf-8");
        byte[] bytes2 = str.getBytes("gbk");
        byte[] bytes3 = str.getBytes("iso-8859-1");

        System.out.println("字节长度：");
        System.out.println("UTF-8:     "+bytes1.length);
        System.out.println("gbk:       "+bytes2.length);
        System.out.println("iso-8859-1:"+bytes3.length);

        String str1 = new String(bytes1,"utf-8");
        String str2 = new String(bytes1,"gbk");
        String str3 = new String(bytes1,"iso-8859-1");

        System.out.println("还原：");
        System.out.println("以utf-8编码："+str1);
        System.out.println("以gbk编码："+str2);
        System.out.println("以iso-8859-1编码："+str3);
    }
}
