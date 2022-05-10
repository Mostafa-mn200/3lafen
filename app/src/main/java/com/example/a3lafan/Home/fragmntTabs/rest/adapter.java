package com.example.a3lafan.Home.fragmntTabs.rest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.a3lafan.R;
import com.example.a3lafan.iitemsCoffe.orasActivity;
import com.example.a3lafan.itemsResturant.AboTarkActivity;
import com.example.a3lafan.itemsResturant.HadramotAntaActivity;
import com.example.a3lafan.itemsResturant.HamzaActivity;
import com.example.a3lafan.itemsResturant.PrinceActivity;
import com.example.a3lafan.itemsResturant.SobhiKaberActivity;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.VH>{

    ArrayList<model>mlist;
    Context context;

    public adapter(ArrayList<model> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_item_layout,parent,false);
        VH hv=new VH(view);
        return hv;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, final int position) {
        holder.mimg.setImageResource(mlist.get(position).getImg());
        holder.mtext.setText(mlist.get(position).getText());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i=new Intent(context, AboTarkActivity.class);
                    context.startActivity(i);
                }
                else if (position==1){
                    Intent i=new Intent(context, SobhiKaberActivity.class);
                    context.startActivity(i);
                }
                else if (position==2){
                    Intent i=new Intent(context, PrinceActivity.class);
                    context.startActivity(i);
                }
                else if (position==3){
                    Intent i=new Intent(context, HadramotAntaActivity.class);
                    context.startActivity(i);
                }
                else if (position==4){
                    Intent i=new Intent(context, HamzaActivity.class);
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        ImageView mimg;
        TextView mtext;
        public VH(@NonNull View itemView) {
            super(itemView);
            mimg=itemView.findViewById(R.id.resturant_img);
            mtext=itemView.findViewById(R.id.resturant_name);
        }
    }
}
