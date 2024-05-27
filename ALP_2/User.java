package ALP_2;

public class User extends TeamMember {
    protected String email;
    protected String password;

    public User(int userID, String name, String email, String password, String role) {
        super(userID, name, role); // memanggil konstruktor superclass
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + getMemberID());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + email);
        System.out.println("Role: " + getRole());
        displayBadges();
    }
}
