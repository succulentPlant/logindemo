package com.qqgg.redisdemo.exception;

/**
 * 枚举常见登录异常
 */
public enum LoginExceptionStatus {
    USERNAME_PASSWORD_EMPTY(1001,"用户名和密码不能为空"),
    USERNAME_EMPTY(1002,"用户名不能为空"),
    PASSWORD_EMPTY(1003,"密码不能为空"),
    USERNAME_ILLEGAL(1004,"非法用户名"),
    PASSWORD_ILLEGAL(1005,"非法密码"),
    USER_NOT_EXIST(1006, "该用户不存在"),
    PASSWORD_ERROR(1007,"密码错误");


    private int code;
    private String msg;

    LoginExceptionStatus(int code , String msg){
        this.code = code;
        this.msg = msg;
    }
    //只要get 不要set嘛？？？
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
