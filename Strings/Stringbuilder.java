import java.util.*;

public class Stringbuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Mohammad";

        // reverse
        String newStr = new StringBuilder(str).reverse().toString();
        System.out.println(newStr);

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.setCharAt(0, 'R'); // for replace char

        sb.insert(0, 'W'); // for insert char
        System.out.println(sb);
        sb.delete(2, 5); // for delete
        System.out.println(sb);

        String add = sc.next();
        sb.append(add); // str= str + "i";
        System.out.println(sb);

    }

}
