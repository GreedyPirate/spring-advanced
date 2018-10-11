package com.ttyc.spring.chapter6.properties.encrypt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.DigestUtils;

@Slf4j
public class EncryptPlaceHolder extends PropertyPlaceholderConfigurer {

    public static final String SENSITIVE_PASSWORD = "password";

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.contains(SENSITIVE_PASSWORD)){
            propertyValue = DigestUtils.md5DigestAsHex(propertyValue.getBytes());
        }
        // 父类返回的就是原始值
        return propertyValue;
    }
}
