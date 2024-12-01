package Library;

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }
}

