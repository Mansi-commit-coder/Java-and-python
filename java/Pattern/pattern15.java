/* 
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */

 import java.util.*;
 public class pattern15{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j = i; j<n; j++)
            System.out.print(" ");
            for(int j=0; j<2*i-1; j++)
            System.out.print("*");


            System.out.println();

            
        }
        for(int i =1; i<=n; i++){
            for(int j = 0; j<i; j++)
            System.out.print(" ");
            for(int j=0; j<2*n-(2*i+1); j++)
            System.out.print("*");


            System.out.println();
                
        }

    }
 }