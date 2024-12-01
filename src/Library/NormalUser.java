package Library;

public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
    }

    public  NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    @Override
    public void menu() {
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. Place Order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");
    }
}
