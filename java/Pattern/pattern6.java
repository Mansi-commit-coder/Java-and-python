/*
 
********
*      *
*      *
*      *
*      *
*      *
*      *
********


 */


import java.util.*;
public class pattern6 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) 
				if(i==0 ||  j==0 || i==n-1 || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
        }
    }
    
}
