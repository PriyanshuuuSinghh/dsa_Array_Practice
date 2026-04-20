import java.util.Arrays;
public class First_Binary_search {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 2, 6, 10};
        boolean ans = IsElement(arr,7);
        System.out.println(ans);

    }

    public static boolean IsElement(int[]arr,int target){
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, target);
        return res >= 0;

        //Binary search Working
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid=start +(end-start)/2;
//            if(target== mid){
//                return true;
//            } else if (target<mid) {
//                start=mid-1;
//
//            }else{
//                start=mid+1;
//            }
//        }
//        return false;


    }

}
