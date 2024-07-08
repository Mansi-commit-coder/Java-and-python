import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.io.*;

public class arraySum{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements. ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for(int i =0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.print("sum of elements in given array : " +sum);
        
    }
}