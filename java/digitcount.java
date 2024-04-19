// here we have to count the given number have how many digits

import java.util.*;
public class digitcount{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print( "Enter the number you want to count the digit in it :");
        int number = sc.nextInt();

        while(number > 0){
            number = number/10;
            count++;
        }
        System.out.println("enterd number have " + count + " digits");

        sc.close();

        
        



    }
}