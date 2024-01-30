import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String str ="";
        String reverse[]=new String[input.length()];
        for (int i=0; i<input.length(); i++){
            reverse[i]=String.valueOf(input.charAt(i));
        }
        for (int i=input.length() - 1; i>=0; i--){
            System.out.print(reverse[i]);
            str += reverse[i];
        }
        System.out.println(str);
    }
}
