package iyun3;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "Classical Mechanics";
        str.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> str.indexOf(i) != str.lastIndexOf(i))
                .distinct()
                .forEach(System.out::println);

    }
}
