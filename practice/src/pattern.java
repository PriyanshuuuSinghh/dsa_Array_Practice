import java.util.Scanner;

//1 2 3
//2 4 6
//3 6 9
public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3;
        int size = 2*n-1;
        int center = n-1;
        for( int i = 1 ; i<=size; i++){
            for(int j = 1; j<=size; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
