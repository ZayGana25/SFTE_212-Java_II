package week5;


//sub class
class Customer extends Person {
    public void anotherMethod() { 
        System.out.println(20097);
    } 
}
//base class
public class Person {

    public void baseMethod() { 
        System.out.println("Full Name: Isaiah Lugo");
        System.out.println("ilugo@bushnell.edu");
        System.out.println("541-***-****");
    }

    public static void main(String[] args){
        System.out.println("Person/Customer Inheritance");

        Customer subClass = new Customer();
        subClass.baseMethod();
        subClass.anotherMethod();
    }
}

