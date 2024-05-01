/*
           ****
          ****
         ****
        ****
 */

 import java.util.*;

public class pattern4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and colunn : ");
        int rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = rows; j>i; j--)
            System.out.print(" ");
            for(int j = 0; j<rows; j++)
            System.out.print("* ");
            System.out.println();

        }
		
		
		
        sc.close();
    }
    
}
