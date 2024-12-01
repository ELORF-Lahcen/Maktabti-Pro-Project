package Library;

import java.util.Scanner;

public class Main {

    static Scanner input;
    static Database database;

    public static void main(String[] args) {

        database = new Database();

        int num;

        do {
            System.out.println("Welcome to Library Management System # Maktabati-Pro-Project # !\n"
                    + "0. Exit\n"
                    + "1. Login\n2. New User");

            input = new Scanner(System.in);
            num = input.nextInt();

            switch (num) {
                case 1:
                    login();
                case 2:
                    newUser();
                default:
                    System.out.println("Error!!!");
            }
        } while (num != 0);
    }

    private static void login() {
        System.out.println("Enter your phone number:");
        String phoneNumber = input.next();
        System.out.println("Enter your email:");
        String email = input.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
        } else {
            return;
        }
    }

    private static void newUser() {
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your phone number:");
        String phoneNumber = input.next();
        System.out.println("Enter your email:");
        String email = input.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = input.nextInt();
        if (n2 == 1) {
            User admin = new Admin(name, email, phoneNumber);
            database.AddUser(admin);
        } else {
            User user = new User(name, email, phoneNumber);
            database.AddUser(user);
        }
    }
}