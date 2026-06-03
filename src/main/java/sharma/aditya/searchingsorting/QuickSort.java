package sharma.aditya.searchingsorting;

import java.util.Arrays;

public class QuickSort {
    // n(log(n))
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, 5, 7, 9, 1, 7};
        int low = 0;
        int high = arr.length - 1;
        int [] answer = qs(arr, low, high);
        System.out.println("Sorted Array: "+Arrays.toString(answer));
    }

    private static int[] qs(int[] arr, int low, int high) {
        if(low < high){
            int pivot = findPivot(arr, low, high);
            qs(arr, low, pivot-1);
            qs(arr, pivot+1, high);
        }
        return arr;
    }

    private static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
