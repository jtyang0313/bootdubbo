package com.yjt.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息表
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private String phone;

    private String address;

}
