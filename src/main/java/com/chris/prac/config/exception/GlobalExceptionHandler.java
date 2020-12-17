package com.chris.prac.config.exception;

import com.chris.prac.dto.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhangh
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResult globalException(Exception ex) {
        log.error("globalException:" + ex.getMessage());
        return new BaseResult(BaseResult.RESULT_FAIL, ex.getMessage());
    }
}
