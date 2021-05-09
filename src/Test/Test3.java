package Test;

import com.Day5.Student;

import java.util.Arrays;

/**
 * @className: Test-> Test3
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-02 下午6:03
 * @version: 1.0
 * @todo:
 */
public class Test3 {
    public static void main(String[] args) {
        Student s1 = new com.Day5.Student(1, "a", "男", 18, 80);
        Student s2 = new com.Day5.Student(2, "b", "女", 19, 90);
        Student s3 = new com.Day5.Student(3, "c", "男", 20, 87);
        Student s4 = new com.Day5.Student(4, "d", "女", 26, 85);
        Student s5 = new com.Day5.Student(5, "e", "男", 30, 75);
        System.out.println(s1.getsSex());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        int avg = (s1.getsJava() + s2.getsJava() + s3.getsJava() + s4.getsJava() + s5.getsJava()) / 5;
        System.out.println("平均成绩：" + avg);
        int[] sjava = {s1.getsJava(), s2.getsJava(), s3.getsJava(), s4.getsJava(), s5.getsJava()};
        Arrays.sort(sjava);
        int min = sjava[0];
        int max = sjava[sjava.length - 1];
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }

}

