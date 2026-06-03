package sharma.aditya.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounting {

    /*
    Find the character with the highest frequency.
    Input s = "aabbbcc"
    Output :'b'
    */
    public static void main(String[] args) {

        String str = "aabbbccc";
        char[] characters = str.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : characters) {
            frequencyMap.merge(character, 1, Integer::sum);
        }
        char answer = frequencyMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
        System.out.println("Answer: " + answer);
    }
}
