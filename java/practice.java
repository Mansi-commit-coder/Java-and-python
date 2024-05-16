import java.util.*;
public class practice{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no . : ");
    int num = sc.nextInt();
     int reverse = 0;
     int dup= num;
    while(num>0){
      int id = num%10;
      reverse =(reverse *10)+id;
      
      num = num/10;
      
    }
    if(dup == reverse){
      System.out.print("its palindrome.");
    }
    else{
      System.out.print("its not palindrome.");

    }
    
    sc.close();
  }
}