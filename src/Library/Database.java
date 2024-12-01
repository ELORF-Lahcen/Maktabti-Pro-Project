package Library;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> userNames = new ArrayList<String>();
    public void AddUser(User u) {
        users.add(u);
        userNames.add(u.getName());
    }

    public int login(String phoneNumber, String email) {
        int test = -1;
        for(User u : users) {
            if (u.getPhoneNumber().matches(phoneNumber) && u.getEmail().matches(email)) {
                test = users.indexOf(u);
                break;
            }
        }
        return test;
    }

    public User getUser(int n){
        return users.get(n);
    }
}
