package com.nhnacademy.joisfe.answer.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String sNum = scanner.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (int i = 0; i < cNum.length; ++i) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
