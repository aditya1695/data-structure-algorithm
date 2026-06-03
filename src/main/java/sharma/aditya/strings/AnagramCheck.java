package sharma.aditya.strings;

import java.util.HashMap;

public class AnagramCheck {

    public static void main(String[] args) {
        String str = "anagram";
        String otherStr = "loggias";
        System.out.println(checkAnagram(str, otherStr));
    }

    //Can also be easily done by sorting
    private static boolean checkAnagram(String str, String otherStr) {

        if(str.length() != otherStr.length()) return false;

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.merge(ch, 1, Integer::sum);
        }

        for (char ch : otherStr.toCharArray()) {
            Integer count = frequencyMap.get(ch);

            if (count == null || count == 0) {
                return false;
            }

            frequencyMap.put(ch, count - 1);
        }
        return true;
    }
}
