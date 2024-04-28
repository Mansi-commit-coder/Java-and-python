import java.util.*;
public class fibonacci {
    public static void main(String[] arg){
        int num , a=0, b=0, c=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = sc.nextInt();
        System.out.print("Fibonacci series till " +num+ " is ");

        for(int i = 1; i <= num; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");



        }



sc.close();
    }
    
}
