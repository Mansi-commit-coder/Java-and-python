import java.util.*;


public class foreach {
    public static void main(String[] arg){
    String names[] = {"Ram", "Shyam", "Dhyan", "Bhyan"};
//for(int i=0; i<names.length; i++){
 //   System.out.println("Name is " +names[i] );
//}
for(String name : names){
System.out.println("For each " + name);
}

}
}
