package org.db.fundamentals;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Write a function which calculates the average of the numbers in a given list.
 *
 * Note: Empty arrays should return 0.
 */
public class CalculateAverage {

    //1st attempt
    public static double getAverage(int[] arr) {

        double sum = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum == 0) {
            return 0;
        } else {
            return sum/arr.length;
        }
    }

    //2nd attempt after research
    public static double getAverageByStream(int[] array) {
        IntStream stream = Arrays.stream(array);
        double sum = stream.sum();
        if (sum == 0)
            return 0;
        return sum/array.length;
    }
}
