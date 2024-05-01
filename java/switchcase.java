import java.util.*;
public class switchcase {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any date you want to check which day it is in january 2023 :");
        int date = sc.nextInt();

        switch(date){
            case 1, 8, 15, 22, 29 :

             System.out.print("Sunday.");
              break;
            case 2, 9, 16, 23, 30 :
             System.out.print("Monday");
              break;
            case 3, 10, 17, 24, 31:
             System.out.print("Tuesday");
              break;
            case 4, 11, 18, 25 :
             System.out.print("Wednsday");
              break;
            case 5, 12, 19, 26 :
             System.out.print("Thrusday");
              break;
            case 6, 13, 20, 27 :
             System.out.print("Friday");
              break;
            case 7, 14, 21, 28:
              System.out.print("Saturday");
               break;
           default:
             System.out.print("Enter any valid number between 1st - 31st only.");
             break;
        }

        sc.close();

    }
    
}
