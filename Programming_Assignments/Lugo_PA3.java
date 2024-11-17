package Programming_Assignments;

public class Lugo_PA3 {
    public static void main(String[] args) {

        // array that stores numbers 1-20 and prints even numbers out
        int[] numbs = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Even numbers in the given array are: "); 
         
        for (int i=0; i<numbs.length; i++){ 
            if(numbs[i]%2 == 0){ 
                System.out.print(numbs[i] + " "); 
            } 
        } System.out.println();

    }
    
}
