/*
           *
           **
           ***
           ****
           ***
           **
           *
 */

 import java.util.*;

 public class pattern12{
     public static void main(String[] arg){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number :");
         int num = sc.nextInt();
         
         for(int i = 1; i<=num; i++){
             for(int j = 1; j<=i; j++)
             System.out.print("* ");
             System.out.println();
         }
             for(int i = num-1; i>0; i--){
              for(int j = 1; j<=i; j++)
             System.out.print("* ");
             
 
             System.out.println();
         }
 
          
         sc.close();
     }
 }
 