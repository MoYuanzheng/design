package com.springboot.design.config;

import com.springboot.design.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //被拦截的
                .addPathPatterns("/**")
                //放行的
                .excludePathPatterns("/login", "/css/**", "/fonts/**", "/images/**", "/js/**");
    }
}
