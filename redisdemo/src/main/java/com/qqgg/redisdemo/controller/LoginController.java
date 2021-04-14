package com.qqgg.redisdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qqgg.redisdemo.dto.LoginDto;
import com.qqgg.redisdemo.entity.User;
import com.qqgg.redisdemo.result.CodeMsg;
import com.qqgg.redisdemo.result.Result;
import com.qqgg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping ("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto){

        User user = userService.getOne(new QueryWrapper<User>().eq("username" , loginDto.getUsername()));   //根据Wrapper，查询一条记录 条件构造器username == loginDto.getUsername())
         System.out.println(user);
        if(user == null){
            return Result.error(CodeMsg.USER_NOT_EXIST);
        }
        if (!user.getPassword().equals(loginDto.getPassword())){
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        return Result.success(true);
    }

}
