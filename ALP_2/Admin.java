package ALP_2;

public class Admin extends User {

    public Admin(int userID, String username, String email, String password) {
        super(userID, username, email, password);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }

    public void createProject() {
        // Implementasi untuk membuat proyek baru
    }
}
