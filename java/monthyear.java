import java.util.*;
public class monthyear{
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Enter any month in number between 1-12 : ");
        System.out.println( "Enter any month in number between year : ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        if(month == 2 )
            System.out.print("29 days and leap year.");
        else if ((month == 2 && year % 400 != 0) || (year % 100 == 0) && (year % 4 != 0))
            System.out.print("28 Days and not leap year");


        else if(month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10 || month == 12)
            System.out.print("31 days and not leap year");



        else if (month == 4 || month == 6 || month == 9|| month == 11 )
            System.out.print("30 days and not leap year");
        


        sc.close();
    }
   
}