package sharma.aditya.dp;

import java.util.Arrays;

public class MinimumNumberOfCoins {

    public static void main(String[] args) {
        int [] coins = {1, 2, 5};
        int value = 11;
        int answer = solveRecursively(coins, value);
        System.out.println("Minimum Number of coins(Recursively): " +((answer == Integer.MAX_VALUE) ? -1 : answer));
        System.out.println("Minimum Number of coins(Tabulation): " +solveTabulation(coins, value));
    }

    private static int solveTabulation(int[] coins, int V) {
        int[] dp = new int[V + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= V; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[V] == Integer.MAX_VALUE ? -1 : dp[V];
    }

    private static int solveRecursively(int[] coins, int value) {
        if(value == 0) return 0;
        if(value < 0) return Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = solveRecursively(coins, value - coin);
            if(res != Integer.MAX_VALUE){
                minValue = Math.min(minValue, 1 + res);
            }
        }
        return minValue;
    }
}
