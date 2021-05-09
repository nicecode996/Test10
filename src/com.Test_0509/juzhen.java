package com.Test_0509;

import java.util.Scanner;

/**
 * @className: com.Test_0509-> juzhen
 * @description:
 * @author: 麻旭
 * @createDate: 2021-05-09 下午7:44
 * @version: 1.0
 * @todo:
 */
public class juzhen {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入九个数:");
        Scanner scanner = new Scanner(System.in);
        int [][]a = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                a[i][j] = scanner.nextInt();
                if (i == j || (i + j) == 2) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
