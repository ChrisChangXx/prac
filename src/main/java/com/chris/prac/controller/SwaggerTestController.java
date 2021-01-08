package com.chris.prac.controller;

import com.chris.prac.dto.BaseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * swagger 测试
 *
 * @author zhangh
 * @date 2021/01/08
 */
@RestController
public class SwaggerTestController {

    @ApiOperation(value = "swagger-test", notes = "swagger配置测试", httpMethod = "POST")
    @PostMapping(value = "/swagger-test")
    public BaseResult swaggerTest() {
        return new BaseResult(0, "success");
    }
}
