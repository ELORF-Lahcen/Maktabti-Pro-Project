package Library;

import java.util.Scanner;

public class Main {

    static Scanner input;
    static Database database;

    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Library Management System # Maktabati-Pro-Project #");

        int num;

        do {
            System.out.println("0. Exit\n1. Login\n2. New User");

            input = new Scanner(System.in);
            num = input.nextInt();

            switch (num) {
                case 1:
                    login();
                case 2:
                    newUser();
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
            user.menu();
        } else {
            System.out.println("User doesn't exist!");
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
        User user;
        if (n2 == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
        user.menu();
    }
}