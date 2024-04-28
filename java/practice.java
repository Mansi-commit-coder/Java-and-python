import java.util.*;
public class practice{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b , c : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a>= b && a>= c){
            System.out.print(a+" a is greater.");

        }else if(b>=a && b>=c){
            System.out.print(b+ " b is greater");
        }else{
            System.out.print(c+ " c is greater");
        }
        sc.close();
    }
}