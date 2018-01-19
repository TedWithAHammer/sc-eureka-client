package com.leo.sceurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.sceurekaclient.BaseResponse;
import com.leo.sceurekaclient.RestResponse;

/**
 * Created by leo on 2018/1/17.
 * Description:
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test")
    public BaseResponse test() {
        return new RestResponse<>("this is a test" + serverPort);
    }
}
