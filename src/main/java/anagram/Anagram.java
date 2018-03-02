package anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram1(String input1, String input2) {
        String clearedInput1 = input1.replaceAll("[\\W]|_| ", "").toLowerCase();
        String clearedInput2 = input2.replaceAll("[\\W]|_| ", "").toLowerCase();
        char[] arr1 = clearedInput1.toCharArray();
        char[] arr2 = clearedInput2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sorted1 = String.valueOf(arr1);
        String sorted2 = String.valueOf(arr2);

        return sorted1.equals(sorted2);
    }

    public boolean isAnagram2(String input1, String input2) {
        String clearedInput1 = input1.replaceAll("[\\W]|_| ", "").toLowerCase();
        String clearedInput2 = input2.replaceAll("[\\W]|_| ", "").toLowerCase();
        Map<Character, Integer> charMap1 = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();

        for (char c : clearedInput1.toCharArray()) {
            int counter = charMap1.get(c) == null ? 0 : charMap1.get(c);
            charMap1.put(c, ++counter);
        }

        for (char c : clearedInput2.toCharArray()) {
            int counter = charMap2.get(c) == null ? 0 : charMap2.get(c);
            charMap2.put(c, ++counter);
        }

        if (charMap1.keySet().size() != charMap2.keySet().size()) {
            return false;
        }

        for (char c : charMap1.keySet()) {
            if (charMap1.get(c) != charMap2.get(c)) {
                return false;
            }
        }

        return true;
    }
}
