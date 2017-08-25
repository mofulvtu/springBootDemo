package com.lzg.springBootDemo.utils.interceptor.config;

import com.lzg.springBootDemo.utils.interceptor.AccessTokenVerifyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置拦截器
 * MVC 设置
 * 第一步：将拦截器配置成Bean
 * 第二步：拦截器注册注入该拦截器，并配置拦截的URL
 * Created by 刘增刚 on 2017/8/25
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public AccessTokenVerifyInterceptor tokenVerifyInterceptor(){
        return new AccessTokenVerifyInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/test");
        super.addInterceptors(registry);
    }
}
