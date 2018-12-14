package com.ttyc.spring.chapter8.service;

import org.springframework.stereotype.Service;

@Service
public class SuperUserServiceImpl implements UserService {
    @Override
    public String login(Integer id) {
        System.out.println("SuperUserServiceImpl: " + id);
        return "SUPER";
    }

    @Override
    public void save(String name) {
        System.out.println("super name is: " + name);
    }

    public void mine() {
        System.out.println("myself method");
    }
}
