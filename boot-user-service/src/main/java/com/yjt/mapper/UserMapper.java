package com.yjt.mapper;

import com.yjt.entity.User;

//@Mapper(跟@MapperScan("com.yjt.mapper*")一样，有一个注解就行)
public interface UserMapper {

    User selectById(Integer id);
}
