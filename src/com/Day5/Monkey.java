package com.Day5;

/**
 * @className: com.Day5-> Monkey
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-01 下午2:59
 * @version: 1.0
 * @todo:
 */
public class Monkey {
    private String name;

    Monkey(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("咿咿呀呀.........");
    }
}


