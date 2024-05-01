import java.util.*;
public class xor {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value you want to get xor : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a^b;
        if(a<=1 && b <=1){
            System.out.print(a+ b+ " Enter number greater than 0.");
        }else{
            System.out.print(c);
        }
        sc.close();
    }
    
}
