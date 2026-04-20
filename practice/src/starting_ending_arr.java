import java.util.Arrays;

public class starting_ending_arr {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
//  Input: nums = [5,7,7,8,8,10], target = 8
//          Output: [3,4]
        System.out.println(Arrays.toString(find(arr,7)));
    }


    public static int[] find(int []arr,int target){
        int start=-1;
        int end=-1;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]== target){
                if(start==-1){
                    start=i;
                }
                end=i;

            }
        }

        return new int[]{start, end};
    }





}
