import java.util.Scanner;

public class count {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        

        int cnt = (int)(Math.log10(n)+ 1);
        System.out.print("No. of digit : "+ cnt);
        
        sc.close();

        
    }
    
}
