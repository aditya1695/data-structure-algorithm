package sharma.aditya.searchingsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    //follows divide and conquer approach

    public static void main(String[] args) {
        int [] arr = {12, 10, 19, 22, 8, 15};
        mergeSort(arr, 0, arr.length -1);
        System.out.println("Sorted: "+Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArrays(arr, low, mid, high);
    }

    private static void mergeArrays(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        while(left <= mid) temp.add(arr[left++]);
        while(right <= high) temp.add(arr[right++]);

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }
}
