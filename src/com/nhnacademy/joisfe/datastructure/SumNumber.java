package com.nhnacademy.joisfe.datastructure;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        String number = scanner.next();

        String[] numbers = number.split("");

        int sum = 0;

        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
