package sharma.aditya.basic_maths;

import java.util.ArrayList;
import java.util.List;

class BasicMaths {
    protected int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    protected int reverseNumber(int n) {
        int rNumber = 0;
        if (n == 0) return 0;
        while (n != 0) {
            int unitDigit = n % 10;
            rNumber = (rNumber * 10) + unitDigit;
            n = n / 10;
        }
        return rNumber;
    }

    protected boolean isPalindrome(int n) {
        int rNumber = reverseNumber(n);
        return rNumber == n;
    }

    protected int gcd(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if(max%min == 0) return min;
        return gcd((max % min), min);
    }

    protected boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while(n != 0) {
            int unitDigit = n % 10;
            n = n / 10;
            sum = (int) (sum + Math.pow(unitDigit, 3));
        }
        System.out.println(sum);
        return sum == original;
    }

    protected int[] divisors(int n) {
        List<Integer> answer = new ArrayList<>();
        int j = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0) answer.add(i);
        }
        answer.add(n);
    return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean isPrime(int n) {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
