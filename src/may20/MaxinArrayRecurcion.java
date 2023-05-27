package may20;

public class MaxinArrayRecurcion {
    public static void main(String[] args) {
        int[]arr= {5, 3, 65, 12, 4, 23, 6, 9};
        int result = findMax(arr, arr.length-1);
        System.out.println(result);
    }
    public static int findMax(int arr[],int index){
        if(index==0){
            return arr[0];
        }
        else {
            return Math.max(arr[index],findMax(arr,index-1));
        }
    }
}
