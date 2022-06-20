package com.nhnacademy.joisfe.problem.datastructure;

import java.util.Scanner;

public class SumOfInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int num[] = new int[n];
        int sum[] = new int[n];

        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextInt();

            if (i == 0) {
                sum[i] = num[i];
            } else {
                sum[i] = sum[i - 1] + num[i];
            }
        }

        for (int i = 0; i < m; ++i) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if (start == 1) {
                System.out.println(sum[end - 1]);
            } else {
                System.out.println(sum[end - 1] - sum[start - 2]);
            }
        }
    }
}
