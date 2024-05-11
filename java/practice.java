import java.util.*;
public class practice{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. ");
    int n = sc.nextInt();
    for(int i= 0; i<=n; i++){ 
      for(int j = 0; j<=i; j++){            
        System.out.print((char)('A'+i)+ " ");
      } 
      
      
      System.out.println();
    }
     

     
  }
}