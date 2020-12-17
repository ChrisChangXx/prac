package com.chris.prac.controller;

import com.chris.prac.dto.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务控制器
 *
 * @author zhangh
 * @date 2020/12/17
 */
@Slf4j
@RestController
public class NotFoundController implements ErrorController {

    @RequestMapping(path = "/error")
    public BaseResult error(HttpServletResponse response) {
        log.error("访问/error" + "  错误代码：" + response.getStatus());
        return new BaseResult(response.getStatus(), "HttpErrorController error");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
