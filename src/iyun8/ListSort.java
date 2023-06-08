package iyun8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hii");
        words.add("world");
        words.add("oooooooo");
        words.add("programming");
        words.add("all");
        words.add("computer");

        List<String> filteredWords = words.stream()
                .filter(word -> countDistinctLetters(word) >= 3)
                .sorted((w1, w2) -> Integer.compare(w2.length(), w1.length()))
                .limit(5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered words: " + filteredWords);
    }
    private static int countDistinctLetters(String word) {
        return (int) word.chars().distinct().count();
    }
}
