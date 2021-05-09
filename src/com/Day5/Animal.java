package com.Day5;

/**
 * @className: com.Day5-> Animal
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:55
 * @version: 1.0
 * @todo:
 */
interface Animal {        //声明接口Animal
    abstract void run();        //定义抽象方法
}

class Bird implements Animal {    // 实现接口
    public void run() {
        System.out.println("测试run方法成功");
    }
}

class Fish implements Animal {//定义接口

    public void run() {
        System.out.println("测试run方法成功");
    }
}
