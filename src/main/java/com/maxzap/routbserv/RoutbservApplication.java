package com.maxzap.routbserv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RoutbservApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutbservApplication.class, args);
        log.info("<<<RUN>>>");
    }

}
