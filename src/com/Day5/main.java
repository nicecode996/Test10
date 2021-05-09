package com.Day5;

/**
 * @className: com.Day5-> main
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-01 下午2:44
 * @version: 1.0
 * @todo:
 */
/*
public class main {
    public static void main(String[] args) {

        ChangFangTi a = new ChangFangTi();
        a.setChang(12);
        a.setKuan(10);
        a.setGao(5);
        System.out.println("长方体的底面积是：" + a.area());
        System.out.println("长方体的体积是：" + a.tiji());

*/
    /*
    public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Helloword");
        System.out.println("hello_word");
        int y;


        System.out.println("________________");
        System.out.println("请输入一个年份:");
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.print("这是闰年");
        } else {
            System.out.print("这不是闰年");
        }

    }
}

     */

/*
class E {
    public static void main(String[] args) {
        Monkey m = new Monkey("Toney");
        System.out.println("我是猴子" + m.getName());
        m.speak();
        People00 p = new People00("Tom");
        System.out.println("我是人类" + p.getName());
        p.speak();
        p.think();
    }
}
*/

class TestPeople {
    public static void main(String[] args) {
        ChinaPeople chp = new ChinaPeople();
        chp.height = 180;
        chp.weight = 130;
        chp.speakHello();
        chp.averageHeight();
        chp.averageWeight();
        chp.chinaGongfu();
        AmericanPeople amp = new AmericanPeople();
        amp.setHeight(175);
        amp.setWeight(150);
        amp.speakHello();
        amp.averageHeight();
        amp.averageWeight();
        amp.amercianBoxing();
    }
}

