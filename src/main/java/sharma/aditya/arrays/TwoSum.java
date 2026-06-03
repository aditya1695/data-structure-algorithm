package sharma.aditya.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    /*
    Given an array of integers and a target value, return the indices of two numbers
    such that they add up to the target.
    Example:
    numbs = [2,7,11,15]
    target = 9
    Output: [0,1]
    */
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15, 16};
        int targetSum = 18;
//        int [] answer = fundTwoSum(arr, targetSum);
//        System.out.println(Arrays.toString(answer));

        for(int[] element : findPairsOfSum(arr,targetSum)){
            System.out.println(Arrays.toString(element));
        }

    }

    private static int[] fundTwoSum(int[] arr, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int k = targetSum - arr[i];
            if(map.containsKey(k)){
                return new int[]{map.get(k), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    private static List<int[]> findPairsOfSum(int[] arr, int targetSum){
        List<int[]> answers = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = targetSum - arr[i];
            if(map.containsKey(sum)){
                answers.add(new int []{sum, arr[i]} );
            }
            map.put(arr[i], i);
        }

        return answers;
    }
}
