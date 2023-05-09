import java.util.Scanner;

public class arrayDiaqonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = scanner.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i + j >= a-1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
