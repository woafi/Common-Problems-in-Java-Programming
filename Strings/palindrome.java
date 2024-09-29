import java.util.*;

public class palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revStr="";

        for (int i=A.length() - 1; i>=0; i--){
            revStr += A.charAt(i);
        }
        
        //compare
         A.compareTo(revStr);
        if (A.compareTo(revStr) == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}