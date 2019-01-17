package leetcode_cn;

import java.util.Scanner;
/*
* 输出一个菱形，
*               A
             BBB
            CCCCC
           DDDDDDD
            CCCCC
             BBB
              A  类似形式
* */
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小于26大于1的数字：");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j >= n - i +1 && j <= n + i - 1) {
                        System.out.print((char)('A'+i-1));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j > i - n && j < 3 * n - i) {
                        System.out.print((char)('A'+2*n-i-1));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

}
