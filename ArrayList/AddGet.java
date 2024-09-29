import java.util.ArrayList;
import java.util.Collections;
public class AddGet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        
        System.out.println(list);

        //get elememts
        int element = list.get(2);
        System.out.println(element);

        //add element in between

        list.add(1, 5);
        System.out.println(list);

        //set element
        list.set(0,4);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size
        System.out.println(list.size());
        
        //loops
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
            
        }

        //sorting
        Collections.sort(list);
        System.out.println("\n" + list);


    }
    
}
