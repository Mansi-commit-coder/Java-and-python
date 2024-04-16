/*  here first of all we will take input from user then check 
whether the input value is an alphabet or not !!!!!
*/

import java.util.Scanner;

public class Alphabet {
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any value :");
    char ch = sc.next().charAt(0);
    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
        // to print the user input along with the result you got after the check wether its alp.. or not then you have to put ch+
        System.out.println(ch+ "Its an alphabet");
    }else {
        System.out.print(ch+ " is not an alphabet");
    }
    sc.close();

}
    
}
