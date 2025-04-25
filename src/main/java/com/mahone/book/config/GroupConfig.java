package com.mahone.book.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupConfig {

    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder()
                .group("用户管理")  // 分组名称（显示在UI上）
                .pathsToMatch("/user/**")  // 匹配的URL路径
                .packagesToScan("com.mahone.book.controller")  // 可选的包扫描路径
                .build();
    }

    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("产品管理")
                .pathsToMatch("/product/**")
                .packagesToScan("com.mahone.book.controller")
                .build();
    }
}
