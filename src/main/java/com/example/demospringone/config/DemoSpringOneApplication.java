package com.example.demospringone.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.example.demospringone")
@SpringBootApplication
public class DemoSpringOneApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DemoSpringOneApplication.class);

    public static void main(String[] args) {

//        SpringApplication.run(DemoSpringOneApplication.class, args);
        SpringApplication app = new SpringApplication(DemoSpringOneApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("启动成功");

        LOG.info("地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
