package com.springboot.design.service.impl;

import com.springboot.design.bean.Account;
import com.springboot.design.mapper.AccountMapper;
import com.springboot.design.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account geAccByUid(Integer uid){
        return accountMapper.getUid(uid);
    }
}
