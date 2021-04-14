package com.qqgg.redisdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qqgg.redisdemo.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectList1();
}
