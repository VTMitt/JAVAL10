package com.example.registerproject;

import android.content.Context;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public void saveUsers(Context context){
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users.data", Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        } catch (IOException e) {
        }

    }

    public void loadUsers(Context context){
        try {
            ObjectInputStream userReader = new ObjectInputStream(context.openFileInput("users.data"));
            users = (ArrayList<User>) userReader.readObject();
            userReader.close();
        } catch (IOException | ClassNotFoundException e) {
        }

    }

    public void sortByAlphabet(){
        ArrayList<String> users_sort = new ArrayList<String>();
        for (User user: users) {
            users_sort.add(user.getLastName());
        }
        Collections.sort(users_sort);

        int j = 0;
        for (User user: users) {
            for (int i = 0; i < users.size(); i++) {
                if(users_sort.get(i).equals(user.getLastName())){
                    Collections.swap(users,j,i);
                }
            }
            j++;
            
        }        
        
    }



}
