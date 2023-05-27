package may20;

public class FaktorialRekursiya {
    public static void main(String[] args) {
        int result = faktorial(5);
        System.out.println(result);
    }
    public static int faktorial(int a){
        if (a == 0) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }
    }
}
