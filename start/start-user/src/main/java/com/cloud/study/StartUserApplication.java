package com.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @program: cloudStudy
 * @description:
 * @author: zhangwei
 * @create: 2019-08-14 11:36
 **/
@SpringBootApplication
public class StartUserApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StartUserApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StartUserApplication.class);
    }
}

