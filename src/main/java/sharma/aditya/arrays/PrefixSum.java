package sharma.aditya.arrays;

public class PrefixSum {
    /*
    arr = [1,2,3,4,5]
    query = sum(1,3)
    */
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] prefixSumArray = new int[arr.length];
        prefixSumArray[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefixSumArray[k] = prefixSumArray[k-1] + arr[k];
        }
        int query = findSum(prefixSumArray,1,3);
        System.out.println(query);
    }

    private static int findSum(int[] prefixSumArray, int i, int j)
    {

        return (i==0) ? prefixSumArray[j] : (prefixSumArray[j]-prefixSumArray[i-1]);
    }
}
