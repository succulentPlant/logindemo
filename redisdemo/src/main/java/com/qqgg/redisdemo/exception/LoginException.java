package com.qqgg.redisdemo.exception;

/**
 * 登录异常
 */
public class LoginException extends RuntimeException{
    private int code = 500;     //默认500，为错误码
    private String msg;

    public LoginException(String msg) {
        this.msg = msg;
    }

    public LoginException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public LoginException(LoginExceptionStatus loginExceptionStatus) {
        this.code = loginExceptionStatus.getCode();
        this.msg = loginExceptionStatus.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
