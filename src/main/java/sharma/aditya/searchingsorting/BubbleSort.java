package sharma.aditya.searchingsorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] data = {9, 2, 5, 1, 7};
        int [] sortedArray = bubbleSort(data);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    private static int[] bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
