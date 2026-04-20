import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
//
public class Find_Greatest_2 {
    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};

//        using java strams
//        int max= Arrays.stream(arr).max().getAsInt();
//
//        System.out.println(max);


//        using sort
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
}
