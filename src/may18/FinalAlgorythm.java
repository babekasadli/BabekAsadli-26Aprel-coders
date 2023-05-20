package may18;

import java.util.Scanner;

public class FinalAlgorythm {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            if (a == 0) {
                System.out.print("Deyer daxil edin: ");
                a = scanner.nextInt();
            } else {
                throw new RuntimeException("Element artiq deyisdirile bilmez!");
            }
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Menimsedildi! a = " + a);

        try {  //Burada tekrar menimsetmeye cehd edilir
            if (a == 0) {
                a = scanner.nextInt();
                System.out.print("Deyer daxil edin: ");
            } else {
                throw new RuntimeException("Element artiq deyisdirile bilmez!");
            }
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("a = "+a);
    }
}
