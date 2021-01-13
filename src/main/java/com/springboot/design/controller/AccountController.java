package com.springboot.design.controller;

import com.springboot.design.bean.Account;
import com.springboot.design.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @GetMapping("/getByUid")
    public Account getByUid(@RequestParam("uid") Integer uid){
        return accountService.geAccByUid(uid);
    }
}
