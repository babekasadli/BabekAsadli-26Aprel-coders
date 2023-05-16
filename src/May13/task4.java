package May13;

public class task4 {
    public static void main(String[] args) {
        int decimalNumber = 42;
        String binaryNumber = convertToBinary(decimalNumber);

        System.out.println(binaryNumber);
    }

    public static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
}
