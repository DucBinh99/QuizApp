package com.example.final_quiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_quiz.my_interface.IClickUserListener;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private ArrayList<User> users;
    private IClickUserListener iClickUserListener;

    public UserAdapter(ArrayList<User> users, IClickUserListener iClickUserListener) {
        this.users = users;
        this.iClickUserListener = iClickUserListener;
    }


    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        final User user = users.get(position);
        holder.user_name.setText(user.getName());
        holder.user_img.setImageResource(user.getImg());
        holder.user_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iClickUserListener.onClickUser(user);
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        CardView user_layout;
        ImageView user_img;
        TextView user_name;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            user_layout = itemView.findViewById(R.id.user_layout);
            user_img = itemView.findViewById(R.id.user_img);
            user_name = itemView.findViewById(R.id.user_name);
        }
    }
}
