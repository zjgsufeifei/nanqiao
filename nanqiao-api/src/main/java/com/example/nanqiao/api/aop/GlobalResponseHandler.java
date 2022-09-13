package com.example.nanqiao.api.aop;

import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/

/**
 * 处理前端响应
 */
@RestControllerAdvice
@Slf4j
public class GlobalResponseHandler {
    @ExceptionHandler(BaseException.class)
    public BaseResponse nanqiaoException(BaseException baseException) {
        return BaseResponse.newFailResponse().errorCode(baseException.getCode()).errorMsg(baseException.getMessage()).build();
    }

    @ExceptionHandler({BindException.class})
    protected BaseResponse handleBindException(BindException e) {
        log.error("parameters error", e);
        List<Map<String, String>> list = new ArrayList<>();
        for (ObjectError objectError : e.getAllErrors()) {
            Map<String, String> map = new HashMap<>();
            if (objectError instanceof FieldError) {
                FieldError fieldError = (FieldError) objectError;
                map.put("field", fieldError.getField());
                map.put("message", fieldError.getDefaultMessage());
            } else {
                map.put("field", objectError.getObjectName());
                map.put("message", objectError.getDefaultMessage());
            }
            list.add(map);
        }
        return BaseResponse.newFailResponse().errorCode(NanQiaoErrorCode.PARAM_ILLEGAL.getCode()).errorMsg(JSON).build();
    }

    @ExceptionHandler(Throwable.class)
    public BaseResponse otherException(Throwable t) {
        log.error("system error", t);
        return BaseResponse.newFailResponse().errorCode(NanQiaoErrorCode.SYSTEM_ERROR.getCode()).errorMsg(NanQiaoErrorCode.SYSTEM_ERROR.getDescription()).build();
    }
}
