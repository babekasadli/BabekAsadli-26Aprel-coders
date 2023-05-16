package May13;

public class task5 {
    public static void main(String[] args) {
        String text = "Hello, world! Today is a beautiful day. Good luck!";

        String capitalizedText = capitalize(text);
        System.out.println(capitalizedText);
    }

    public static String capitalize(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String capitalizedWord = firstChar + word.substring(1);
                result.append(capitalizedWord).append(" ");
            }
        }

        return result.toString().trim();
    }
}
