package com.qqgg.redisdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qqgg.redisdemo.dto.LoginDto;
import com.qqgg.redisdemo.entity.User;
import com.qqgg.redisdemo.exception.LoginException;
import com.qqgg.redisdemo.service.LoginService;
import com.qqgg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import static com.qqgg.redisdemo.exception.LoginExceptionStatus.*;

public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserService userService;

    @Override
    public void login(LoginDto loginDto) {
        if(null == loginDto || loginDto.getUsername().length() <= 0 ||loginDto.getPassword().length() <= 0)
            throw new LoginException(USERNAME_PASSWORD_EMPTY);
        if (loginDto.getUsername().length() < 3 || loginDto.getUsername().length() > 10)
            throw new LoginException(USERNAME_ILLEGAL);
        if(loginDto.getPassword().length() < 6 || loginDto.getPassword().length() > 15)
            throw new LoginException(PASSWORD_ILLEGAL);
        //根据表单提交的用户名获取记录
        User user = userService.getOne(new QueryWrapper<User>().eq("username" , loginDto.getUsername()));
        //用户不存在
        if(user == null){
          throw new LoginException(USER_NOT_EXIST);
        }
        //密码错误
        if(loginDto.getPassword() != user.getPassword()){
            throw new LoginException(PASSWORD_ERROR);
        }
    }
}
