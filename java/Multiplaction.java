import java.util.*;
public class Multiplaction {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number you want to get the table  : ");

        int number = sc.nextInt();
        
        for(int a = 1; a<= 10; a ++){
            int table = number * a;
            System.out.print(number + "*" + a + " = " + table + " \n");

        }
        sc.close();
    }
    
}
