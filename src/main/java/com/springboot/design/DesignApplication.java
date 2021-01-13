package com.springboot.design;

import com.springboot.design.bean.Pet;
import com.springboot.design.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties
@SpringBootApplication
public class DesignApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DesignApplication.class, args);
//        for (String name: run.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }

        User user = run.getBean("user01",User.class);
        System.out.println(user.getPet().getName());
        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println(tom);
//        System.out.println("相等吗：" + (user.getPet() == tom));
    }
}
