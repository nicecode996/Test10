package com.Day5;

/**
 * @className: com.Day5-> People00
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:53
 * @version: 1.0
 * @todo:
 */
class People00 extends Monkey {
    People00(String s) {
        super(s);
    }

    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }

    void think() {
        System.out.println("别说话！认真思考！");
    }
}