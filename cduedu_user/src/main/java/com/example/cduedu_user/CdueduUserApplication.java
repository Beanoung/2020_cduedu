package com.example.cduedu_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.example.cduedu_user.mapper")
@SpringBootApplication
public class CdueduUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(CdueduUserApplication.class, args);
    }
}
