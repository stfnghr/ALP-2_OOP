package ALP_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
        
        System.out.println("=== Welcome to SCHEIVE! ===");
        System.out.println("1. Log-In");
        System.out.println("2. Sign-Up");
        System.out.print("=> ");
        int option = sc.nextInt();
        sc.nextLine();
        
        User user = null;
        
        if (option == 1) { //log-in
            System.out.println("--- LOG-IN ---");
            System.out.print("Username or Email : ");
            String usernameOrEmail = sc.nextLine();
            System.out.print("Password : ");
            String password = sc.nextLine();
            
            user = userManager.login(usernameOrEmail, password);
            if(user == null){
                System.out.println("Login Failed. Try again");
                return;
            }
        } else { //sign-up
            System.out.print("E-mail : ");
            String email = sc.nextLine();
            System.out.print("Username : ");
            String username = sc.nextLine();
            System.out.print("Password : ");
            String password = sc.nextLine();
            
            if(userManager.signUp(username, email, password)){
                System.out.println("Your account has been registered!");
                user = new User(userManager.getNextUserID() - 1, username, email, password);
            } else {
                System.out.println("Username or Email already exists. Please try again!");
                return;
            }
        }
        
        while(true){
            System.out.println("=== SCHEIVE ===");
            System.out.println("1. View Profile");
            System.out.println("2. Create New Project");
            System.out.println("3. View Projects");
            System.out.println("4. Leaderboard");
            System.out.println("0. Exit");
            System.out.print("=> ");
            int choose = sc.nextInt();
            sc.nextLine();
            
            switch (choose) {
                case 1: //lihat profil
                    System.out.println("Hello, "+user.getUsername()+"!");
                    user.displayRole();
//                    System.out.println("Badge : "+user.get);
            }
        }
    }
}
