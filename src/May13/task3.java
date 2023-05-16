package May13;

public class task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 4, 2, 4, 4};

        int result = MostRepeatedNumber(array);
        System.out.println("Most repeated number: " + result);
    }

    public static int MostRepeatedNumber(int[] array) {
        int result = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = array[i];
            }
        }

        return result;
    }
}
