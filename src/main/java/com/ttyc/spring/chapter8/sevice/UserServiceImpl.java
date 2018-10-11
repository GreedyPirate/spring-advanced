package com.ttyc.spring.chapter8.sevice;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login(Integer id) {
        return "SUCCESS";
    }
}
