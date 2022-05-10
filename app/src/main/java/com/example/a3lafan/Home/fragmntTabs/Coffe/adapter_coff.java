package com.example.a3lafan.Home.fragmntTabs.Coffe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a3lafan.Home.fragmntTabs.Coffe.coff_model;
import com.example.a3lafan.R;
import com.example.a3lafan.iitemsCoffe.alfshawyActivity;
import com.example.a3lafan.iitemsCoffe.costaActivity;
import com.example.a3lafan.iitemsCoffe.districtActivity;
import com.example.a3lafan.iitemsCoffe.groppiActivity;
import com.example.a3lafan.iitemsCoffe.inchtainActivity;
import com.example.a3lafan.iitemsCoffe.orasActivity;
import com.example.a3lafan.iitemsCoffe.potrenActivity;
import com.example.a3lafan.iitemsCoffe.starbucksActivity;
import com.example.a3lafan.iitemsCoffe.tolaActivity;

import java.util.ArrayList;

public class adapter_coff extends RecyclerView.Adapter<adapter_coff.VH>{
    ArrayList<coff_model>mlist;
    Context context;

    public adapter_coff(ArrayList<coff_model> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.coffe_item,parent,false);
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
                    Intent i=new Intent(context,orasActivity.class);
                    context.startActivity(i);
                }
                else if (position==1){
                    Intent i=new Intent(context, districtActivity.class);
                    context.startActivity(i);
                }
                else if (position==2){
                    Intent i=new Intent(context, starbucksActivity.class);
                    context.startActivity(i);
                }
                else if (position==3){
                    Intent i=new Intent(context, costaActivity.class);
                    context.startActivity(i);
                }
                else if (position==4){
                    Intent i=new Intent(context, inchtainActivity.class);
                    context.startActivity(i);
                }
                else if (position==5){
                    Intent i=new Intent(context, tolaActivity.class);
                    context.startActivity(i);
                }
                else if (position==6){
                    Intent i=new Intent(context, groppiActivity.class);
                    context.startActivity(i);
                }
                else if (position==7){
                    Intent i=new Intent(context, alfshawyActivity.class);
                    context.startActivity(i);
                }
                else if (position==8){
                    Intent i=new Intent(context, potrenActivity.class);
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        ImageView mimg;
        TextView mtext;
        public VH(@NonNull View itemView) {
            super(itemView);
            mimg=itemView.findViewById(R.id.coffe_img);
            mtext=itemView.findViewById(R.id.tex_coffe);
        }
    }
}
