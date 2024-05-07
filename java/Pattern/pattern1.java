/*

*
**
***
****
*****
******


 */

import java.util.*;
public class pattern1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number og terms you want to print : ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
         for(int j =1; j<= i; j++)
        System.out.print("* ");
        System.out.println();}
        

        
        sc.close();
    }
    
}
