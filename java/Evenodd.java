/*check whether the number is even or odd */


import java.util.Scanner;

public class Evenodd{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you desired number : ");
        double a = sc.nextDouble();

        if(a%2 == 0){
            System.out.print(a+ " is even number.");
        }else{
            System.out.print(a+ " is odd number.");

        }
        sc.close();


    }
}