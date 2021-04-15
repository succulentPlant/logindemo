package com.qqgg.redisdemo.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDto implements Serializable {


    private String username;

    private String password;

}
