package com.qqgg.redisdemo.result;

public class Result<T> {

    private int code;       //状态码
    private String msg;     //描述信息
    private T data;         //数据(成功登录才有数据，异常只有状态码和描述信息)


    public Result(int code, String msg) {       //异常的时候调用
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T data) {       //成功的时候调用
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
