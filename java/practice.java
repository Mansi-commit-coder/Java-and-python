import java.util.*;
public class practice{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i ; j++){
                System.out.print(" ");
            }
        for(int k = i; k>0; k--){
            System.out.print(n);
        }
            System.out.println();
        }
    }
}