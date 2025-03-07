import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // for (int i=0; i<name.length(); i++){
        // System.out.println(name.charAt(i));
        // }



        // 1 s1> s2 : +ve
        // 2 s2==s1: 0
        // 3 s1<s2: -ve

        // String vari1="woafi";
        // String vari2="woafi";
        // if (vari1.compareTo(vari2) == 0) {
        // System.out.println("String is Equal");
        // } else {
        // System.out.println("String is not Equal");
        // }



        // String txt = "Please locate where 'locate' occurs!";
        // System.out.println(txt.indexOf("locate")); // Outputs 7
        // System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
        // System.out.println(txt.toLowerCase()); // Outputs "hello world"
        // String txt1 = "We are the so-called \"Vikings\" from the north."; // "" for printing
        // System.out.println(txt1);



        String str = "Mohammad";
        // System.out.println(str.toLowerCase());

        // int[] array = {2, 6, 8, 9};
        // System.out.println(Arrays.toString(array));

        for(char c : str.toCharArray()){
            System.out.println(c);
        }

    }
}
