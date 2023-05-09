public class polindron {
    public static void main(String[] args) {
        String a="AbccbA";
        char[] arr = a.toCharArray();
        boolean result=false;
        for (int i = 0,j= arr.length-1; i < arr.length&& j>0; i++,j--) {
            if(arr[i]==arr[j]){
                result=true;
            }
            else {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
