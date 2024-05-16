import java.util.Scanner;

public class palindrome {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. :");
        int n = sc.nextInt();
        int reverse = 0;
         int dup = n;
        while(n>0){
            int num = n%10;
            reverse = (reverse *10)+ num;
            n = n/10;
        }
        if(dup == reverse){
            System.out.print("Its Palindrom number");
        }else{
            System.out.print("Its not Palindrom number");

        }

    }
    
}
