import java.util.*;

public class pattern24{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 1; j <= n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= i+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}