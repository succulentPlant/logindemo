package com.qqgg.redisdemo.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String password;

}
