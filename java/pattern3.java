/*
 

  * * * * * * * * * * * * * * *
    * * * * * * * * * * * * *
      * * * * * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
               * *
                * 
 */

import java.util.*;
public class pattern3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term : ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            //space 
            for(int j = 1; j <=i; j++){
                System.out.print("  ");
            }
            for(int k = 2*(num-i)+1; k>= 1; k-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}