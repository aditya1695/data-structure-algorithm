package sharma.aditya.dp;

import java.util.Scanner;

public class ClimbingStairs {

    public static void main(String[] args) {
        // valid step to climb 1 or 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int numberOfStairs = scanner.nextInt();
        System.out.println("Total no of ways to climb stairs(Recursion): " + climbStairsRecursively(numberOfStairs));
        System.out.println("Total no of ways to climb stairs(Dynamic Programming): " + (climbStairsDynamically(numberOfStairs)));
    }

    private static int climbStairsDynamically(int numberOfStairs) {
        int[] dp = new int[numberOfStairs + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= numberOfStairs; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[numberOfStairs];
    }

    private static int climbStairsRecursively(int numberOfStairs) {
        if (numberOfStairs == 0 || numberOfStairs == 1) return 1;
        return climbStairsRecursively(numberOfStairs - 1) + climbStairsRecursively(numberOfStairs - 2);

    }
}
