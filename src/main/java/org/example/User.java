package org.example;

public class User {
    private String userName;
    private String password;

    public User(){}

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void changeUserName(String newName){
        userName = newName;
    }
}
