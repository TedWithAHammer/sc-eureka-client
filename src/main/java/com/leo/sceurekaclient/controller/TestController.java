package com.leo.sceurekaclient.controller;

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
    @GetMapping("/test")
    public BaseResponse test() {
        return new RestResponse<String>("this is a test");
    }
}
