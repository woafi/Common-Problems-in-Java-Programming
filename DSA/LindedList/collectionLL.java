import java.util.*;
public class collectionLL {
    public static void main(String[] args) {
        LinkedList<String> nums = new LinkedList<String>();
        
        nums.addFirst("2");
        nums.addFirst("1");
        nums.addLast("3");
        nums.addLast("4");
        nums.addLast("5");
        nums.addLast("6");
        System.out.println(nums);

        
        // System.out.println(nums.size());

        //index value
        //     for (int i=0; i<nums.size(); i++){
        //         System.out.print(nums.get(i)+ " ");
        //     }

        //     nums.removeFirst();
        //     nums.removeLast();

        //     nums.remove(0);
        //     System.out.println(nums);

        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
        
        }
}
