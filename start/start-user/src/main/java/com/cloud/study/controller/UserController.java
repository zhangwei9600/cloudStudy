package com.cloud.study.controller;

import com.cloud.study.entity.User;
import com.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloudStudy
 * @description:
 * @author: zhangwei
 * @create: 2019-08-14 11:55
 **/
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public User findUser(@PathVariable long id) {
        return repository.findOne(id);
    }

}

