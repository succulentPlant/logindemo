package com.qqgg.redisdemo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qqgg.redisdemo.dto.LoginDto;
import com.qqgg.redisdemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public interface UserService extends IService<User> {


    List<User> list1();

}
