package com.Day5;

/**
 * @className: com.Day5-> People
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:52
 * @version: 1.0
 * @todo:
 */
public class People {
    protected double height;
    protected double weight;

    public People() {
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void speakHello() {
        System.out.println("你好！！！");
    }

    public void averageHeight() {
        System.out.println("平均身高是：" + this.height);
    }

    public void averageWeight() {
        System.out.println("平均体重是：" + this.weight);
    }
}
