package week2;

class Displayer{

    // 1 element in method
    public void displayName(String firstName){
        System.out.println("Name is: " + firstName);
    }

    // 2 elements in method
    public void displayName(String firstName, String lastName){
        System.out.println("Name is: " + firstName + " " + lastName);
    }

    public void displayId(String id){
        System.out.println("Student ID is: " + id);
    }

    public void displayId(String id, String email){
        System.out.println("Student ID is: " + id + " and Student email is: " + email);
    }
}

public class ClassOverloadingMethods {

    public static void main(String[] args) {

        System.out.println("Class Overloading Methods");
        // class object - instant pf the class
        Displayer displayer = new Displayer();
        displayer.displayName("Isaiah");
        displayer.displayName("Isaiah", "Lugo");
        displayer.displayId("20097");
        displayer.displayId("20097", "ilugo@bushnell.edu");
        
    }
    
}
