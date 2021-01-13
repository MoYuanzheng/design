package com.springboot.design.controller;

import com.springboot.design.bean.Info;
import com.springboot.design.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InfoController {

    @Autowired
    InfoServiceImpl infoService;

    @ResponseBody
    @GetMapping("/info")
    public List<Info> getInfoById() {
        return infoService.list();
    }

    @ResponseBody
    @GetMapping("/del")
    public Boolean delInfoById(@RequestParam("id") Integer id) {
        return infoService.removeById(id);
    }
}
