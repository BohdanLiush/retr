package com.example.bohdan.retr;

import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
  Created by bohdan on 16.03.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<TankOnline> tanks;

    public RecyclerAdapter(List<TankOnline> tanks){
        this.tanks = tanks;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return tanks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, armor, endurance;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
        }
    }
}
