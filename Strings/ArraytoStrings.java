import java.util.*;
public class ArraytoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("String: ");
        String origin=sc.nextLine();
        String[] array = new String[origin.length()];
     
        int totLength = 0;
     
        for(int i=0; i<origin.length(); i++) {
        array[i] = String.valueOf(origin.charAt(i));
        totLength += array[i].length();
        }

 
        System.out.println(totLength);
      }
}
