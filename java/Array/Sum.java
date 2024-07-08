// Sum of array

import java.util.*;
public class Sum{
    public static void main(String[] arg){
        int num[] = {45, 67, 56, 50};
        int sum = 0;
        for(int number : num){
           sum += number;
        }
        System.out.print(sum);
    }
}