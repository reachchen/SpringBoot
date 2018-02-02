package com.zjrealtech.trace.utils;


import com.zjrealtech.trace.controller.dto.ResultDTO;
import com.zjrealtech.trace.utils.RestExceptionResultCodeEnum;

/**
 * Created by longtaiye on 2017/12/1.
 */
public class ResultUtil {
    public static ResultDTO Success(Object object){
        ResultDTO result = new ResultDTO();
        result.setRetCode(RestExceptionResultCodeEnum.SUCCESS.getValue());
        result.setRetMessage(RestExceptionResultCodeEnum.SUCCESS.getMessage());
        result.setRetData(object);
        return result;
    }

    public static ResultDTO Success(){
        ResultDTO result = new ResultDTO();
        result.setRetCode(RestExceptionResultCodeEnum.SUCCESS.getValue());
        result.setRetMessage(RestExceptionResultCodeEnum.SUCCESS.getMessage());
        return result;
    }

    public static ResultDTO Error(RestExceptionResultCodeEnum resultCodeEnum){
        ResultDTO result = new ResultDTO();

        result.setRetCode(resultCodeEnum.getValue());
        result.setRetMessage(resultCodeEnum.getMessage());

        return result;
    }

    public static ResultDTO Error(int errCode, String errMessage){
        ResultDTO result = new ResultDTO();

        result.setRetCode(errCode);
        result.setRetMessage(errMessage);

        return result;
    }
}
