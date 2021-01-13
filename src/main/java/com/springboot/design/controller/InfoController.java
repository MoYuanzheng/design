package com.springboot.design.controller;

import com.springboot.design.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoController {

    @Autowired
    InfoMapper infoMapper;

    @ResponseBody
    @GetMapping("/info")
    public String getInfoById(){
        return infoMapper.selectById(1L).toString();
    }
}
