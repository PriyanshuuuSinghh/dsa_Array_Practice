
import java.util.Arrays;
import java.util.Collections;

public class Reverse_sort {
    public static void main(String[] args) {
        Integer arr[] = {20, 10, 20, 4, 100};
//        Arrays.sort(arr);
//
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//
//        }

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));




    }

}
