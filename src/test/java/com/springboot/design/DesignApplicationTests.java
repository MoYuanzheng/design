package com.springboot.design;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class DesignApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * form user",)
        Long aLong = jdbcTemplate.queryForObject("select count(*) from info", Long.class);
        System.out.println("记录总数" + aLong);

        System.out.println("数据源类型" + dataSource.getClass());
    }

}
