package com.zjrealtech.trace.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by longtaiye on 2017/12/1.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RestException extends RuntimeException {
    private Integer retCode;
    private String retMsg;
    private Object retData;

    public RestException(String resultMsg) {
        super(resultMsg);
        this.setRetCode(RestExceptionResultCodeEnum.UNKNOWN.getValue());
        this.setRetMsg(resultMsg);
    }

    public RestException(RestExceptionResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.setRetCode(resultCodeEnum.getValue());
        this.setRetMsg(resultCodeEnum.getMessage());
    }

    public RestException(RestExceptionResultCodeEnum resultCodeEnum, String resultMsg) {
        super(resultMsg);
        this.setRetCode(resultCodeEnum.getValue());
        this.setRetMsg(resultMsg);
    }

    public RestException(RestExceptionResultCodeEnum resultCodeEnum, String resultMsg, Object data) {
        super(resultMsg);
        this.setRetCode(resultCodeEnum.getValue());
        this.setRetMsg(resultMsg);
        this.setRetData(data);
    }
}
