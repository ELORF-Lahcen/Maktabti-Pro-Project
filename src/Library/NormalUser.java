package Library;

public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);
    }

    public  NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }
}
