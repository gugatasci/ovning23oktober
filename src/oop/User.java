package oop;

public class User {

    private String username;
    public String password;

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;

    }

    public String getPassword() {
        return password;

    }

    public String changeUserName(String bird) {
        return username;
    }
}