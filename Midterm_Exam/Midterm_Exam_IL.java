package Midterm_Exam;

// Parent class demonstrating inheritance
class Villian {
    void sound() {
        System.out.println("Villian makes a grunting sound.");
    }
}
// sub class inheriting from Hero
class Deadpool extends Villian {
    void sound() {
        System.out.println("Deadpool screams!");
    }
}



// Class demonstrating method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Midterm_Exam_IL {
    public static void main(String[] args) {


        // Method overloading demonstration
        Calculator calculator = new Calculator();
        System.out.println("Addition of integers: " + calculator.add(2, 5));
        System.out.println("Addition of doubles: " + calculator.add(2.5, 3.5));



        // Class inheritance demonstration
        Villian wolverine = new Villian();
        Deadpool deadpool = new Deadpool();

        wolverine.sound(); // Output: Villian makes a grunting sound.
        deadpool.sound();    // Output: Deadpool screams!



        // StringBuilder demonstration
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append(" ").append("World");

        System.out.println("StringBuilder example: " + stringBuilder.toString());
    }
}
