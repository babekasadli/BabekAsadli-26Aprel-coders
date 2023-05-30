package may30;

public class FindMax {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,20,35,66,15};
        Integer maxInt = findMax(intArr);
        System.out.println("Max int: " + maxInt);
    }
}
