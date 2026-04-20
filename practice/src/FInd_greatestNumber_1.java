public class FInd_greatestNumber_1 {
    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};

        int ans = larget(arr);
        System.out.println(ans);

    }

    public static int larget(int[]arr){
        int largest=arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

}
