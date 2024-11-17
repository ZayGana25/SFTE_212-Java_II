package week5;

//sub class
class SubClass extends ClassInheritance {
    public void anotherMethod() { 
        System.out.println("Doing subClass coding");
    } 
}
//base class
public class ClassInheritance {

    public void baseMethod() { 
        System.out.println("Doing base class coding");
    }

    public static void main(String[] args){
        System.out.println("Class Inheritance");

        SubClass subClass = new SubClass();
        subClass.baseMethod();
        subClass.anotherMethod();
    }
}


    