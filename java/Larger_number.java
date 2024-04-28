import java.util.*;


public class Larger_number {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first, second and third number : ");
       
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.print(num1 +" is greater");

        }else if(num2 >= num1 && num2 >= num3){
            System.out.print(num2 +" is greater");
        }else{
            System.out.print(num3 +" is greater");
        }
        sc.close();

    }
    
}
