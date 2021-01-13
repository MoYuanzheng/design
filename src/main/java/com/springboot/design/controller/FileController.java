package com.springboot.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class FileController {

    @PostMapping("/file")
    public String upload(@RequestParam("username") String userName,
                         @RequestParam("password") String password,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws Exception {
        //如果不为空，就保存
        for (MultipartFile photo : photos) {
            if (!photo.isEmpty()) {
                String originalFilename = photo.getOriginalFilename();
                System.out.println(originalFilename);
                photo.transferTo(new File("H:\\ACache\\" + originalFilename));
            }
        }
        return "/main";
    }
}
