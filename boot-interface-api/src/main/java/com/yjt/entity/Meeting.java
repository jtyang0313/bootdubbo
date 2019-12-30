package com.yjt.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Meeting implements Serializable {
    //id
    private Integer id;

    private String code;

    private String meetingName;

    private String content;

    private Date time;

    private Integer uid;

    private User user;

}