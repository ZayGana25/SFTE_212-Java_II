package week15;

import java.util.ArrayList;

public class JavaLists {
    public static void main(String[] args) {
        System.out.print("Java Lists");
        System.out.print(System.lineSeparator());

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(33L, "A", "ilugo@bushnell.edu"));
        users.add(new User(25L, "B", "ilugo@bushnell.edu"));
        users.add(new User(28L, "C", "ilugo@bushnell.edu"));
        
        for (User item: users) {
            System.out.println(item);
        }
    }
}
