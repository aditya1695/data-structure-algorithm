package sharma.aditya.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {
    //{2,1,4,5} k = 2 | ans = 4
    protected int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Arrays.stream(arr).forEach(num -> {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        });

        return !minHeap.isEmpty() ? minHeap.peek() : -1;
    }
}
