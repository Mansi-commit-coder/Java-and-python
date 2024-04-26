/*write the code the fine the fibonacci series
 * 
 * 
 * fibonacci series is nothing its nth term is sum of previous two terms.
 * like 1, 3, 4, 7, 11, 18 this is fibonacci series.
 * so here nth terem is 18
 * so we have to get input from user about nth term and one more thing 
 * the first and second term of the series is 0 and 1
 */

 import java.util.*;
 public class practice{
   public static void main(String[] arg){
      int num, a = 0, b = 0, c = 1;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of term : ");
      num = sc.nextInt();
      System.out.print("The factorial of the given term" +num + "is ");
      for(int i = 1; i<=num; i++ ){
         a = b;
         b = c;
         c = a +b;
         System.out.print(+a+ " ");
      }
      sc.close();


   }
 }