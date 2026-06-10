package sharma.aditya.basic_maths;

import java.util.Arrays;

class BasicMathsRunner {
    private static final int NUMBER = 5423;
    public static void main(String[] args) {
        BasicMaths basicMaths = new BasicMaths();
        System.out.println("No of digits in  " + NUMBER+ ": " +basicMaths.countDigits(NUMBER));
        System.out.println("Reverse of "+NUMBER+" is: "+ basicMaths.reverseNumber(NUMBER));
        System.out.println("Is "+NUMBER+ " palindrome :" +basicMaths.isPalindrome(NUMBER));
        System.out.println("GCD of 6 and 4: " +basicMaths.gcd(6,4));
        System.out.println("Is " +NUMBER + " Armstrong : " +basicMaths.isArmstrong(NUMBER));
        System.out.println("Divisors of 24: "+ Arrays.toString(basicMaths.divisors(24)));
        System.out.println("Is "+NUMBER+" prime :" +basicMaths.isPrime(NUMBER));

    }

}
