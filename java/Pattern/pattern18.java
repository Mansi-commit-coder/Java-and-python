/*
A 
A B
A B C 
A B C D
A B C D E
A B C D E F
A B C D E F G
A B C D E F G H


 */

import java.util.*;
public class pattern18 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++){
            for(char ch='A'; ch<='A' + i; ch++){
            System.out.print(ch+ " ");
            
        }
            System.out.println();
        }
        sc.close();

    }
    
}
