package com.aida.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by fengdaqing on 2018/5/3.
 */
@SpringBootApplication
public class applicationMain extends SpringBootServletInitializer {

    public applicationMain() {
        super();
        setRegisterErrorPageFilter(false); // <- this one
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationMain.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(applicationMain.class, args);
    }
}
