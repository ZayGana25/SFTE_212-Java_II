package week8;

import java.util.Arrays;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
        // float[] boats = new float[5];
        // System.out.println(boats);
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // array that stores my info
        String[] me = new String[] {"Isaiah", "Lugo", "ilugo@bushnell.edu", "20097"};
        System.out.println(Arrays.toString(me));
        // array to list and print
        List<String> stringList1 = Arrays.asList(me);
        System.out.println(stringList1);

        // array that stores numbers 1-20 and prints even numbers out
        int[] numbs = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Even numbers in the given array are: "); 
 
        for (int i=0; i<numbs.length; i++){ 
            if(numbs[i]%2 == 0){ 
                System.out.print(numbs[i] + " "); 
            } 
        } System.out.println();

        // List<String> stringList = Arrays.asList(cars);

        // creating an array with integers
        int[] array2 = {7, 4, 2, 1, 19};
        // this is the sorting part just one function ready to be used
        Arrays.sort(array2);
        // prints [1, 2, 4, 7, 19]
        System.out.println(Arrays.toString(array2));
    }
}
