package com.example.registerproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView userName;
    TextView userDegree;
    TextView userEmail;

    TextView userPrograms;





    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.textFullName);
        userDegree = itemView.findViewById(R.id.textDegreeProgram);
        userEmail = itemView.findViewById(R.id.textEmail);
        userPrograms = itemView.findViewById(R.id.textFinished);
    }


}
