/*
1
01
101
0101
10101
010101
1010101
01010101
101010101
 */
import java.util.*;

public class pattern16 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int start = 1;

        for(int i =1; i<=n; i++){
            if(i%2==0) start = 0;
            else start = 1;
            for (int j = 1; j <=i; j++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
        }

    }

    
}
