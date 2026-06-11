public class FindingMajorityElement {

    public static void main(String[] args) {
        int arr[] = {2,2,1,2,1,2,1,2};

        System.out.println(MajorityElement(arr));
    }

    public static int MajorityElement(int arr[]) {
        int majority = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] == majority) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                majority = arr[i];
                count = 1;
            }
        }

        return majority;
    }
}