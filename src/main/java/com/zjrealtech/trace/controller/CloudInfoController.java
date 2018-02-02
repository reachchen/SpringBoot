package com.zjrealtech.trace.controller;

import com.zjrealtech.trace.controller.dto.ResultDTO;
import com.zjrealtech.trace.task.UpdateAccessTokenTask;
import com.zjrealtech.trace.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

import javax.xml.transform.Result;

/**
 * Created by longtaiye on 2017/11/22.
 */
@Slf4j
@RestController
public class CloudInfoController {

    @ApiOperation(value ="获取版本")
    @RequestMapping(value = "/version", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultDTO getShiftBarcodeList()  {
        JSONObject rootNode = new JSONObject();

        rootNode.put("version", "1.0.0");
        rootNode.put("producer", "只道寻常网");

        ResultDTO result = ResultUtil.Success(rootNode);

        return result;
    }


}