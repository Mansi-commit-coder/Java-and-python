import java.util.Scanner;

public class largest_num_secondway {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first, second and third number : ");
       
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = Math.max(num3, (Math.max(num1, num2)));
        System.out.print(max + " is greater");
        sc.close();
    
}
}
