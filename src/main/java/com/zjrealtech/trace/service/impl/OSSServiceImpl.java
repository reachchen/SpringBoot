package com.zjrealtech.trace.service.impl;

import com.zjrealtech.trace.service.IOSSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by longtaiye on 2017/12/8.
 */
@Slf4j
@Service("OSSService")
public class OSSServiceImpl implements IOSSService {


    /**
     * 往OSS上上传文件
     * @param token
     * @return
     */
    public String putWeixinFileToOSS(String token){

        return token;
    }

}

