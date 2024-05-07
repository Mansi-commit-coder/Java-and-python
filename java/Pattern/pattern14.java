/*
1 
2 2
3 3 3 
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7



 */

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        for(int i=0; i<= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");

            }
            System.out.println();

        }
        sc.close();
        
        

    }
    
}
