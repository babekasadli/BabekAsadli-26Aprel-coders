package may30;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new PairImpl<>("admin", 42353252);
        String key = pair.getKey();
        Integer value = pair.getValue();
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

class PairImpl<K, V> implements Pair<K, V>{
    private final K key;
    private final V value;

    public PairImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
