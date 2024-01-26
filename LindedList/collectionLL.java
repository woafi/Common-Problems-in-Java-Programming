
//collection framework Linked List

import java.util.*;
public class collectionLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.addFirst("1");
        list.addFirst("3");
        System.out.println(list);

        list.addLast("5");  // by defalt after calling add = addlast method;
        System.out.println(list);
        System.out.println(list.size());

        
            for (int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+ " ");
            }
            System.out.println("null");
            list.removeFirst();
            System.out.println(list);
            list.removeLast();
            System.out.println(list);

            list.remove(0);
            System.out.println(list);
        }
        

    
}
