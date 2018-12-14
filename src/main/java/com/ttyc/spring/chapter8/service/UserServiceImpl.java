package com.ttyc.spring.chapter8.service;

import com.ttyc.spring.chapter8.execution.Skip;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Skip
    @Override
    public String login(Integer id) {
        System.out.println(id);
        return "SUCCESS";
    }

    @Override
    public void save(String name) {
        System.out.println(name);
    }
}
