/*
           ****
            ****
             ****
              **** 
 */

import java.util.*;
public class pattern7 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no  :");
        int n = sc.nextInt();
    for(int i= 1; i<=n; i++){ 
      for(int j = 1; j<=i; j++){       
        System.out.print(" ");
      }      
      for(int j =1; j<=n; j++){
        System.out.print("* ");
      }
      System.out.println();
        }
        sc.close();
    }
    
}
