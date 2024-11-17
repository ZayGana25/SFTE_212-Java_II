package Programming_Assignments;

//sub class
class SubClass extends Lugo_PA2 {
    public void anotherMethod() { 
        System.out.println(20097);
    } 
}
//base class
public class Lugo_PA2 {

    public void baseMethod() { 
        System.out.println("Full Name: Isaiah Lugo");
        System.out.println("ilugo@bushnell.edu");
        System.out.println("541-***-****");
    }

    public static void main(String[] args){
        System.out.println("Person/Customer Inheritance");

        SubClass subClass = new SubClass();
        subClass.baseMethod();
        subClass.anotherMethod();
    }
}
