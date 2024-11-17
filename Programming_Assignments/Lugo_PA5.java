
package Programming_Assignments;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lugo_PA5 {
    public static void main(String [] args) {
  
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
    public String email;
    public String mobile;
}