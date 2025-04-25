package com.mahone.book.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrossConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      //允许跨域访问的路径
                .allowedOriginPatterns("*")        //允许访问的源
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")  //允许请求方式
                .allowCredentials(true)     //是否发送cookie
                .maxAge(3600)       //预检间隔时间
                .allowedHeaders("*");   //允许头部设置
    }
}
