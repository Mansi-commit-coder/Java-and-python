/*
 
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6


 */

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
