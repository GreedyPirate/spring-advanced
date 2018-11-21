package com.ttyc.spring.chapter6.i18n.basics;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class FormatTest {
    public static void main(String[] args) {
        Locale china = Locale.getDefault();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(china);
        String money = numberFormat.format(15000141);
        System.out.println(money);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, china);
        System.out.println(dateFormat.format(new Date()));

        String pattern = "我的名字是{0}, 现在是{1,time,short}, 我的房租是{2}元";
        Object[] param = {"紫夜", new Date(), 1650};
        MessageFormat messageFormat = new MessageFormat(pattern, Locale.CHINA);
        String result = messageFormat.format(param);
        System.out.println(result);
    }
}
