package com.example.registerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        loadUsers();
    }

    public void switchToAddUser(View view){
        Intent intent = new Intent(this,AddUserActivity.class);
        startActivity(intent);
    }

    public void switchToListUsers(View view){
        Intent intent = new Intent(this,ListUsersActivity.class);
        startActivity(intent);
    }

    public void loadUsers(){
        UserStorage.getInstance().loadUsers(context);
    }




}