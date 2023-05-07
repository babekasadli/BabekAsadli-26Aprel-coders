import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        boolean result=false;
        for (int i = 2; i < array.length; i++) {
            if(array[i]==array[i-2]+array[i-1]){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
}
