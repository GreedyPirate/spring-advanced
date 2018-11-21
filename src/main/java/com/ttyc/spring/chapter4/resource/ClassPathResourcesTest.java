package com.ttyc.spring.chapter4.resource;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.List;

/**
 * 打成jar包是，不要使用getFile,而是getInputStream
 */
@Slf4j
public class ClassPathResourcesTest {
    public static void main(String[] args) throws Exception {
        Resource file = new ClassPathResource("file/config.ini" );
        long length = file.contentLength();
        boolean exists = file.exists();
        String description = file.getDescription();
        String filename = file.getFilename();
        String path = ((ClassPathResource) file).getPath();
        String url = file.getURL().toString();

        log.info("file length is {}, file is exist? {}, desc is {}, file name is {}, path is {}, url is {}", length, exists, description, filename, path, url);

        InputStream inputStream = file.getInputStream();
        List<String> strings = IOUtils.readLines(inputStream, "UTF-8" );
        strings.forEach(System.out::print);

        // 如果想在原来的resource基础上，获取新的resource
        Resource relative = file.createRelative("newFile.txt" );
        log.info("new file url is {}", relative.getURL().toString());
    }
}
