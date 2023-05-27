package may23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TekrarlanmaSil {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("Original list: " + numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("List after removing duplicates: " + numbers);
    }
}
