package iyun3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class OnlyEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 15)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
