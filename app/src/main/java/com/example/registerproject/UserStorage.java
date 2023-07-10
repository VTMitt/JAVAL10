package com.example.registerproject;

import java.util.ArrayList;

public class UserStorage {
    ArrayList<User> users = new ArrayList<User>();
    private static UserStorage storage = null;

    private UserStorage(){

    }

    public static UserStorage getInstance(){
        if(storage == null){
            storage = new UserStorage();
        }
        return storage;

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }



}
