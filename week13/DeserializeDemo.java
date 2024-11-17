package week13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String [] args) {
        // Employee e = null;
        // try {
        //    FileInputStream fileIn = new FileInputStream("employee.ser");
        //    ObjectInputStream in = new ObjectInputStream(fileIn);
        //    e = (Employee) in.readObject();
        //    in.close();
        //    fileIn.close();
        // } catch (IOException i) {
        //    i.printStackTrace();
        //    return;
        // } catch (ClassNotFoundException c) {
        //    System.out.println("Employee class not found");
        //    c.printStackTrace();
        //    return;
        // }
  
        // System.out.println("Deserialized Employee...");
        // System.out.println("Name: " + e.name);
        // System.out.println("Address: " + e.address);
        // System.out.println("SSN: " + e.SSN);
        // System.out.println("Number: " + e.number);

        Student s = null;
        try {
           FileInputStream fileIn = new FileInputStream("student.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           s = (Student) in.readObject();
           in.close();
           fileIn.close();
        } catch (IOException i) {
           i.printStackTrace();
           return;
        } catch (ClassNotFoundException c) {
           System.out.println("Student class not found");
           c.printStackTrace();
           return;
        }
  
        System.out.println("Deserialized Employee...");
        System.out.println("ID: " + s.id);
        System.out.println("First Name: " + s.firstname);
        System.out.println("Last Name: " + s.lastname);
        System.out.println("Email: " + s.email);
        System.out.println("Mobile Number: " + s.mobile);
    }

}
// class Employee implements java.io.Serializable {

//     private static final long serialVersionUID = 1L;
//     public String name;
//     public String address;
//     public transient int SSN;
//     public int number;
    
//     public void mailCheck() {
//        System.out.println("Mailing a check to " + name + " " + address);
//     }
// }

class Student implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    public String id;
    public String firstname;
    public String lastname;
    public String email;
    public String mobile;

}



