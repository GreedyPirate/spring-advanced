package com.ttyc.spring.chapter4.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 对文件指定编码
 */
public class EncodedResourceTest {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("file/config.ini");
        EncodedResource encodedResource = new EncodedResource(resource,"UTF-8");
        InputStream inputStream = encodedResource.getInputStream();
    }
}
