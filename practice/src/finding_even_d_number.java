//Input: nums = [12,345,2,6,7896]
//Output: 2

public class finding_even_d_number {
    public static void main(String[] args) {
        int arr[]={2,44,5,6,7456,8};
        int ans=findingNumber(arr);
        System.out.println(ans);

    }
    public static int findingNumber(int[] nums){
        int evenCount=0;
        for( int i = 0; i<nums.length;i++){
            int digitCount=0;
            int digit=nums[i];
            while(digit>0){
                digitCount++;
                digit=digit/10;
            }
            if(digitCount % 2==0){
                evenCount++;
            }

        }
        return evenCount;

    }
}
