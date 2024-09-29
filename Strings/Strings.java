import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        for (int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        //1 s1> s2 : +ve
        //2 s2==s1: 0
        //3 s1<s2: -ve
        // String vari1="woafi";
        // String vari2="woafi";
        // if (vari1.compareTo(vari2) == 0) {
        //     System.out.println("String is Equal");
        // } else {
        //     System.out.println("String is not Equal");
        // }
    }
    
}
