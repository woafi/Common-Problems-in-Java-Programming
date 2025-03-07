import java.util.*;

public class main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // System.out.println(capitalCities);

        // Access 
        // System.out.println(capitalCities.get("England"));
        // System.out.println(capitalCities.size());
        // capitalCities.remove("England");
        
        

        // System.out.println("Countries:");
        // for (String country : capitalCities.keySet()) {
        //     System.out.println(country);
        // }

        // // Iterate over the values and print them
        // System.out.println("Capital Cities:");
        // for (String city : capitalCities.values()) {
        //     System.out.println(city);
        // }

        // Iterate over the entries (key-value pairs) and print them
        // System.out.println("Country -> Capital City:");
        // for (HashMap.Entry<String, String> entry : capitalCities.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }


        //For display key value paris
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
          }


        // Store keys in an ArrayList
        // ArrayList<String> countries = new ArrayList<>(capitalCities.keySet());

        // Print the ArrayList
        // // System.out.println("Countries: " + countries);
        
        // System.out.println(countries.get(1));
        // System.out.println(capitalCities.get(countries.get(1)));

    }
}
