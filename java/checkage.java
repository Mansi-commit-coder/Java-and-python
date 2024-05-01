import java.util.*;
public class checkage{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.print(age + " is adult");
        }else{
            System.out.print(age + " is not an adult");
        }
        sc.close();
    }
}