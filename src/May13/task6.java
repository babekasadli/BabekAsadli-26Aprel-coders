package May13;

public class task6 {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;

        int ebob = ebob(a, b);
        System.out.println(ebob);
    }

    public static int ebob(int a, int b) {
        while (b != 0) {
            int qaliq = a % b;
            a = b;
            b = qaliq;
        }

        return a;
    }
}
