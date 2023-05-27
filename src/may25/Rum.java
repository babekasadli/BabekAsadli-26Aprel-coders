package may25;

import java.util.HashMap;
import java.util.Map;

public class Rum {
    public static void main(String[] args) {
        int number = 1234;
        String romanNumber = convertToRoman(number);
        System.out.println("Roman numeral representation of " + number + " is: " + romanNumber);
    }

    public static String convertToRoman(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Invalid number. Roman numerals are in the range of 1 to 3999.");
        }

        Map<Integer, String> romanSymbols = new HashMap<>();
        romanSymbols.put(1000, "M");
        romanSymbols.put(900, "CM");
        romanSymbols.put(500, "D");
        romanSymbols.put(400, "CD");
        romanSymbols.put(100, "C");
        romanSymbols.put(90, "XC");
        romanSymbols.put(50, "L");
        romanSymbols.put(40, "XL");
        romanSymbols.put(10, "X");
        romanSymbols.put(9, "IX");
        romanSymbols.put(5, "V");
        romanSymbols.put(4, "IV");
        romanSymbols.put(1, "I");

        StringBuilder romanBuilder = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanSymbols.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (number >= value) {
                romanBuilder.append(symbol);
                number -= value;
            }
        }

        return romanBuilder.toString();
    }
}
