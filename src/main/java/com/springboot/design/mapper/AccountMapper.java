package com.springboot.design.mapper;


import com.springboot.design.bean.Account;
import org.apache.ibatis.annotations.Mapper;

public interface AccountMapper {
    public Account getUid(Integer uid);
//    public Account getUsername(Integer uid);
//    public Account getAge(Integer uid);
}
