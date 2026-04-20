
import java.util.Arrays;
import java.util.Scanner;

public class Equal_arr {
    public void check(int a[], int b[]){
        boolean result = true;
        if(a.length==b.length){
            for(int i = 0 ;i<a.length ; i++){
                if (a[i] != b[i]) {
                    result = false;
                    break;
                }
            }
        }else{
            result = false;
        }
        if(result){
            System.out.println("Arr is Equal");
        }else{
            System.out.println("Arr is not Equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter  elemnt in first arr");
        int n = sc.nextInt();
        for( int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[5];
        System.out.println("Enter  elemnt in Second arr");
        int m = sc.nextInt();
        for(int j = 0 ; j<5 ; j++){
            arr1[j]=sc.nextInt();
        }
//        Equal_arr obj = new Equal_arr();
//        obj.check(arr, arr1);

        boolean r = Arrays.equals(arr,arr1);
        if(r){
            System.out.println("equal");
        }else {
            System.out.println("Not Equal");
        }

//        using collections






    }

}

