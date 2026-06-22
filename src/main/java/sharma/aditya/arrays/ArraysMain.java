package sharma.aditya.arrays;

import sharma.aditya.util.RandomNumberGenerator;

public class ArraysMain {

    public static void main(String[] args) {
        int [] arr = {5, 4, 7, 2, 1};
        KthLargest largest = new KthLargest();
        int  k = RandomNumberGenerator.getRandomNumber(1, arr.length-1);
        int answer = largest.findKthLargest(arr, k);
        System.out.println("Largest " +k+ "th element: "+ answer);
    }
}
