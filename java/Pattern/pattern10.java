/*
 
           ******
            ******
             ******
              ******
 */

 import java.util.*;

public class pattern10 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i<= row; i++){
            for(int j = 1; j<=i; j++)
            System.out.print(" ");
        for(int k = 1; k<= col; k++)
            System.out.print("* ");
            System.out.println();
        }
    }
    
}
