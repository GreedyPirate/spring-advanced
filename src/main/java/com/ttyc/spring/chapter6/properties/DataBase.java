package com.ttyc.spring.chapter6.properties;

import lombok.Data;

@Data
public class DataBase {

    private String username;
    private String password;
    private String host;
    private Integer port;
}
