import java.util.*;
public class chartostring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String: ");
        String origin=sc.nextLine();
        Character[] result=new Character[origin.length()];

        for(int i=0; i<origin.length(); i++){
            result[i] = origin.charAt(i);
            System.out.print(result[i]);
        }
        //String strCopy = String.valueOf(origin);
        //System.out.println(strCopy);
}
    
}
