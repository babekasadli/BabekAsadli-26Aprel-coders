public class saatBucaq {
    public static void main(String[] args) {
        float saat = 13;
        float deq = 45;
        float saatBucaq = 30;
        float deqBucaq = 6;
        float result = deq*deqBucaq-(saat-12)*(saatBucaq+(deq/2));
        if(result>180){
            result-=180;
        }
        System.out.println(result);
    }
}
