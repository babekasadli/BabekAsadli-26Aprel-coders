import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        int[] symbolCount = new int[256];

        for (int i = 0; i < characters.length; i++) {
            char a = characters[i];
            symbolCount[Character.toUpperCase(a)]++;
        }
        for (int i = 0; i < symbolCount.length; i++) {
            if (symbolCount[i] > 0) {
                System.out.print((char) i + "-" + symbolCount[i] + " ");
            }
        }
    }
}
