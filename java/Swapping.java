
import java.util.*;
public class Swapping {
 public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers you want to swap : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a;
     a = b;
     b = c;
    System.out.print(a +" " + b);
    sc.close();
 }
    
}
