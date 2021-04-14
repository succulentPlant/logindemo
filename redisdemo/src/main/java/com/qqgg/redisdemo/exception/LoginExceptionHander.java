package com.qqgg.redisdemo.exception;

import com.qqgg.redisdemo.result.Result;
import com.qqgg.redisdemo.result.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 */

@RestControllerAdvice
public class LoginExceptionHander {
    /**
     * 处理自定义的异常
     */
    @ExceptionHandler(LoginException.class)
    public Result handLoginException(LoginException le){
        return new Result(le.getCode(),le.getMsg());
    }

    /**
     * 处理所有的异常
     */
    @ExceptionHandler(Exception.class)
    public  Result handException(Exception e){
        return new ResultUtil.error(e.getMessage());
    }


}
