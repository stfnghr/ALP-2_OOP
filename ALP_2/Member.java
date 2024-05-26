package ALP_2;

public class Member extends User {

    public Member(int userID, String username, String email, String password) {
        super(userID, username, email, password);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Member");
    }

    public void joinProject() {
        // Implementasi untuk bergabung dengan proyek
    }
}
