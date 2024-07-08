import java.util.*;
public class pattern25{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j <n-i; j++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}