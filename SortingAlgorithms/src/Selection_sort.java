import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int []arr){
        for(int i = 0 ; i<arr.length ; i++){
            int last = arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
            swap(arr,maxIndex,last);


        }


    }


    public static  int getMaxindex(int []arr,int start,int end){
        int  max = start;
        for(int  i = start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int start, int end){
        int temp=arr[start];
        arr [start]=arr[end];
        arr[end]=temp;

    }
}
