package Programming_Assignments;

public class Lugo_PA1 {
    private int outerField = 10;

    // Nested class is defined with static keyword and can only access static members of the Lugo_PA1 class but not the instance variables or methods.
    static class NestedClass {
        void display() {
            System.out.println("Nested class method");
        }
    }

    // Inner class is a non-static nested class and can access both static and non-static members of the Lugo_PA1 class.
    class InnerClass {
        void display() {
            System.out.println("Inner class method accessing outer field: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of NestedClass
        Lugo_PA1.NestedClass nestedObj = new Lugo_PA1.NestedClass();
        nestedObj.display();

        // Creating an instance of InnerClass
        Lugo_PA1 outerObj = new Lugo_PA1();
        Lugo_PA1.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
