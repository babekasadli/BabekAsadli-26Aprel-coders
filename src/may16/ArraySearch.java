package may16;

public class ArraySearch {
    public static boolean binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return true;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        boolean isKeyPresent = binarySearch(arr, key);
        System.out.println("Açar massivdə " + (isKeyPresent ? "tapıldı" : "tapılmadı"));
    }
}
