package com.ttyc.spring.chapter6.i18n.basics;

import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author jaynnay
 * @createTime 2018/9/26 23:54
 * @description resource文件必须转为Unicode，IDEA可以设置自动native2ascii
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        // 中文
        ResourceBundle bundle = ResourceBundle.getBundle("chapter6/i18n/resource",Locale.CHINA);
        String name = bundle.getString("name");
        Assert.isTrue(name.equals("紫夜"),"error name");

        // 英文
        ResourceBundle us = ResourceBundle.getBundle("chapter6/i18n/resource",Locale.US);
        String enName = us.getString("name");
        Assert.isTrue(enName.equals("jay"),"error name");

        // pattern
        Object[] param = {"紫夜", new Date(),1650};
        String pattern = us.getString("pattern");
        MessageFormat format = new MessageFormat(pattern);
        String ret = format.format(param);
        System.out.println(ret);

        pattern = bundle.getString("pattern");
        format = new MessageFormat(pattern);
        ret = format.format(param);
        System.out.println(ret);
    }
}
