package May9;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int a = random.nextInt(100);
            System.out.println(a);
            if (a==number) {
                System.out.println("Tahmin dogru: "+a);
            }
        }
    }
}
