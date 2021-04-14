package com.qqgg.redisdemo.exception;

/**
 * 枚举常见登录异常
 */
public enum LoginExceptionStatus {
    USERNAME_EMPTY(1001,"用户名不能为空"),
    PASSWORD_EMPTY(1002,"密码不能为空"),
    USERNAME_ERROR(1003,"用户名格式错误"),
    PASSWORD_ERROR(1004,"密码错误"),
    USER_NOT_EXIST(1005, "该用户不存在");


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
