package com.example.likhi.fiirebaseapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Studentadapter extends RecyclerView.Adapter<Studentadapter.MyViewHolder> {
    Context context;
    ArrayList<Model> models;

    public Studentadapter(MainActivity mainActivity, ArrayList<Model> studentmodels) {
        this.context= mainActivity;
        this.models=studentmodels;
    }

    @NonNull
    @Override

    public Studentadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Studentadapter.MyViewHolder holder, int position) {
        Model amodel =models.get(position);
        holder.t1.setText(amodel.getSroll());
        holder.t2.setText(amodel.getName());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.txtv1);
            t2=itemView.findViewById(R.id.txtv2);


        }
    }
}
