package Library;

public abstract class User {

    protected String name;
    protected String email;
    protected String phoneNumber;

    public User() {}

    public User(String name){
        this.name = name;
    }
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    abstract public void menu();
}
