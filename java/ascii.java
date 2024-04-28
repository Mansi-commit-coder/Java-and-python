import java.util.*;

public class ascii{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().charAt(0);
        int asiic = ch;
        System.out.println("Entered character "+ch+" is :" +asiic);
        sc.close();

    }
    
}