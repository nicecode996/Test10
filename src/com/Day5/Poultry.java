package com.Day5;

/**
 * @className: com.Day5-> Poultry
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:57
 * @version: 1.0
 * @todo:
 */
abstract class Poultry {    //.定义抽象家禽类(Poultry)
    private String name;     //成员变量(私有):
    private String illness;
    private String symptom;     // 症状(symptom)
    private int age;         //年龄(age)

    public abstract void showSymptom();     //ii.成员方法:  showSymptom

    public void showMsg() {     // 成员方法:  showMsg
        System.out.print("动物种类:" + name);
        System.out.println(",年龄:" + age + "岁");
        System.out.println("入院原因:" + illness);
    }

    public Poultry() {
        super();
    }

    public Poultry(String name, String illness, String symptom, int age) {
        this.name = name;
        this.illness = illness;
        this.symptom = symptom;
        this.age = age;
    }

    public int getAge() {        //iv.提供setXxx和getXxx方法
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}

class Duck extends Poultry {    // Duck 类
    public Duck() {
    }

    public Duck(String name, String illness, String symptom, int age) {
        super(name, illness, symptom, age);
    }

    public void showSymptom() {
        System.out.println("症状为:" + getSymptom());
    }
}
