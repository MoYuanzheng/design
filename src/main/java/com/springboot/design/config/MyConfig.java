package com.springboot.design.config;

import com.springboot.design.bean.Pet;
import com.springboot.design.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* proxyBeanMethods = true   full模式，new之前会到容器中寻找user01，只会生成一个 user01,
* 外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器的单实例对象
* proxyBeanMethods = false  lite模式，new之前不会到容器中寻找user01
* */
@Configuration()
public class MyConfig {
    @Bean
    public User user01(){
        User zhangSan = new User("Mok",13);
        zhangSan.setPet(tom());
        return zhangSan;
    }

    @Bean
    public Pet tom(){
        return new Pet("tom");
    }
}
