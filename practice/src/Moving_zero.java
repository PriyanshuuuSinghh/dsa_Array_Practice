import java.util.Arrays;

public class Moving_zero {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0 ;j<arr.length-1;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


        }
       System.out.println(Arrays.toString(arr));
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//       if(arr[i] != 0){
//        arr[count] = arr[i];
//        count++;
//    }
//}
//
//       while(count < arr.length){
//       arr[count] = 0;
//      count++;
//}
 }
}
