package com.Day5;

/**
 * @className: com.Day5-> ChangFangTi
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:50
 * @version: 1.0
 * @todo:
 */
class ChangFangTi extends Juxing {
    private double gao;

    ChangFangTi() {
    }

    public double getGao() {
        return this.gao;
    }

    public void setGao(double gao) {
        this.gao = gao;
    }

    public double tiji() {
        return this.area() * this.gao;
    }
}