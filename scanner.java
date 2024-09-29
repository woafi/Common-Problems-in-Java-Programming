
import java.util.*;

public class scanner {
    // function
    public static void printString(String name){
        System.out.println(name);
        return;
    } 
    public static void main(String[] args) { 
        //Input values to variable
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();  //for single token
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String fullname = firstname +" "+lastname; 
        System.out.println(fullname);
        System.out.println(fullname.length()); //length
        char a = sc.next().charAt(0);
        System.out.println(a);

    }
    
}
