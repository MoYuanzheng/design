package com.springboot.design.service;

import com.springboot.design.bean.Account;
import com.springboot.design.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account geAccByUid(Integer uid){
        return accountMapper.getUid(uid);
    }
}
