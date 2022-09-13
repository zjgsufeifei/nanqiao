package com.example.nanqiao.api.aop;

import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

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
    public BaseResponse nanQiaoException(BaseException baseException) {
        return BaseResponse.newFailResponse().errorCode(baseException.getCode()).errorMsg(baseException.getMessage()).build();
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    protected BaseResponse handleBindException(MethodArgumentNotValidException e) {
        log.error("parameters error", e);

        String errorMsg = e.getBindingResult().getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(";"));
        return BaseResponse.newFailResponse().errorCode(NanQiaoErrorCode.PARAM_ILLEGAL.getCode()).errorMsg(errorMsg).build();
    }

    @ExceptionHandler(Throwable.class)
    public BaseResponse otherException(Throwable t) {
        log.error("system error", t);
        return BaseResponse.newFailResponse().errorCode(NanQiaoErrorCode.SYSTEM_ERROR.getCode()).errorMsg(NanQiaoErrorCode.SYSTEM_ERROR.getDescription()).build();
    }
}
