package com.springboot.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
public class UserController {

    //PathVariable() 路径变量
    //@RequestParam 获取请求参数
    //@GetMapping("/user?id=xxx&name=xxx ...)
    //public Map<String, Object> getUser(@RequestParam Map<String, String> RQ)
    @ResponseBody
    @GetMapping("/user/{id}/pet/{petName}")
    public Map<String, Object> getUser(@PathVariable("id") Integer id,
                                       @PathVariable("petName") String petName,
                                       @PathVariable Map<String, String> pv,
                                       @RequestHeader Map<String, String> header) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("petName", petName);
        map.put("pv", pv);
        map.put("header", header);

        return map;
    }

    @GetMapping("/usergo")
    public String userGo(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("msg", "成功了~");
        httpServletRequest.setAttribute("code", "200");
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> success(@RequestAttribute("msg") String msg,
                                       @RequestAttribute("code") Integer code,
                                       HttpServletRequest httpServletRequest) {
        Object obj1 = httpServletRequest.getAttribute("msg");
        Object obj2 = httpServletRequest.getAttribute("code");
        Map<String, Object> map = new HashMap<>();
        map.put("RequestMSG", obj1);
        map.put("RequestCODE", obj2);
        map.put("msg", msg);
        map.put("code", code);
        return map;
    }


    //RequestBody 只用于post请求
    @ResponseBody
    @PostMapping("/user")
    public Map<String, Object> saveUser(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @ResponseBody
    @PutMapping("/user")
    public String putUser() {
        return "PUT-Mok";
    }

    @ResponseBody
    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-Mok";
    }
}
