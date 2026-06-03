package sharma.aditya.arrays;

public class SlidingWindow {
    /*Find the maximum sum of any subarray of size k.
    Input
    arr = [2,1,5,1,3,2] k = 3
    Output 9
    */
    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2, 9};
        int k = 3;
        System.out.println(findMaxSubArraySum(arr, k));
    }

    private static int findMaxSubArraySum(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int sum = windowSum;
        for (int i = k; i < arr.length; i++) {
           windowSum = windowSum + arr[i] - arr[i-k];
           sum = Math.max(sum, windowSum);
        }
        return sum;
    }
}
