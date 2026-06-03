package sharma.aditya.strings;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "malayalam";

        System.out.println(isPalindrome(s,0,8));

    }

    private static boolean isPalindrome(String str, int start, int end){
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
