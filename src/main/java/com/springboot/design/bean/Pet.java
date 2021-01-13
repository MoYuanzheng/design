package com.springboot.design.bean;

import lombok.*;

//@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }
//    public Pet() {
//    }
//
//    public Pet(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
