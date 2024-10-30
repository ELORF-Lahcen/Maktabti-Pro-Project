package Library;

import java.util.Scanner;

public class Main {

    static Scanner input;

    public static void main(String[] args) {

        System.out.println("Welcome to Library Management System # MaktabatiPro-Project # !\n" + "1. Login\n2. New User");

        input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n) {
            case 1:
                login();
            case 2:
                newUser();
            default:
                System.out.println("Error!!!");
        }
    }

    private static void login() {
        System.out.println("Enter your phone number:");
        String phoneNumber = input.next();
        System.out.println("Enetr your email:");
        String email = input.next();
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

        } else {

        }
    }
}