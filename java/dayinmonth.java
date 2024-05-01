import java.util.*;
public class dayinmonth {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any month in number 1-12, you want to check its days : ");
        int month = sc.nextInt();
    switch(month){
        case 1, 3, 5, 7, 8, 10, 12 :
        System.out.print(month + " the given month has 31 days.");
        break;
        case 4, 6, 9, 11 :
        System.out.print(month + " This month has 30 days.");
        break;
        case 2:
        System.out.print(month + " it hase 28 days.");
        break;
    }


        sc.close();
    }
    
}
