/*
 
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

 */



import java.util.*;
public class pattern5{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i =0; i< num; i++){
            for(int j = 0; j<num; j++){
            System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
        
    }
}