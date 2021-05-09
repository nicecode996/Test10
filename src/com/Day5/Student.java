package com.Day5;

/**
 * @className: com.Day5-> Student
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午5:59
 * @version: 1.0
 * @todo:
 */
public class Student {

    private int sNO;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;

    public int getsNO() {
        return sNO;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public int getsJava() {
        return sJava;
    }

    public Student(int sNO, String sName, String sSex, int sAge, int sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
}


/*
 public String toString() {
  return "Student[sNo=" + sNO + ",sName=" + sName + ",sSex=" + sSex + ",sAge=" + sAge + ",sJava=" + sJava + "]";
 }

 */