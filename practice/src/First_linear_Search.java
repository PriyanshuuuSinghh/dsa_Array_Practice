public class First_linear_Search {

//    Input: arr[] = [3, 5, 7, 2, 6, 10], target = 7
//    Output: Is 7 present in the array: true

    public static void main(String[] args) {
         int arr[] = {3, 5, 7, 2, 6, 10};

         boolean ans = IsElement(arr,7);
        System.out.println(ans);


    }

    public static boolean IsElement(int[]arr,int target){

//        for(int  i = 0; i<arr.length;i++){
//            if(target == arr[i]){
//                return true;
//
//            }
//
//        }

        //using enhanced for loop

        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;

    }
}
