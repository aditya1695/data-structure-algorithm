package sharma.aditya.searchingsorting;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 9;
        int answerIndex = searchTarget(nums, target);
        System.out.println(answerIndex);
    }

    private static int searchTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if(nums[left] > target || nums[right] < target) return -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
