package com.Day5;

/**
 * @className: com.Day5-> Circle
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:55
 * @version: 1.0
 * @todo:
 */
class Circle {        //定义父类--圆类
    private double radius;         //成员变量--圆半径

    Circle() {        //构造方法
        radius = 0.0;
    }

    Circle(double r) {        //构造方法
        radius = r;
    }

    double getPerimeter() {    //成员方法--求圆周长
        return 2 * Math.PI * radius;
    }

    double getArea() {        //成员方法--求圆面积
        return Math.PI * radius * radius;
    }

    void disp() { //成员方法--显示圆半径、周长、面积
        System.out.println("圆半径=" + radius);
        System.out.println("圆周长=" + getPerimeter());
        System.out.println("圆面积=" + getArea());
    }
}

class Cylinder extends Circle {    //定义子类--圆柱类
    private double hight;        //成员变量--圆柱高

    Cylinder(double r, double h) {    //构造方法
        super(r);
        hight = h;
    }

    public double getVol() {        //成员方法--求圆柱体积
        return getArea() * hight;
    }

    public void dispVol() {        //成员方法--显示圆柱体积
        System.out.println("圆柱体积=" + getVol());
    }
}
