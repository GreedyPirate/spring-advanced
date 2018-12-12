package com.ttyc.spring.chapter8.service;

import com.ttyc.spring.chapter8.annotation.Skip;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Skip
    @Override
    public String login(Integer id) {
        System.out.println(id);
        return "SUCCESS";
    }
}
