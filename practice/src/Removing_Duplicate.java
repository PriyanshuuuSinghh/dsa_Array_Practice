import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
public class Removing_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,3,6,5,3,4,5};
        Arrays.sort(arr);
//        for(int i =0 ; i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]){
//                System.out.println(arr[i]+" ");
//            }
//        }
//        System.out.print(arr[arr.length - 1]);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            set.add( arr[i]);


        }
        System.out.println("Unique element  = "+ set);
    }
}
