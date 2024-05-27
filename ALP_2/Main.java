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
            if (user == null) {
                System.out.println("Login failed. Try again");
                return;
            }
        } else { //sign-up
            System.out.print("E-mail : ");
            String email = sc.nextLine();
            System.out.print("Username : ");
            String username = sc.nextLine();
            System.out.print("Password : ");
            String password = sc.nextLine();

            if (userManager.signUp(username, email, password, role)) {
                System.out.println("Your account has been registered!");
                user = new User(userManager.getNextUserID() - 1, username, email, password, role);
            } else {
                System.out.println("Username or Email already exists. Please try again!");
                return;
            }
        }

        while (true) {
            System.out.println("=== SCHEIVE ===");
            System.out.println("1. Profile");
            System.out.println("2. New Project");
            System.out.println("3. View Projects");
            System.out.println("4. Add Progress Report");
            System.out.println("5. View Progress Report");
            System.out.println("6. Leaderboard");
            System.out.println("0. Exit");
            System.out.print("=> ");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1: //view profile
                    System.out.println("Hello, " + user.getUsername() + "!");
                    user.displayBadges();
                    System.out.println("1. Edit Profile");
                    System.out.println("2. View your Tasks ");
                    System.out.println("3. Edit");
                    System.out.println("0. Back");

                case 2: //new project
                    System.out.println("What's your role?");
                    System.out.println("1. Admin");
                    System.out.println("2. Member");
                    System.out.print("=> ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    if (a == 1) { //role = admin
                        System.out.print("Name of Project : ");
                        System.out.print("Due Date : ");
                        System.out.println("Description : ");
                    } else { //role = member
                        System.out.print("Name of Project : ");
                        System.out.print("Due Date : ");
                        System.out.println("Description : ");
                    }

                case 3: //view projects

                case 4: //add report
                    System.out.print("Enter summary of progress : ");
                    String summary = sc.nextLine();
                    ProgressReport report = new ProgressReport(project.getProgressReports().size() + 1, project.getProjectID(), new Date(), summary);
                    project.addProgressReport(report);
                    System.out.println("Progress report added successfully!");
                    break;

                case 5: // view report
                    System.out.println("Progress Reports for " + project.getName() + ":");
                    for (ProgressReport pr : project.getProgressReports()) {
                        System.out.println("Report ID: " + pr.getReportID() + ", Date: " + pr.getDate() + ", Summary: " + pr.getSummary());
                    }
                    break;

                case 6: //leaderboard

                case 0: //exit
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("INVALID!");
                    break;
            }
        }
    }
}
