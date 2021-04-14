package com.qqgg.redisdemo.controller;

import com.qqgg.redisdemo.dao.UserMapper;
import com.qqgg.redisdemo.entity.User;
import com.qqgg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserService userService;


    @Autowired
    private UserMapper userMapper;


    @GetMapping("/test1")
    public String test() {
        return "HelloWorld";
    }



    @GetMapping("/test2")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list1();
        userList.forEach(System.out::println);
    }

}
