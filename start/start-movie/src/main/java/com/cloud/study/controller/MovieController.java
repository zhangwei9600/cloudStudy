package com.cloud.study.controller;

import com.cloud.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloudStudy
 * @description:
 * @author: zhangwei
 * @create: 2019-08-14 13:46
 **/
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public User getUserInfo(@PathVariable long id) {
        return restTemplate.getForObject(userServiceUrl+id,User.class);
    }
}

