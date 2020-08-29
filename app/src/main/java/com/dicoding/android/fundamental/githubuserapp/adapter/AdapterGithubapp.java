package com.dicoding.android.fundamental.githubuserapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.android.fundamental.githubuserapp.R;
import com.dicoding.android.fundamental.githubuserapp.activity.DetailUser;
import com.dicoding.android.fundamental.githubuserapp.pojo.Pojogithub;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterGithubapp extends RecyclerView.Adapter<AdapterGithubapp.ViewHolder> {

    Context context;
    ArrayList<Pojogithub> dataModelUser;


    public AdapterGithubapp(Context context, ArrayList<Pojogithub> dataModelUser) {
        this.context = context;
        this.dataModelUser = dataModelUser;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_github, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailUser.class);
                intent.putExtra("extra_github",dataModelUser.get(position));
                Toast.makeText(holder.constraintLayout.getContext(),"kamu memilih user "+dataModelUser.get(holder.getAdapterPosition()).getUsername(),Toast.LENGTH_LONG).show();
                context.startActivity(intent);
            }
        });
        holder.setData(dataModelUser.get(position));

    }

    @Override
    public int getItemCount() {
        return dataModelUser.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView ivprofil;
        TextView usernamelist;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivprofil = itemView.findViewById(R.id.ivImage);
            usernamelist = itemView.findViewById(R.id.tvusernamelist);
            constraintLayout = itemView.findViewById(R.id.cllistprofilegithub);
        }

        public void setData(Pojogithub data){
            ivprofil.setImageResource(data.getIvprofil());
            usernamelist.setText(data.getUsername());

        }
    }
}
