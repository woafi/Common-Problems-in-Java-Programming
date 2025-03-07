import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
         LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
        }
    }    
}
