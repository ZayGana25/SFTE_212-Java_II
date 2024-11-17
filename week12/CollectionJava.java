

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionJava {
    public static void main(String[] args) {
        System.out.println("Collections in Java");
        
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String fruitType = "Apple";
        for (int i = 0; i < fruits.size(); i++) {
            String fruitString = fruits.get(i);
            System.out.println (fruitString);
            if (fruitType.equals(fruitString)) {
                fruits.remove(i);
            }
        }

        List<String> filteredList = fruits.stream().filter(p -> !"Apple".equals(p)).collect(Collectors.toList());
        for (String fruit : filteredList) {
            System.out.println(fruit);
        }

        List<String> dataCharacter = Arrays.asList("ab", "bc", "cd", "ab", "bc", "cd");
        for (String item : dataCharacter) {
            System.out.println(item);
        }

        Map<String, Integer> vehicles = new HashMap<>();
 
        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
 
        System.out.println("Total vehicles: " + vehicles.size());


        Map<String, String> student = new LinkedHashMap<>();
 
        // Add some vehicles.
        student.put("First Name: ","Isaiah");
        student.put("Last Name: ", "Lugo");
        student.put("Middle Name: ", "Paul");
        student.put("Student ID: ", "20097");
        student.put("Email: ", "ilugo@bushnell.edu");
 
        System.out.println("Total student info: " + student.size());
 
 
        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();



 
        String searchKey = "Audi";
        if (vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
 
        // Clear all values.
        vehicles.clear();
 
        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size() + "\n");
                
        
        for (String key : student.keySet())
        System.out.println(key + " - " + student.get(key));
        System.out.println();    
    }
}
