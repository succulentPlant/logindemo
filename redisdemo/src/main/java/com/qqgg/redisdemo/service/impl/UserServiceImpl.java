package com.qqgg.redisdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qqgg.redisdemo.dao.UserMapper;
import com.qqgg.redisdemo.dto.LoginDto;
import com.qqgg.redisdemo.entity.User;
import com.qqgg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> list1() {
        return userMapper.selectList1();
    }

    @Override
    public User checkUserInfo(LoginDto loginDto) {
        return null;
    }
}
