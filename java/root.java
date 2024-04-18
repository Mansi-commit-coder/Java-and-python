// find the root of quardatic equation whether it is real or complex ? 


/*
 for this we just have to focuse on discriminant  D = b^2 - 4ac
 If D > 0, then the equation has two real and distinct roots.
If D < 0, the equation has two complex roots.
If D = 0, the equation has only one real root.
 

 */


 import java.util.*;
 public class root{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a, b, and c for the equation D= b^2-4ac. : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double Discriminant = b*b-4*a*c;


         // if discriminant >0 then there are two root, root1 = -b + sq root of(b^2-4ac)/2a.
        // root2 = b - sq root(b^2-4ac)/2a.
        if(Discriminant >0){
            double root1 = ((-b + Math.sqrt(b)-4*a*c)/2*a);
            double root2 = ((b - Math.sqrt(b)-4*a*c)/2*a);
            System.out.print("The equation has two real root "+ root1 + " and " + root2 );

        }
        // if discriminant = 0 then there are one root.
        // root = -b/2a
        
        else if(Discriminant == 0){
            double root = (-b/2*a);
            System.out.print("There is only one root which is real also " + root);



        } 

        // if discriminant <0 then there are two complex root 
        else if(Discriminant< 0){
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-Discriminant) / (2 * a);
            System.out.println("The equation has two complex roots: " + realPart + " + " + imaginaryPart + 
            "i and " + realPart + " - " + imaginaryPart + "i");
        }
       sc.close();

    }
 }