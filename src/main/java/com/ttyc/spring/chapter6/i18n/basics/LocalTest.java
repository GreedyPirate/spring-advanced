package com.ttyc.spring.chapter6.i18n.basics;

import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        //-Duser.language=en -Duser.region=US
        Locale china = Locale.getDefault();
        String country = china.getCountry();
        String language = china.getLanguage();
        System.out.println("here is " + country + ", we speak " + language);
    }
}
