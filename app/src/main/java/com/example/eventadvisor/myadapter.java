package com.example.eventadvisor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder> {

    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {
        holder.name_item.setText(model.getTitre());
        holder.description_item.setText(model.getDescription1());
        Glide.with(holder.image_item.getContext()).load(model.getImage()).into(holder.image_item);//ICI
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical_sport, parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder{

        ImageView image_item;
        TextView name_item,description_item;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            image_item=itemView.findViewById(R.id.image_item);
            name_item=itemView.findViewById(R.id.name_item);
            description_item=itemView.findViewById(R.id.description_item);
        }
    }
}
