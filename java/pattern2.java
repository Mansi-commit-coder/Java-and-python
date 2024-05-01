

/*
 #####
 ####
 ###
 ##
 #

 
*/
import java.util.*;

public class pattern2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j = num -i; j >=0; j--){
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
