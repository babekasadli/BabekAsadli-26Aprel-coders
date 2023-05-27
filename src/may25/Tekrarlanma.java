package may25;

import java.util.HashMap;
import java.util.Map;

public class Tekrarlanma {
    public static void main(String[] args) {
        String input = "This is an example text to find the most frequently used letter.";
        char mostFrequentLetter = findMostFrequentLetter(input);
        System.out.println("En chox tekrarlanan herf: " + mostFrequentLetter);
    }

    public static char findMostFrequentLetter(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char mostFrequentLetter = ' ';
        int maxCount = 0;

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                continue;
            }
            char lowerC = Character.toLowerCase(c);
            charCountMap.put(lowerC, charCountMap.getOrDefault(lowerC, 0) + 1);
            if (charCountMap.get(lowerC) > maxCount) {
                maxCount = charCountMap.get(lowerC);
                mostFrequentLetter = lowerC;
            }
        }
        return mostFrequentLetter;
    }
}
