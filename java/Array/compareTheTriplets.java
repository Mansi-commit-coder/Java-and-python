import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class compareTheTriplets{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Integer> alice = new ArrayList<Integer>();
        alice.add(a);
        alice.add(b);
        alice.add(c);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();


        ArrayList<Integer> bob = new ArrayList<Integer>();
        bob.add(m);
        bob.add(n);
        bob.add(o);


        int alice_score = 0;
        int bob_score = 0;

        for(int i = 0; i< alice.size(); i++){
            if(alice.get(i)>bob.get(i)){
                alice_score += 1;
            }else if(alice.get(i)<bob.get(i)){
                bob_score += 1;
            }
           System.out.print(alice_score + " " + bob_score);
        }
    }

    
}