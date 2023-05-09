import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean found = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) { //Yoxlama
                found = true;
                break;
            } else if (arr[i] < number) { //Ozunden kicik olan en boyuk ededi tapir
                index++;
            }
        }

        if (!found) {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < index; i++) { //Ilkin dovreni kocurme
                newArray[i] = arr[i];
            }
            newArray[index] = number; //Daxiletme
            for (int i = index; i < arr.length; i++) { //Dovrenin davami
                newArray[i+1] = arr[i];
            }
            arr = newArray;
        }

        System.out.print("New array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
