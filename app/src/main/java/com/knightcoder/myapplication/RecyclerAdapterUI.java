package com.knightcoder.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterUI extends RecyclerView.Adapter<RecyclerAdapterUI.MyViewHolder> {
    private Context context;
    private List<Data> mList;

    public RecyclerAdapterUI(Context context, List<Data> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);
        return new  MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Data currentItem=mList.get(position);

        holder.catNameTxt.setText(currentItem.getCategoryName());
        holder.caloriesTxt.setText(currentItem.getCalories());
        holder.proteinsTxt.setText(currentItem.getProteins());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView catNameTxt, proteinsTxt, caloriesTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            catNameTxt=itemView.findViewById(R.id.cat_text);
            proteinsTxt=itemView.findViewById(R.id.pro_text);
            caloriesTxt=itemView.findViewById(R.id.cal_text);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Data item= mList.get(getAdapterPosition());
            Intent intent=new Intent(context,NextActivity.class);
            intent.putExtra("name",item.getCategoryName());
            context.startActivity(intent);

        }
    }
}
