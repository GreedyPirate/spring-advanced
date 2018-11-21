package com.ttyc.spring.chapter4.resource.loader;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * 使用ant风格加载文件
 */
public class AntResourceLoaderTest {
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:file/*.*" );
        if (resources != null && resources.length > 0) {
            for (int i = 0; i < resources.length; i++) {
                Resource resource = resources[i];
                System.out.println(resource.getFilename());
            }
        }
    }
}
