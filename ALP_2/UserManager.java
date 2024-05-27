package ALP_2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;
    private int nextUserID;

    public UserManager() {
        this.users = new ArrayList<>();
        this.nextUserID = 1;
    }

    public boolean signUp(String username, String email, String password, String role) {
        // Check if the username or email already exists
        for (User user : users) {
            if (user.getName().equals(username) || user.getEmail().equals(email)) {
                return false; // Username or email already taken
            }
        }

        // Create a new user and add to the list
        User newUser;
        if (role.equalsIgnoreCase("admin")) {
            newUser = new Admin(nextUserID++, username, email, password);
        } else {
            newUser = new Member(nextUserID++, username, email, password);
        }
        users.add(newUser);
        return true;
    }

    // Method to login a user
    public User login(String usernameOrEmail, String password) {
        for (User user : users) {
            if ((user.getName().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail))
                    && user.getPassword().equals(password)) {
                return user; // Login successful
            }
        }
        return null; // Login failed
    }
    
    public int getNextUserID() {
        return nextUserID;
    }
    
    public List<User> getAllUsers() {
        return users;
    }
    
    // Method to display all users and their details
    public void displayAllUsers() {
        for (User user : users) {
            user.displayUserDetails();
        }
    }
}
