package com.ttyc.spring.chapter4.context.web;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class WebContextTest {
    public static void main(String[] args) {
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();

        WebApplicationContext webApplicationContext1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ServletContext servletContext1 = webApplicationContext1.getServletContext();
    }
}
