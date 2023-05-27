package may25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrtaqKey {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Set<String> commonKeys = findCommonKeys(map1, map2);

        System.out.println("Common keys: " + commonKeys);
    }

    public static Set<String> findCommonKeys(Map<String, Integer> map1, Map<String, Integer> map2) {
        Set<String> keys1 = new HashSet<>(map1.keySet());
        Set<String> keys2 = new HashSet<>(map2.keySet());

        keys1.retainAll(keys2);
        return keys1;
    }
}
