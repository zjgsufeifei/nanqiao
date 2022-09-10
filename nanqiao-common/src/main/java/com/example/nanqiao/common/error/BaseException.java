package com.example.nanqiao.common.error;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = -238809961561154591L;
    private Integer code;
    private String message;

    public BaseException(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public BaseException(Integer code,String message,Throwable cause){
        super(message, cause);
        this.code=code;
        this.message=message;
    }

    public BaseException(NanQiaoErrorCode errorCode){
        this.code= errorCode.getCode();
        this.message=errorCode.getDescription();
    }

    public BaseException(NanQiaoErrorCode errorCode,String message){
        this.code=errorCode.getCode();
        this.message=message;
    }

    public BaseException(NanQiaoErrorCode errorCode, Throwable cause) {
        super(errorCode.getDescription(), cause);
        this.code=errorCode.getCode();
        this.message=errorCode.getDescription();
    }
}
