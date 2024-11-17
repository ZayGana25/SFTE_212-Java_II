package week15;

public class User {
    public final Long id;
    public final String username;
    public final String email;
    
    public User(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    @Override
        public String toString() {
            return String.format("%s:%d, Email:%s", username, id, email);
    }
}
