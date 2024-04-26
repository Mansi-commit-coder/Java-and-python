/*here we will find the factorial of any number */



import java.util.Scanner;
public class factorial{
   public static void  main(String[] arg){


      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number :");
      int num = sc.nextInt();
      if (num >= 0) 
      {
         int factorial = findFactorial(num);
         System.out.print("factorial of the given number " + num + " is " + factorial);
      }
      else
      {
         System.out.print("Not possible to find the factorial of negative number.");
      }
      sc.close();
    }
    public static int findFactorial(int num){
         if(num == 0)
         return 1;
         else if( num == 1)
         return 1;
         else 
         return num *findFactorial(num-1);


      }
     

   }