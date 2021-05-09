package com.Day5;

/**
 * @className: com.Day5-> p
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:48
 * @version: 1.0
 * @todo:
 */

class AmericanPeople extends People {
    AmericanPeople() {
    }

    public void speakHello() {
        System.out.println("你好，我是美国人！");
    }

    public void averageHeight() {
        System.out.println("美国人的平均身高是：" + this.height);
    }

    public void averageWeight() {
        System.out.println("美国人的平均体重是：" + this.weight);
    }

    public void amercianBoxing() {
        System.out.println("我会美式拳击：直拳，上勾拳！");
    }
}

