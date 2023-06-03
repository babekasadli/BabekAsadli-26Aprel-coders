package iyun3;

import java.util.stream.Stream;
public class FindLongestString {
    public static void main(String[] args) {
        String str = "I'm trying hard to learn Java. Because I'm not familiar with the syntax.";
        String longestWord = Stream.of(str.split(" "))
                .max((s1, s2) -> s1.length() - s2.length())
                .get();
        System.out.println(longestWord);
    }
}
