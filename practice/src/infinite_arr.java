public class infinite_arr {
//    public int SearchKey(int arr[], int key){
////        int key = arr[0];
////        using linear search
//        for(int i = 0; i<arr.length ; i++){
//            if(arr[i]==key){
//                return i;
//            }
//
//        }
//
//
//        return -1;
//
//    }



//    using binary search
//    public static int Search(int []arr, int target){
//        int start =0 ;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid -1;
//            } else if (target>arr[mid]) {
//                start= mid+1;
//
//            }else {
//                return mid;
//            }
//
//        }
//         return -1;
//    }

//    using efficient binary search method
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,23,34,65,};
    int target =23;
    int ans = searchRange(arr,target);
    System.out.println(ans);
}


    static int searchRange(int arr[], int target){
        int start =0;
        int end = 1;

        while(target>arr[end]){
            int newStart= end+1;
             end = end+(end-start+1)*2;
             start=newStart;

        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int arr[],int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else{
                return mid;
            }
        }
        return -1;

    }
}
