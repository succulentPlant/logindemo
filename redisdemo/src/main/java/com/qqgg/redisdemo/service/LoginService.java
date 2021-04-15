package com.qqgg.redisdemo.service;

import com.qqgg.redisdemo.dto.LoginDto;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    void login(LoginDto loginDto);
}
