package May13;

public class task2 {
    public static void main(String[] args) {
        String text = "Hello, world! Today is a beautiful day. Good luck!";

        String longestWord = findLongestWord(text);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

}
