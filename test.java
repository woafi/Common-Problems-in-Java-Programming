import java.util.*;

public class test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        for (int i=0; i<50; i++){
            list.addLast(Integer.toString(i));
        }
        

        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            if (list.get(i) =="7"){
                System.out.println("Index No: "+ i );
            }
            System.out.print(list.get(i)+ " ");
        }
    }
    
}
