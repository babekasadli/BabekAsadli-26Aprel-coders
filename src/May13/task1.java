package May13;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] intersection = findIntersection(array1, array2);
        int[] union = findUnion(array1, array2);

        System.out.println("Kesishme: ");
        printArray(intersection);
        System.out.println("Birleshme: ");
        printArray(union);
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        int[] intersection = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersection[index++] = array1[i];
                    break;
                }
            }
        }

        if (index < intersection.length) {
            int[] temp = new int[index];
            System.arraycopy(intersection, 0, temp, 0, index);
            intersection = temp;
        }

        return intersection;
    }

    public static int[] findUnion(int[] array1, int[] array2) {
        int[] union = new int[array1.length + array2.length];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            union[index++] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[index++] = array2[i];
            }
        }

        if (index < union.length) {
            int[] temp = new int[index];
            System.arraycopy(union, 0, temp, 0, index);
            union = temp;
        }

        return union;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

