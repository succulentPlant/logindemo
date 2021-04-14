package com.qqgg.redisdemo.result;

import com.qqgg.redisdemo.constant.LoginStatusCode;

/**
 * 返回结果包
 */
public class ResultUtil {

    /**
     *创建返回结果
     */
    public static Result create(int code ,String msg){
        return new Result(code , msg);
    }
    /**
     * 成功
     */
    public static Result success(){
        return new Result(LoginStatusCode.SUCCESS_CODE,"success");
    }
    public static Result success(String msg){
        return new Result(LoginStatusCode.SUCCESS_CODE,msg);
    }
    public static Result success(Object data){
        return new Result(LoginStatusCode.SUCCESS_CODE,"success",data);
    }
    /**
     * 失败
     */
    public static Result error(){
        return new Result(LoginStatusCode.ERROR_CODE,"error");
    }
    public static Result error(String msg){
        return new Result(LoginStatusCode.ERROR_CODE,msg);
    }

}
