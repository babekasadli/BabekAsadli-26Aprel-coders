package iyun17;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 2, 5, 7, 2, 4, 6, 8};
            int[] longestSubarray = findLongestSequenceSubarray(numbers);
            for (int num : longestSubarray) {
                System.out.print(num + " ");
            }
        }

        public static int[] findLongestSequenceSubarray(int[] numbers){
            List<Integer> longestSubarray = new ArrayList<>();
            List<Integer> currentSubarray = new ArrayList<>();

            for (int num : numbers) {
                if (currentSubarray.isEmpty() || num > currentSubarray.get(currentSubarray.size() - 1)) {
                    currentSubarray.add(num);
                } else {
                    if (currentSubarray.size() > longestSubarray.size()) {
                        longestSubarray = new ArrayList<>(currentSubarray);
                    }
                    currentSubarray.clear();
                    currentSubarray.add(num);
                }
            }

            if (currentSubarray.size() > longestSubarray.size()) {
                longestSubarray = new ArrayList<>(currentSubarray);
            }
            
            int[] longestSubarrayArr = new int[longestSubarray.size()];
            for (int i = 0; i < longestSubarray.size(); i++) {
                longestSubarrayArr[i] = longestSubarray.get(i);
            }

            return longestSubarrayArr;

    }
}

