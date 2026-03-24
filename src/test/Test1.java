package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        double average = average(arr);
        System.out.println(average);
    }

    public static double average (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        return average;
    }
}
