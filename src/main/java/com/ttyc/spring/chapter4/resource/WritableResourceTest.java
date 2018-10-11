package com.ttyc.spring.chapter4.resource;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.WritableResource;

import java.io.OutputStream;

public class WritableResourceTest {

    public static void main(String[] args) throws Exception {
        String path = "I:\\AllCodes\\springboot\\spring-advanced\\src\\main\\resources\\file\\config.ini";

        WritableResource resource = new PathResource(path);
        OutputStream outputStream = resource.getOutputStream();
        IOUtils.write("test WritableResource", outputStream, "UTF-8");
    }
}
