/*coding statement:
 * Write a java program to identify a given alphabet is avowel or consonant
 * vowel::: aeiou, AEIOU
 * take inputs from the user and print the output by checking its a vowel
 *  or consonant
 */



 import java.util.Scanner;

 public class vowels {
     public static void main(String[] arg){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any alphabet:");
         char ch = sc.next().charAt(0);
         
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
             System.out.print("The entered character is a vowel.");
         } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
             System.out.print("The entered character is a consonant.");
         } else {
             System.out.print("You have entered an invalid character." );
         }
         
         sc.close();
     }
 }
 

