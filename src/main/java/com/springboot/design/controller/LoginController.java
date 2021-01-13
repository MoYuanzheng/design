package com.springboot.design.controller;

import com.springboot.design.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /*
     * 首次来到页面未带参数属于Get类型请求
     * 来到登录页
     * */
    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    /*
     * 提交后用Post请求方式
     * 接受登录请求
     * 防止刷新重复提交表单，需要重定向到main.html
     * */
    @PostMapping("/login")
    public String postLogin(Account account, HttpSession session, Model model) {
        //拦截器只放行了 login 页面， 故只用判断 login 界面请求就可以

        if (!(StringUtils.isEmpty(account.getUsername()) && StringUtils.isEmpty(account.getPassword()))) {
            System.out.println(account.getUsername());
            session.setAttribute("loginUser", account);
            System.out.println("已接受登录请求并跳转");
            return "redirect:/index.html";
        } else {
            System.out.println("已拒绝");
            model.addAttribute("msg", "账号密码错误！");
            return "login";
        }

    }

    /*
     * 去主页
     * */
    @GetMapping("/main.html")
    public String main(HttpSession session, Model model) {
        return "main";
    }

    @GetMapping(value = {"/","/index.html"})
    public String index(HttpSession session, Model model) {
        model.addAttribute("msg", "Hello,Spring! Hello,Thymeleaf");
        return "index";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from info", Long.class);
        return aLong.toString();
    }
}
