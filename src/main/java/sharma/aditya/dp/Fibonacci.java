package sharma.aditya.dp;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int series_length = 10;

        System.out.println("Fibonacci series using loop: ");
        generateUsingLoop(series_length);

        System.out.println("\nFibonacci series using recursion: ");
        for (int i = 0; i < series_length; i++) {
            System.out.print(generateUsingRecursion(i) + " ");
        }

        System.out.println("\nFibonacci series using memoization: ");
        generateUsingDP(series_length);
    }

    private static void generateUsingDP(int seriesLength) {
        int[] dp = new int[seriesLength];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < seriesLength; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        System.out.println(Arrays.toString(dp));
    }

    private static int generateUsingRecursion(int n) {
        if (n <= 1) return n;
        return generateUsingRecursion(n - 1) + generateUsingRecursion(n - 2);
    }

    private static void generateUsingLoop(int seriesLength) {
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 0; i < seriesLength / 2; i++) {
            System.out.print(firstTerm + " " + secondTerm + " ");
            firstTerm = firstTerm + secondTerm;
            secondTerm = firstTerm + secondTerm;
        }
    }
}
