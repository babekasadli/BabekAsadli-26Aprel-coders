package may20;

public class SumofArrayRecurcion {
    public static void main(String[] args) {
        int[]arr= {5, 3, 65, 12, 4, 23, 6, 9};
        int result = sum(arr, arr.length-1);
        System.out.println(result);
    }
    public static int sum(int[] arr, int index){
        if(index<0){
            return 0;
        }
        else {
            return arr[index]+sum(arr,index-1);
        }
    }
}
