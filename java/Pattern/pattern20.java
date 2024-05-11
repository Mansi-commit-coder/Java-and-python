
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
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. ");
        int n = sc.nextInt();

        for(int i =1; i<= n; i++){
            for(int j =i; j<=n; j++)
            if ( j==1 &&  j ==n)
            System.out.print("* ");
            else
            System.out.print("  ");

            System.out.println();
        }
        sc.close();
    }
    
}

