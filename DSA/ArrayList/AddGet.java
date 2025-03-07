import java.util.*;

public class AddGet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        // System.out.println(list);

        // Get elememts
        // System.out.println(list.get(2));

        // Add element in between
        // list.add(1, 5);
        // System.out.println(list);

        // Set element
        // list.set(0, 4);
        // System.out.println(list);

        // Delete element
        // list.remove(0); //by index
        // list.remove(list.size() - 1);
        // list.remove(Integer.valueOf(6)); // Remove by object

        System.out.println(list);

        // Size
        // System.out.println(list.size());

        // loops
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }

        // ForEachloop
        // for (Integer nums : list){
        // System.out.print(nums+" ");
        // }

        // Single array
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // System.out.println(list);


        // 2D array
        // ArrayList<ArrayList<Integer>> list2D = new ArrayList<>(
        // Arrays.asList(
        // new ArrayList<>(Arrays.asList(1, 2, 3)),
        // new ArrayList<>(Arrays.asList(4, 5, 6)),
        // new ArrayList<>(Arrays.asList(7, 8, 9))
        // )
        // );
        // list2D.get(0).add(1);
        // System.out.println(list2D);


        // Java Util bulit-in function
        // Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder());
        // Collections.reverse(list);
        // list.clear();
        // System.out.println(list);
        // System.out.println(list.isEmpty());
    }

}
