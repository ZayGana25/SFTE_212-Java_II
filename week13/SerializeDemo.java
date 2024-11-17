package week13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String [] args) {
      //   Employee e = new Employee();
      //   e.name = "Reyan Ali";
      //   e.address = "Phokka Kuan, Ambehta Peer";
      //   e.SSN = 11122333;
      //   e.number = 101;

        Student s = new Student();
        s.id = "20097";
        s.firstname = "Isaiah";
        s.lastname = "Lugo";
        s.email = "ilugo@bushnell.edu";
        s.mobile = "541-***-****";

        
        try {
           FileOutputStream fileOut = new FileOutputStream("student.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(s);
           out.close();
           fileOut.close();
           System.out.printf("Serialized data is saved in /tmp/student.ser");
        } catch (IOException i) {
           i.printStackTrace();
        }
     }
}
class Student implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    public String id;
    public String firstname;
    public String lastname;
    //  public transient int SSN;
    public String email;
    //  public int number;
    public String mobile;
    
   //  public void mailCheck() {
   //     System.out.println("Mailing a check to " + name + " " + address);
   //  }
 }
