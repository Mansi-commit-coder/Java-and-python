import java.util.*;

public class upper_lower {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = in.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+ " Its in lower");

        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+ " Its in upper");

        }
        
        in.close();

    }
    
}
