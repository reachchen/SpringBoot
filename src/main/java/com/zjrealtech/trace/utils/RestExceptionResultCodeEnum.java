package com.zjrealtech.trace.utils;

import lombok.Getter;

/**
 * Created by longtaiye on 2017/12/1.
 */
public enum RestExceptionResultCodeEnum {
    /*-----------------------------0为预留错误码，成功时返回错误码0--------------------------*/
    SUCCESS(200, "success"),

    /*-----------------------------认证类型错误--------------------------*/
    ERROR_PARAM(400, "error parameter"),
    UNAUTHORRIZED(401, "unathorized"),
    NOT_FOUND(404, "not found"),
    REQUEST_TIMEOUT(408, "request timeout"),

    /*-----------------------------未知类型错误--------------------------*/
    //未知错误
    UNKNOWN(500, "unkonw system error");


    @Getter
    private Integer value;

    @Getter
    private String message;

    RestExceptionResultCodeEnum(Integer value, String message) {
        this.value = value;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

}
