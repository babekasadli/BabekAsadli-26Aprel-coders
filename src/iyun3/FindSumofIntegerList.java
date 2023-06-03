package iyun3;

import java.util.stream.IntStream;

public class FindSumofIntegerList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = IntStream.of(array).sum();
        System.out.println(sum);
    }
}
