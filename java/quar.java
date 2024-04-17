/* print the given value by user is in which quadrant */

import java.util.*;

public class quar{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>=1 && y>=1){
            System.out.print("Entered value "+x+","+y+" is in first quardant.");
        }
        else if(x>=1 && y<=1){
            System.out.print("Entered value "+x+","+y+" is in second quardant.");
        }
        else if(x<=1 && y<=1){
            System.out.print("Entered value "+x+","+y+" is in third quardant.");
        }
        else if(x>=1 && y<=1){
            System.out.print("Entered value "+x+","+y+" is in fourth quardant.");
        }
        sc.close();

    }
}