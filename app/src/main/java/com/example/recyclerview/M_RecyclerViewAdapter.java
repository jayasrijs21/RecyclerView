package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class M_RecyclerViewAdapter extends RecyclerView.Adapter<M_RecyclerViewAdapter.MyViewHolder> {

    Context context;  //needed for inflating layout
    ArrayList<MetalsModel> metalsModels;  //to hold all models

    public M_RecyclerViewAdapter(Context context, ArrayList<MetalsModel> metalsModels) {

        this.context = context;
        this.metalsModels = metalsModels;  //constructors to get values
    }


    @NonNull
    @Override
    public M_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
// layout for each of our rows
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyler_view_row, parent, false);

        return new M_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull M_RecyclerViewAdapter.MyViewHolder holder, int position) {
        //assigning values to the views we created in the recyler_view_row layout file
        //based on the position of recyclerview
        holder.tvSci.setText(metalsModels.get(position).getScientificName());
        holder.tvMet.setText(metalsModels.get(position).getMetalsName());
        holder.tvSym.setText(metalsModels.get(position).getSymbols());
        holder.imageView.setImageResource(metalsModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        //just the no. items that needs to be displayed
        return metalsModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
      //this class is pretty much like onCreate
        ImageView imageView;
        TextView tvSci, tvMet,tvSym;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvSci = itemView.findViewById(R.id.textView);
            tvMet = itemView.findViewById(R.id.textView1);
            tvSym = itemView.findViewById(R.id.textView2);


        }
    }
}
