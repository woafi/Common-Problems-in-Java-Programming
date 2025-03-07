import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class hashSet {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    // System.out.println(cars);

    // Check If an Item Exists
    // cars.contains("Mazda");
    // System.out.println(cars.contains("Mazda"));

    // Remove a item
    // cars.remove(0);
    System.out.println(cars);

    // Remove a item using index based first set must convert to list then again
    // Convert HashSet to ArrayList
    List<String> carList = new ArrayList<>(cars);

    // Remove an item by index
    carList.remove(1); // Removes the item at index 1

    // Convert back to HashSet
    cars = new HashSet<>(carList);

    // System.out.println(cars.size()); // Output will vary since HashSet is unordered

    // access in value
    // Using a for-each loop
    // for (String car : cars) {
    //   System.out.println(car);
    // }

    // Using an iterator
    Iterator<String> it = cars.iterator();
    int index = 0;
    while (it.hasNext()) {
      System.out.println(index);
      String car = it.next();
      System.out.println(car);
      index++;
    }


  }
}