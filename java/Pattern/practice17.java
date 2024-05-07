/*
1               1
12             21
123           321
1234         4321
12345       54321
123456     654321
1234567   7654321
12345678 87654321
 */

import java.util.Scanner;

public class practice17 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int space = 2*n-1;

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++)
            System.out.print(j+ " ");
            for(int j = 1; j<=space; j++)
            System.out.print(" ");

            for(int j =i; j>=1; j--)
            System.out.print(j+" ");
            System.out.println();
            space -= 2;
        }
        sc.close();
    }
    
}
