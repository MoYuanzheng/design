package com.springboot.design.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Info {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}