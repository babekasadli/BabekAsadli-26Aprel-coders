package may23;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CountNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);

        Map<Integer, Integer> numberCount = countNumbers(numbers);

        // Print the count of each number
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.println(number + " occurs " + count + " times.");
        }
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> numbers) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        for (int number : numbers) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        return numberCount;
    }
}
