package com.example.registerproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {



    private Context context;
    private ArrayList<User> users= new ArrayList<User>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userName.setText(users.get(position).getFirstName() +" " + users.get(position).getLastName());
        holder.userDegree.setText(users.get(position).getDegreeProgram());
        holder.userEmail.setText(users.get(position).getEmail());
        if((users.get(position).getFinishedBachelor() != null) || (users.get(position).getFinishedEngineer() != null) ||(users.get(position).getFinishedDoctor() != null) ||(users.get(position).getFinishedSwimming() != null)) {
            holder.userPrograms.append("Suoritetut tutkinnot:");
            if (users.get(position).getFinishedBachelor() != null) {
                holder.userPrograms.append("\n" + users.get(position).getFinishedBachelor());

            }
            if (users.get(position).getFinishedEngineer() != null) {
                holder.userPrograms.append("\n" +users.get(position).getFinishedEngineer());

            }
            if (users.get(position).getFinishedDoctor() != null) {
                holder.userPrograms.append("\n" +users.get(position).getFinishedDoctor());

            }
            if (users.get(position).getFinishedSwimming() != null) {
                holder.userPrograms.append("\n" +users.get(position).getFinishedSwimming());
            }
        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
