/*
1 
2 3 
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
 */

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. :");
    int N = sc.nextInt();
    int num =1;
     
      for(int i=1;i<=N;i++){
        
          for(int j=1;j<=i;j++){
              System.out.print(num + " ");
              num =num+1;
              
          }

          System.out.println();}
    sc.close();
  
}
    
}
