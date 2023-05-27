package may20;

public class ReverseStringRecurcion {
    public static void main(String[] args) {
        String result = reverse("Republic of Azerbaijan");
        System.out.println(result);
    }
    public static String reverse(String text){
        if(text==null || text.length() <= 1){
            return text;
        }else{
            return reverse(text.substring(1)) + text.charAt(0);
        }

    }
}
