package com.xiexin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiexin.dao")
public class ComputerzhuangpeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerzhuangpeiApplication.class, args);
    }

}
