import java.util.*;
public class udisplayusernamefromemail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String usern1=sc.next();
        String display="";

        for (int i=0; i<usern1.length(); i++){
        if (usern1.charAt(i) == '@' ) {
            break;}
            else {
                display += usern1.charAt(i);
            }

        }
        System.out.print(display);
    }
}
