import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
//         swap(arr,3,2);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] arr,int index1 ,int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[]arr,int start,int end){
         start=0;
         end=arr.length-1;
         while(start<=end){
             swap(arr,start,end);
             start++;
             end--;
         }

    }
}
