package may23;
import java.util.ArrayList;
public class SortTask {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Merge and sort the ArrayLists
        ArrayList<Integer> mergedList = mergeSortedLists(list1, list2);

        // Print the merged and sorted ArrayList
        for (Integer number : mergedList) {
            System.out.println(number);
        }
    }

    public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add any remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
