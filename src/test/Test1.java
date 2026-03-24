package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        System.out.println(sum);
        double average = average(1, 2, 3);
        System.out.println(average);

        sum = sum(15, 25, 35);
        System.out.println(sum);
        average = average(15, 25, 35);
        System.out.println(average);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
