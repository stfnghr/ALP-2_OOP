package ALP_2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;
    private int nextUserID;

    // Constructor
    public UserManager() {
        this.users = new ArrayList<>();
        this.nextUserID = 1;
    }

    // Method to register a new user
    public boolean signUp(String username, String email, String password) {
        // Check if the username or email already exists
        for (User user : users) {
            if (user.getUsername().equals(username) || user.getEmail().equals(email)) {
                return false; // Username or email already taken
            }
        }

        // Create a new user and add to the list
        User newUser = new User(nextUserID++, username, email, password);
        users.add(newUser);
        return true;
    }

    // Method to login a user
    public User login(String usernameOrEmail, String password) {
        for (User user : users) {
            if ((user.getUsername().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail))
                    && user.getPassword().equals(password)) {
                return user; // Login successful
            }
        }
        return null; // Login failed
    }

    // Method to get all users (for testing purposes)
    public List<User> getAllUsers() {
        return users;
    }
}
