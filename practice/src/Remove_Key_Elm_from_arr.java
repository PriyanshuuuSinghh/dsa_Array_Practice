public class Remove_Key_Elm_from_arr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,5,5,6,7,8};
        int key = 5;
        int temp[]=new int[arr.length];
        int j=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=key){
                temp[j]=arr[i];
                j++;

            }

        }
        System.out.println("Array after removing key ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
