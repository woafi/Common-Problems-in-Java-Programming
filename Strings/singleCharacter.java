import java.io.*;
import java.util.*;

public class singleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        System.out.println(a);

        String s = "Whatever" + a;
        System.out.println(s);


        System.out.flush();
    }
}