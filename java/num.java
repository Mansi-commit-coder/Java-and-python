/* first take user input and check whether the number is positive or negative */


import java.util.Scanner;

public class num {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want : ");
        double a = sc.nextDouble();

        if(a >0){
            System.out.println("its positive number "+a+"");
        } else if (a<0){
            System.out.print("Entered value "+a+" is negative number ");

        } else {
            System.out.print("its an special character");
        }
        sc.close();

    }
    
}
