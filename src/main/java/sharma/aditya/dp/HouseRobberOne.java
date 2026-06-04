package sharma.aditya.dp;

public class HouseRobberOne {

    public static void main(String[] args) {
        int[] houses = {2, 3, 2, 1, 5};
        //                0  1  2  3  4
        System.out.println("Maximum Amount Robbed: " + robHouse(houses));
        System.out.println(robHouseOptimised(houses));
    }

    private static int robHouse(int[] houses) {
        int n = houses.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = houses[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(houses[i - 1] + dp[i - 2], dp[i - 1]);
        }
        return dp[n];
    }

    private static int robHouseOptimised(int[] houses) {
        int prevHouse = 0;
        int currentHouse = houses[0];
        int answer;
        for (int i = 1; i < houses.length; i++) {
            answer = Math.max(houses[i] + prevHouse, currentHouse);
            prevHouse = currentHouse;
            currentHouse = answer;
        }
        return currentHouse;
    }
}
