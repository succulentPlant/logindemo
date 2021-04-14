package com.qqgg.redisdemo.result;

/*
    异常编码和异常原因的封装
 */
public class CodeMsg {

    private int code;
    private String msg;


    //登录异常

    public static CodeMsg USERNAME_EMPTY = new CodeMsg(1001, "用户名不能为空");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(1002, "密码不能为空");

    public static CodeMsg USERNAME_ERROR = new CodeMsg(1003, "用户名格式错误");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(1004, "密码错误");

    public static CodeMsg SESSION_ERROR = new CodeMsg(1005, "Session不存在或者已经失效");

    public static CodeMsg USER_NOT_EXIST = new CodeMsg(1006, "该用户不存在");

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
