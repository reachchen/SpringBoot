package com.zjrealtech.trace.controller.dto;

import lombok.Data;

/**
 * Created by longtaiye on 2017/11/22.
 */
@Data
public class ResultDTO<T> {
    private int retCode;
    private String retMessage;
    private T retData ;
}
