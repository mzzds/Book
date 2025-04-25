package com.mahone.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mahone.book.mapper")
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        System.out.println("hello world");
        System.out.println("hello git3");
        System.out.println("hello git4");
        System.out.println("master test!");
        System.out.println("hot-fix test!");
        System.out.println("push test!");
    }

}
