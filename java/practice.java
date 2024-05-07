/*
* 
   *
   * *
   * * * 
   * * * * 
   * * * * *
   * * * *
   * * *
   * *
   *
          


    

 */
import java.util.*;
public class practice{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number :");
       
        int n = sc.nextInt();
        int space = 2*n-1;
        
        for(int i = 1; i<=n; i++){
          for(int j=1; j<= i; j++)
            System.out.print(j);
            for(int j = 1;j<=space;j++)
              System.out.print(" ");
          for(int j =i; j>=1; j-- )
            System.out.print(j);
        System.out.println();
        space -=2;
      }

       
       sc.close();
    }
}