package com.zjrealtech.trace.controller.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by longtaiye on 2017/11/22.
 */
@Configuration
public class ShowConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){

        interceptorRegistry.addInterceptor(new ShowInterceptor()).addPathPatterns("/**");
    }
}
