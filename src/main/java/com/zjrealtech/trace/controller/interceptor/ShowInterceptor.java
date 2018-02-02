package com.zjrealtech.trace.controller.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by longtaiye on 2017/11/22.
 */
@Slf4j
public class ShowInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        log.info("Request received.\n[RequestURL] {}\n[RequestMethod] {}\n[RemoteAddress] {}\n[RequestParameters] {}",
                request.getRequestURL(),
                request.getMethod(),
                request.getRemoteAddr(),
                request.getQueryString());



        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, ModelAndView modelAndView){

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex){

    }
}
