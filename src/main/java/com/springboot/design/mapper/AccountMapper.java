package com.springboot.design.mapper;


import com.springboot.design.bean.Account;

public interface AccountMapper {
    public Account getAccount(Integer uid);
    public Account getUsername(Integer uid);
    public Account getAge(Integer uid);
}
