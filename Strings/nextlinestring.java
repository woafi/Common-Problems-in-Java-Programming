import java.util.*;
public class nextlinestring{
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        
        while (sc.hasNextLine()) {
            
            String sen = sc.nextLine();
            System.out.println(counter + " " + sen);
            counter++; 
        }
        System.out.println("Got it");
    }
}
