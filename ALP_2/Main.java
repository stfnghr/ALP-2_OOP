package ALP_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(0, "", "", "");
        
        System.out.println("=== Selamat Datang di (nama apk)! ===");
        System.out.println("1. Log-In");
        System.out.println("2. Sign-Up");
        System.out.print("=> ");
        int option = sc.nextInt();
        
        if (option == 1) { //log-in
            System.out.print("Username : ");
            user.getUsername();
        } else { //sign-up
            System.out.print("E-mail : ");
            user.setEmail(sc.next() + sc.nextLine());
            System.out.print("Username : ");
            user.setUsername(sc.next() + sc.nextLine());
            System.out.print("Password : ");
            user.setPassword(sc.next() + sc.nextLine());
            
            System.out.println("Akun anda berhasil dibuat!");
        }
        
        while(true){
            System.out.println("=== (nama apk) ===");
            System.out.println("1. Lihat Profil");
            System.out.println("2. Buat Proyek Baru");
            System.out.println("3. Lihat Proyek");
            System.out.println("4. Leaderboard");
            System.out.println("0. Keluar");
            System.out.print("=> ");
            int choose = sc.nextInt();
            
            switch (choose) {
                case 1: 
                    System.out.println("Halo, "+user.getUsername()+"!");
                    System.out.println("Badge : "+user.get);
            }
        }
    }
}
