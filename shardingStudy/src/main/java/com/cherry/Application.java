package com.cherry;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class Application
{
    public static void main( String[] args ) {
        SpringApplication.run(Application.class,args);
    }
}
