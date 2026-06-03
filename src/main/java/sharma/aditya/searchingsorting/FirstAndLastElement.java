package sharma.aditya.searchingsorting;

import java.util.Arrays;

public class FirstAndLastElement {

    public static void main(String[] args) {
         //               0  1  2  3  4  5  6
        int [] numbers = {5, 6, 7, 7, 7, 8, 8, 10};
        int target = 2;
        //sorted array
        int start = findStartIndex(numbers, target);
        int end = findLastIndex(numbers, target);
        int [] answer = {start, end};
        System.out.println(Arrays.toString(answer));
        int occurrence = ((start == -1) && (end == -1)) ? 0 : (end-start+1);
        System.out.println("Number of Occurrence: " + occurrence);
    }

    private static int findLastIndex(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(numbers[mid] == target){
                answer = mid;
                left = mid + 1;
            }
            else if(numbers[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return answer;
    }

    private static int findStartIndex(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(numbers[mid] == target){
                answer = mid;
                right = mid - 1;
            }
            else if(numbers[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return answer;
    }

}
