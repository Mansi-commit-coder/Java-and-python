
/*
 
           ******
           ******
           ******
           ******
 */

 import java.util.*;

public class pattern8 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and column :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++)
            System.out.print("* ");
            for(int k = 1; k <= col; k++)
            System.out.print("* ");
            System.err.println();
        }
        sc.close();
    }
    
}
