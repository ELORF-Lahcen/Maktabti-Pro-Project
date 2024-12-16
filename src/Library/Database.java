package Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> userNames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> bookNames = new ArrayList<String>();

    private File usersFile = new File(Main.class.getClassLoader().getResource("data/Users").getFile());
    private File booksFile = new File(Main.class.getClassLoader().getResource("data/Books").getFile());


    public Database() {
        if (!usersFile.exists()) {
            usersFile.mkdirs();
        }
        if (!booksFile.exists()) {
            booksFile.mkdirs();
        }
    }

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

    public void addBook(Book book) {
        books.add(book);
        bookNames.add(book.getName());
    }

    private void getUsers() {
        String text1 = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(usersFile));
            String s1;
            while((s1 = br1.readLine()) != null) {
                text1 = text1 + s1;
            }
            br1.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    private void saveUsers() {
        String text1 = "";
        for (User user: users) {
            text1 = text1 + users.toString() + "<NewUser/>\n";
        }
        try {
            PrintWriter pw = new PrintWriter(usersFile);
            pw.print(text1);
            pw.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
