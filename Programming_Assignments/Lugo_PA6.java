package Programming_Assignments;

import java.util.ArrayList;
import java.util.List;

public class Lugo_PA6 {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Mango");

        // Displaying the elements of the list
        System.out.println("Elements of the list:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}
