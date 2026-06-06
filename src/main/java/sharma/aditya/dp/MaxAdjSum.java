package sharma.aditya.dp;

public class MaxAdjSum {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter length of array: ");
//        int length = scanner.nextInt();
//        int [] arr = new int[length];
//        for(int i = 0; i< length; i++){
//            arr[i] = scanner.nextInt();
//        }
        int[] arr = {2, 1, 5, 7, 9};
        int n = arr.length - 1;
        System.out.println("Maximum Adjacent Sum of array(Recursively): " + solveRecursion(arr, n));
        System.out.println("Maximum Adjacent sum of Array(Tabulation): " + solveAdjSumTabulation(arr, n + 1));
        System.out.println("Maximum Adjacent sum of Array(Space Opt): " + solveSpaceOpt(arr, n + 1));
    }

    private static int solveSpaceOpt(int[] arr, int i) {
        int prevTwo = 0;
        int prevOne = arr[0];
        int answer;
        for (int j = 1; j < i; j++) {
            int include = prevTwo + arr[j];
            int exclude = prevOne;
            answer = Math.max(include, exclude);
            prevTwo = prevOne;
            prevOne = answer;
        }
        return prevOne;
    }

    private static int solveAdjSumTabulation(int[] arr, int index) {
        int[] dp = new int[index];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < index; i++) {
            int include = dp[i - 2] + arr[i];
            int exclude = dp[i - 1];
            dp[i] = Math.max(include, exclude);
        }
        return dp[index - 1];
    }

    private static int solveRecursion(int[] arr, int index) {
        if (index < 0) return 0;
        if (index == 0) return arr[0];
        int include = solveRecursion(arr, index - 2) + arr[index];
        int exclude = solveRecursion(arr, index - 1);
        return Math.max(include, exclude);
    }
}
