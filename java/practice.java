import java.util.*;

public class practice{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int num = sc.nextInt();
        for(int i = 1; i <= num/2; i++){
            for(int j = num/2; j>= i; j--)
                System.out.print("  ");
            
            for(int k = 1; k<= (2*i-1); k++)
                System.out.print("* ");
                System.out.println();
        }

        for(int i = num/2+ 1; i<=num; i++){
            for(int j = num/2+1; j<i; j++)
            System.out.print("  ");

            for(int k = 2*(num-i)+1; k>=1; k--)
            System.out.print("* ");
            System.out.println();
        }

         
        sc.close();
    }
}
