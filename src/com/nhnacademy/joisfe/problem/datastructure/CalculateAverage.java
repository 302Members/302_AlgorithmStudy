package com.nhnacademy.joisfe.problem.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        List<Double> scores = new ArrayList<>();

        double maxScore = 0;

        for (int i = 0; i < num; ++i) {
            double score = scanner.nextInt();
            scores.add(score);

            if (maxScore < score) {
                maxScore = score;
            }
        }

        for (int i = 0; i < num; ++i) {
            scores.set(i, scores.get(i) / maxScore * 100);
        }

        System.out.println(calculateAvg(scores));

    }

    public static double calculateAvg(List<Double> Scores) {
        double sum = 0;

        for (Double score : Scores) {
            sum += score;
        }

        return sum / Scores.size();
    }
}
