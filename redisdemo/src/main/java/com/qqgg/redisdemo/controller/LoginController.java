package com.qqgg.redisdemo.controller;


import com.qqgg.redisdemo.dto.LoginDto;
import com.qqgg.redisdemo.result.Result;
import com.qqgg.redisdemo.result.ResultUtil;
import com.qqgg.redisdemo.service.LoginService;
import com.qqgg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    LoginService loginService;

    @PostMapping ("/login")
    public Result login(@RequestBody LoginDto loginDto){

//        User user = userService.getOne(new QueryWrapper<User>().eq("username" , loginDto.getUsername()));   //根据Wrapper，查询一条记录 条件构造器username == loginDto.getUsername())
//         System.out.println(user);
//        if(user == null){
//            return Result.error(CodeMsg.USER_NOT_EXIST);
//        }
//        if (!user.getPassword().equals(loginDto.getPassword())){
//            return Result.error(CodeMsg.PASSWORD_ERROR);
//        }
        loginService.login(loginDto);
        return ResultUtil.success();
    }

}
