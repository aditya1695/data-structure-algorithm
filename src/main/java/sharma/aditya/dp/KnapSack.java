package sharma.aditya.dp;

import java.util.Arrays;

public class KnapSack {

    public static void main(String[] args) {
        int[] value = {10, 40, 30, 50};
        int[] weight = {5, 4, 2, 3};
        int maxWeight = 5;
        System.out.println("Maximum values(Optimised): " +findItems(value, weight, maxWeight));
        System.out.println("Maximum values(Recursively): " +solveRecursivelyKnap(weight, value,weight.length-1 ,maxWeight));
        System.out.println("Maximum values(Tabulation): " +solveTabKnap(weight,value, weight.length, maxWeight));
    }

    private static int solveTabKnap(int[] weights, int[] values, int index, int capacity){
        int [][]dp = new int[index][capacity+1];

        for(int w = 0; w <= capacity; w++) {
            if (weights[0] <= w) dp[0][w] = values[0];
            else dp[0][w] = 0;
        }
        for(int i = 1; i < index; i++ ){
            for(int w = 0; w <= capacity; w++){
                int include = 0;
                if(weights[i] <= w){
                    include = values[i] + dp[i - 1][w-weights[i]];
                }
                int exclude = dp[i-1][w];
                dp[i][w] = Math.max(include, exclude);
            }
        }
        return dp[index-1][capacity];
    }
    private static int solveRecursivelyKnap(int[] weights, int[] values, int index, int capacity){
        if (index == 0)
            return (weights[index] <= capacity) ? values[index] : 0;
        int include = 0;
        if(weights[index] <= capacity)
            include = values[index] + solveRecursivelyKnap(weights, values, index - 1, capacity - weights[index]);
        int exclude = solveRecursivelyKnap(weights, values, index - 1, capacity);

        return Math.max(include, exclude);
    }

    private static int findItems(int[] value, int[] weight, int maxWeight) {
        int n = weight.length;
        int currValue = 0;
        int totalValue = 0;
        int weightLeft = maxWeight;
        for (int i = 0; i < n; i++) {
            if (weight[i] <= maxWeight && currValue <= value[i]) {
                currValue = Math.max(value[i], currValue);
                if(weightLeft == 0){
                    weightLeft = maxWeight - weight[i];
                    totalValue += currValue;
                }
                else{
                    totalValue += currValue;
                    weightLeft = weightLeft - weight[i];
                }
            }
        }
       return totalValue;
    }
}
