package com.ttyc.spring.chapter6.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("ok" )
    public String ok() {
        return "ok";
    }
}
