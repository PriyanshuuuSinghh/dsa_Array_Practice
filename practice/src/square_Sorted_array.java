import java.util.Arrays;

public class square_Sorted_array {
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
       int[] ans= sortedSquares(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquares(int[] arr){
        for(int i =0;i<arr.length;i++){
           arr[i] =arr[i]*arr[i];

        }
        Arrays.sort(arr);
        return arr;
    }


}
