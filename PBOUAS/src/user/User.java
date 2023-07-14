package user;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private String role;
    private static Map<String, User> userMap = new HashMap<>();

    // Constructor
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // CRUD operations

    public static void createUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public static User readUser(String username) {
        return userMap.get(username);
    }
    public static void updateUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public static void deleteUser(String username) {
        userMap.remove(username);
    }
}