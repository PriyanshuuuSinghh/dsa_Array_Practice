import java.util.Arrays;
import java.util.Collections;
public class Sorting_an_arr {
    public static void main(String[] args) {
        Integer[] arr = {2, -1, 4, 3};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
          Arrays.sort(arr,1,3);

        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }

          Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}
