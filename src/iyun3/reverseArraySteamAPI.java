package iyun3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArraySteamAPI {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = IntStream.range(0, array.length)
                .map(i -> array[array.length - i - 1])
                .toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}
