/*
A B C D E F
A B C D E 
A B C D
A B C
A B
A


 */

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();

        for(int i =1; i<= n; i++){
            for(char ch = 'A'; ch<='A'+(n-i-1); ch++)
            System.out.print(ch + " ");
            System.out.println();
        }
    }
    
}
