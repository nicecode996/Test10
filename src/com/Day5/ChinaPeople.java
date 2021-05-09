package com.Day5;

/**
 * @className: com.Day5-> ChinaPeople
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:51
 * @version: 1.0
 * @todo:
 */
class ChinaPeople extends People {
    ChinaPeople() {
    }

    public void speakHello() {
        System.out.println("你好，我是中国人！");
    }

    public void averageHeight() {
        System.out.println("中国人的平均身高是：" + this.height);
    }

    public void averageWeight() {
        System.out.println("中国人的平均体重是：" + this.weight);
    }

    public void chinaGongfu() {
        System.out.println("我会中国功夫：坐如钟，站如松，睡如弓！");
    }
}
