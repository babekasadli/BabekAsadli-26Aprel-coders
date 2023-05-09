import java.lang.StringBuilder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(Integer.toString(array[i], 3) + " ");
        }
    }
}