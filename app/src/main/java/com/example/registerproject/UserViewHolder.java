package com.example.registerproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView userName;
    TextView userDegree;
    TextView userEmail;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivUserImage);
        userName = itemView.findViewById(R.id.textFullName);
        userDegree = itemView.findViewById(R.id.textDegreeProgram);
        userEmail = itemView.findViewById(R.id.textEmail);


    }
}
