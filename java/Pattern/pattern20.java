
/*
A 
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
H H H H H H H H

 */
import java.util.Scanner;
public class pattern20 {
    

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter no . : ");
    int n = sc.nextInt();
  
    
    for(int i=0; i<=n; i++){
      for(int j = 0; j <=i; j++)
      System.out.print((char)('A'+i));
    
  System.out.println();}

  
  }
}