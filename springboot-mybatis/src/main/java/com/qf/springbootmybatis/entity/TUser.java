package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TUser {

    private Integer id;

    private String uname;

    private String pwd;

}