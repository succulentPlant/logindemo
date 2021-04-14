package com.qqgg.redisdemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@Accessors
public class User implements Serializable {
    private String  userid;
    private String username;
    private String password;
}
