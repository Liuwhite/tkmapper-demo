package com.white.tk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.white.mapper")
@SpringBootApplication
public class TkMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkMainApplication.class, args);
    }
}
