package sharma.aditya.strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String sentence = "the sky is blue";
        String [] stringArray = sentence.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = stringArray.length-1; i >= 0; i--) {
            answer.append(stringArray[i]).append(" ");
        }
        System.out.println(answer.deleteCharAt(answer.length()-1));

    }
}
