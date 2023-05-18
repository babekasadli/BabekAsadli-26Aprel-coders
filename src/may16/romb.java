package may16;

import java.util.Scanner;

public class romb {
    public static void main(String[] args) {
        int a;
        String symbolSpace = " ";
        String symbolStar = "*";
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        String space;
        String star;

        for (int i = 0; i < a; i++) {
            space = symbolSpace.repeat(a - i);
            star = symbolStar.repeat(2 * i + 1);
            System.out.println(space + star);
        }

        for (int i = a - 2; i >= 0; i--) {
            space = symbolSpace.repeat(a - i);
            star = symbolStar.repeat(2 * i + 1);
            System.out.println(space + star);
        }
    }
}
