import java.util.Scanner;

public class Reverse {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int revN = 0;
        while(n>0){
            int num = n%10;
            revN = (revN * 10)+ num;
            n = n/10;
        }
        System.out.print(revN);


        sc.close();

    }
    
}
