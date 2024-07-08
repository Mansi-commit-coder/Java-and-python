import java.util.*;

public class dayinmonth{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter months using 1-12 no.");
        int month = sc.nextInt();
        

        if(month<=12){
            if(month %2 != 0 && month>=8){
                System.out.print("It has 30 days");
            }else if(month %2 == 0 && month<8){
                if(month == 2)
                {
                    System.out.print("It has 28 or 29 days");
                }
                else{
                System.out.print("It has 30 days");
                }
            }
            
            else{
                System.out.print("It has 31 days");
            }
            
        }
        else{
            System.out.print("Enter a number between 1-12 only");
        }
    }
}