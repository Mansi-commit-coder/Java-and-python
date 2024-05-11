/*
      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
ABCDEFGFEDCBA
 */


import java.util.*;

public class pattern22 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. :");
        int n = sc.nextInt();
          for(int i=1;i<=n; i++){
              for(int j=1;j<=n-i;j++){
                  System.out.print( " ");
    
                 
            }
            // Printing characters in increasing order
            for (int j = 1; j <= i; j++) {
              System.out.print((char) (64 + j));
          }
    
          // Printing characters in decreasing order
          for (int j = i - 1; j >= 1; j--) {
              System.out.print((char) (64 + j));
          }
    
            System.out.println();
        }
    }
    
}
