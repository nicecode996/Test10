package com.Day5;

/**
 * @className: com.Day5-> Juxing
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:51
 * @version: 1.0
 * @todo:
 */
class Juxing {
    private double chang;
    private double kuan;

    Juxing() {
    }

    public double getChang() {
        return this.chang;
    }

    public void setChang(double chang) {
        this.chang = chang;
    }

    public double getKuan() {
        return this.kuan;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }

    public double area() {
        return this.chang * this.kuan;
    }
}
