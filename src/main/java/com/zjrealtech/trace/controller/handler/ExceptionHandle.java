package com.zjrealtech.trace.controller.handler;


import com.zjrealtech.trace.controller.dto.ResultDTO;
import com.zjrealtech.trace.utils.RestException;
import com.zjrealtech.trace.utils.RestExceptionResultCodeEnum;
import com.zjrealtech.trace.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by longtaiye on 2017/11/22.
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultDTO handle(Exception e){
        ResultDTO result;


        if (e instanceof RestException){
            result = ResultUtil.Error(((RestException) e).getRetCode(), ((RestException) e).getRetMsg());
            log.error("后台处理失败: " + ((RestException) e).getRetMsg());
        }else {
            log.error("后台处理未知异常: " + e.getMessage());
            e.printStackTrace();
            result = ResultUtil.Error(RestExceptionResultCodeEnum.UNKNOWN);
        }

        return result;
    }
}
