package may16;

import java.util.Scanner;

public class romb {
    public static void main(String[] args) {
        int a;
        String symbol = "\s";
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        String output;
        for (int i = 0; i < a; i++) {
            output = symbol.repeat(a-i);
            System.out.println(output + "*" + output);

        }
    }
}
